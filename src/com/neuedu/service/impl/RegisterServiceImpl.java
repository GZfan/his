package com.neuedu.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.neuedu.mapper.ChargedMapper;
import com.neuedu.mapper.CheckapplyMapper;
import com.neuedu.mapper.ConstantitemMapper;
import com.neuedu.mapper.HerbalprescriptionMapper;
import com.neuedu.mapper.InvoiceMapper;
import com.neuedu.mapper.PatientcostsMapper;
import com.neuedu.mapper.PrescriptiondetailedMapper;
import com.neuedu.mapper.RegisterMapper;
import com.neuedu.mapper.RegistlevelMapper;
import com.neuedu.mapper.RegistworkMapper;
import com.neuedu.mapper.UnchargeMapper;
import com.neuedu.pojo.ChargeList;
import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import com.neuedu.pojo.HerbalPack;
import com.neuedu.pojo.Herbalprescription;
import com.neuedu.pojo.HerbalprescriptionExample;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.InvoiceExample;
import com.neuedu.pojo.Patientcosts;
import com.neuedu.pojo.PatientcostsExample;
import com.neuedu.pojo.PrescriptionPack;
import com.neuedu.pojo.Prescriptiondetailed;
import com.neuedu.pojo.PrescriptiondetailedExample;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.RegisterExample;
import com.neuedu.pojo.RegisterExample.Criteria;
import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.Registwork;
import com.neuedu.pojo.RegistworkExample;
import com.neuedu.pojo.RegistworkExample.Criterion;
import com.neuedu.pojo.UnchargeItems;
import com.neuedu.pojo.User;
import com.neuedu.service.RegisterService;
import com.neuedu.util.GetDate;


@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterMapper registerMapper;
	
	@Autowired
	ConstantitemMapper constantItemMapper;
	
	@Autowired
	InvoiceMapper invoiceMapper;
	
	@Autowired
	PatientcostsMapper paintCostMapper;
	
	@Autowired
	RegistlevelMapper levelMapper;
	
	@Autowired
	UnchargeMapper UnchargeMapper;
	
	@Autowired
	ChargedMapper chargedMapper;
	
	@Autowired
	CheckapplyMapper checkapplyMapper;
	
	@Autowired
	PrescriptiondetailedMapper prescriptiondetailedMapper;
	
	@Autowired
	HerbalprescriptionMapper herbalprescriptionMapper;
	
	@Autowired
	RegistworkMapper registworkMapper;
	
	@Override
	public void addRegister(Register register,User user) {
		register.setRegisterid(user.getId());;
		registerMapper.insertSelective(register);
		int registerId=register.getId();
		Patientcosts cost=new Patientcosts(); 
		Invoice invoice=new Invoice();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(new Date());
		try {
			Date now =df.parse(date);;
			cost.setCreatetime(now);
			cost.setPaytime(now);
			invoice.setCreationtime(now);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//开发票
		invoice.setInvoicenum(UUID.randomUUID().toString());
		Registlevel registlevel=levelMapper.selectByPrimaryKey(register.getRegistleid());
		BigDecimal price=registlevel.getRegistfee();
		if("1".equals(register.getIsbook())) {
			price=price.add(new BigDecimal(1));
		}
		invoice.setMoney(price);
		invoice.setState(4);
		invoice.setRegistid(registerId);
		invoice.setDailystate(0);
		invoice.setUserid(register.getRegisterid());
		//TODO
		invoice.setFeetype(51);
		
		invoiceMapper.insertSelective(invoice);
		int invoiceId=invoice.getId();
		//患者费用明细表
		cost.setRegistid(registerId);
		cost.setInvoiceid(invoiceId);
		cost.setItemid(1);
		cost.setItemtype(1);
		cost.setName("挂号费");
		cost.setAmount(new BigDecimal(1));
		cost.setPrice(price);
		cost.setDeptid(register.getDeptid());
		cost.setRegisterid(register.getRegisterid());
		cost.setCreateoperid(register.getRegisterid());
		
		//TODO
		cost.setFeetype(51);
		
		paintCostMapper.insertSelective(cost);
	}

	@Override
	public void deleteRegisterById(Integer id) {
		registerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateRegister(Register register) {
		registerMapper.updateByPrimaryKey(register);
	}

	@Override
	public List<Register> getRegisterByCaseNumber(String  caseNumber) {
		RegisterExample example=new RegisterExample();
		Criteria criteria=example.createCriteria();
		criteria.andCasenumberEqualTo(caseNumber);
		example.setOrderByClause("VisitDate DESC");
		List<Register> list= registerMapper.selectByExample(example);
		return list;
	}

	@Override
	public UnchargeItems getUnchargeItems(Integer registID) {
		UnchargeItems unchargeItems=new UnchargeItems();
		unchargeItems.setCheckapplies(UnchargeMapper.getCheckappliesByRegistID(registID));
		unchargeItems.setPrescriptionPacks(UnchargeMapper.getPrescriptionPacksByRegistID(registID));
		unchargeItems.setHerbalPacks(UnchargeMapper.getHerbalPacksByRegistID(registID));
		return unchargeItems;
	}
	@Override
	public void charge(ChargeList items,User user) {
		
		List<Integer> checkapplys=items.getCheckapply();
		List<Integer> herbal=items.getHerbal();
		List<Integer> prescription=items.getPrescription();
		List<CheckPack> checkPacks=null;
		List<HerbalPack> herbalPacks=null;
		List<PrescriptionPack> prescriptiondetaileds=null;
		float price=0;
		Date now=GetDate.getCurrDate();
		int userID=user.getId();
		//更改状态,把要交费的有关项目查询出来
		if(checkapplys.size()!=0) {
			Checkapply checkapply=new Checkapply();
			checkapply.setState(3);
			CheckapplyExample checkapplyExample=new CheckapplyExample();
			com.neuedu.pojo.CheckapplyExample.Criteria checkapplyCriteria=checkapplyExample.createCriteria();
			checkapplyCriteria.andIdIn(checkapplys);
			checkapplyMapper.updateByExampleSelective(checkapply, checkapplyExample);
			checkPacks=UnchargeMapper.getCheckappliesByID(checkapplys);
		}
		if(herbal.size()!=0) {
			Herbalprescription herbalprescription=new Herbalprescription();
			herbalprescription.setState(3);
			HerbalprescriptionExample herbalprescriptionExample=new HerbalprescriptionExample();
			com.neuedu.pojo.HerbalprescriptionExample.Criteria herbalCriteria=herbalprescriptionExample.createCriteria();
			herbalCriteria.andIdIn(herbal);
			herbalprescriptionMapper.updateByExampleSelective(herbalprescription, herbalprescriptionExample);
			herbalPacks=UnchargeMapper.getHerbalPacksByID(herbal);
		}
		if(prescription.size()!=0) {
			Prescriptiondetailed prescriptiondetailed=new Prescriptiondetailed();
			prescriptiondetailed.setState(3);
			PrescriptiondetailedExample prescriptiondetailedExample=new PrescriptiondetailedExample();
			com.neuedu.pojo.PrescriptiondetailedExample.Criteria preCriteria=prescriptiondetailedExample.createCriteria();
			preCriteria.andIdIn(prescription);
			prescriptiondetailedMapper.updateByExampleSelective(prescriptiondetailed, prescriptiondetailedExample);
			prescriptiondetaileds=UnchargeMapper.getPrescriptionPacksByID(prescription);
		}
		//获取registID
		int registID=0;
		if(checkPacks!=null) {
			registID=checkPacks.get(0).getCheckapply().getRegistid();
		} else if(herbalPacks!=null) {
			registID=herbalPacks.get(0).getHerbalprescription().getRegistid();
		} else {
			registID=prescriptiondetaileds.get(0).getPrescription().getRegistid();
		}
		//算金额
		for(CheckPack item:checkPacks){
			price+=item.getCheckapply().getNum()*(item.getFmeditem().getPrice().floatValue());
		}
		for(HerbalPack item:herbalPacks) {
			price+=item.getHerbalprescription().getPaynumber()*(item.getHerbaldetailed().getPrice().floatValue());
		}
		for(PrescriptionPack item:prescriptiondetaileds) {
			price+=item.getPrescriptiondetailed().getAmount().floatValue()*(item.getDrugs().getDrugsprice().floatValue());
		}
		//开发票
		Invoice invoice=new Invoice();
		invoice.setInvoicenum(UUID.randomUUID().toString());
		invoice.setMoney(new BigDecimal(price));
		invoice.setState(4);
		invoice.setCreationtime(now);
		invoice.setDailystate(0);
		invoice.setRegistid(registID);
		invoice.setUserid(userID);
		//TODO
		invoice.setFeetype(51);
		
		invoiceMapper.insertSelective(invoice);
		int invoiceId=invoice.getId();
		
		//填患者费用明细表,将相应项目的状态该为已收费
		for(CheckPack item:checkPacks){
			Patientcosts cost=new Patientcosts(); 
			Checkapply temp1=item.getCheckapply();
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(temp1.getItemid());
			cost.setItemtype(1);
			cost.setName(item.getFmeditem().getItemname());
			cost.setPrice(item.getFmeditem().getPrice());
			cost.setAmount(new BigDecimal(temp1.getNum()));
			cost.setDeptid(item.getFmeditem().getDeptid());
			cost.setCreatetime(now);
			cost.setCreateoperid(temp1.getDoctorid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
		}
		for(HerbalPack item:herbalPacks) {
			Patientcosts cost=new Patientcosts(); 
			Herbalprescription hp=item.getHerbalprescription();
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(item.getDrugs().getId());
			cost.setItemtype(2);
			cost.setName(item.getDrugs().getDrugsname());
			cost.setPrice(item.getHerbaldetailed().getPrice());
			cost.setAmount(new BigDecimal(hp.getPaynumber()));
			cost.setDeptid(132);
			cost.setCreatetime(now);
			cost.setCreateoperid(hp.getUserid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
		}
		for(PrescriptionPack item:prescriptiondetaileds) {
			Patientcosts cost=new Patientcosts(); 
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(item.getDrugs().getId());
			cost.setItemtype(2);
			cost.setName(item.getDrugs().getDrugsname());
			cost.setPrice(item.getDrugs().getDrugsprice());
			cost.setAmount(item.getPrescriptiondetailed().getAmount());
			cost.setDeptid(132);
			cost.setCreatetime(now);
			cost.setCreateoperid(item.getPrescription().getUserid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
		}
	}
	@Override
	public void withdraw(int id,User user) {
		Date nowDate=GetDate.getCurrDate();
		int userid=user.getId();
		
		//修改挂号表信息
		Register register=new Register();
		register.setId(id);
		register.setVisitstate(4);
		registerMapper.updateByPrimaryKeySelective(register);
		
		//获取挂号发票信息
		PatientcostsExample patientcostsExample=new PatientcostsExample();
		com.neuedu.pojo.PatientcostsExample.Criteria pCriteria=patientcostsExample.createCriteria();
		pCriteria.andRegistidEqualTo(id);
		pCriteria.andNameEqualTo("挂号费");
		Patientcosts oldpatientcosts=paintCostMapper.selectByExample(patientcostsExample).get(0);
		Invoice oldinvoice=invoiceMapper.selectByPrimaryKey(oldpatientcosts.getInvoiceid());
		
		//新发票
		Invoice newInvoice=new Invoice();
		newInvoice.setInvoicenum(UUID.randomUUID().toString());
		newInvoice.setMoney(oldinvoice.getMoney().negate());
		newInvoice.setState(7);
		newInvoice.setCreationtime(nowDate);
		//TODO
		newInvoice.setUserid(userid);
		newInvoice.setRegistid(oldinvoice.getRegistid());
		newInvoice.setFeetype(oldinvoice.getFeetype());
		newInvoice.setDailystate(0);
		invoiceMapper.insertSelective(newInvoice);
		
		//更改挂号发票，写冲红发票号码
		oldinvoice.setBack(newInvoice.getInvoicenum());
		invoiceMapper.updateByPrimaryKeySelective(oldinvoice);
		
		//收费明细
		Patientcosts newpatientcosts=new Patientcosts();
		newpatientcosts.setRegistid(oldpatientcosts.getRegistid());
		newpatientcosts.setInvoiceid(newInvoice.getId());
		newpatientcosts.setItemid(oldpatientcosts.getItemid());
		newpatientcosts.setItemtype(oldpatientcosts.getItemtype());
		newpatientcosts.setName(oldpatientcosts.getName());
		newpatientcosts.setPrice(oldpatientcosts.getPrice());
		newpatientcosts.setAmount(oldpatientcosts.getAmount().negate());
		newpatientcosts.setDeptid(oldpatientcosts.getDeptid());
		newpatientcosts.setCreatetime(nowDate);
		newpatientcosts.setCreateoperid(userid);
		newpatientcosts.setPaytime(nowDate);
		newpatientcosts.setRegisterid(userid);
		newpatientcosts.setFeetype(oldpatientcosts.getFeetype());
		paintCostMapper.insertSelective(newpatientcosts);
		
		oldpatientcosts.setBackid(newpatientcosts.getId());
		paintCostMapper.updateByPrimaryKeySelective(oldpatientcosts);
		
	}

	@Override
	public UnchargeItems getWithdrawableItems(Integer registID) {
		UnchargeItems unchargeItems=new UnchargeItems();
		unchargeItems.setCheckapplies(chargedMapper.getCheckappliesByRegistID(registID));
		unchargeItems.setPrescriptionPacks(chargedMapper.getPrescriptionPacksByRegistID(registID));
		unchargeItems.setHerbalPacks(chargedMapper.getHerbalPacksByRegistID(registID));
		return unchargeItems;
	}

	@Override
	public void refund(ChargeList items,User user) {
		List<Integer> checkapplys=items.getCheckapply();
		List<Integer> herbal=items.getHerbal();
		List<Integer> prescription=items.getPrescription();
		List<CheckPack> checkPacks=null;
		List<HerbalPack> herbalPacks=null;
		List<PrescriptionPack> prescriptiondetaileds=null;
		Date now=GetDate.getCurrDate();
		float price=0;
		int userID=user.getId();
		//更改状态,把要退费的有关项目查询出来
		if(checkapplys.size()!=0) {
			Checkapply checkapply=new Checkapply();
			checkapply.setState(6);
			CheckapplyExample checkapplyExample=new CheckapplyExample();
			com.neuedu.pojo.CheckapplyExample.Criteria checkapplyCriteria=checkapplyExample.createCriteria();
			checkapplyCriteria.andIdIn(checkapplys);
			checkapplyMapper.updateByExampleSelective(checkapply, checkapplyExample);
			checkPacks=UnchargeMapper.getCheckappliesByID(checkapplys);
		}
		if(herbal.size()!=0) {
			Herbalprescription herbalprescription=new Herbalprescription();
			herbalprescription.setState(6);
			HerbalprescriptionExample herbalprescriptionExample=new HerbalprescriptionExample();
			com.neuedu.pojo.HerbalprescriptionExample.Criteria herbalCriteria=herbalprescriptionExample.createCriteria();
			herbalCriteria.andIdIn(herbal);
			herbalprescriptionMapper.updateByExampleSelective(herbalprescription, herbalprescriptionExample);
			herbalPacks=UnchargeMapper.getHerbalPacksByID(herbal);
		}
		if(prescription.size()!=0) {
			Prescriptiondetailed prescriptiondetailed=new Prescriptiondetailed();
			prescriptiondetailed.setState(6);
			PrescriptiondetailedExample prescriptiondetailedExample=new PrescriptiondetailedExample();
			com.neuedu.pojo.PrescriptiondetailedExample.Criteria preCriteria=prescriptiondetailedExample.createCriteria();
			preCriteria.andIdIn(prescription);
			prescriptiondetailedMapper.updateByExampleSelective(prescriptiondetailed, prescriptiondetailedExample);
			prescriptiondetaileds=UnchargeMapper.getPrescriptionPacksByID(prescription);
		}
		//获取registID
		int registID=0;
		if(checkPacks!=null) {
			registID=checkPacks.get(0).getCheckapply().getRegistid();
		} else if(herbalPacks!=null) {
			registID=herbalPacks.get(0).getHerbalprescription().getRegistid();
		} else {
			registID=prescriptiondetaileds.get(0).getPrescription().getRegistid();
		}
		//算金额
		for(CheckPack item:checkPacks){
			price+=item.getCheckapply().getNum()*(item.getFmeditem().getPrice().floatValue());
		}
		for(HerbalPack item:herbalPacks) {
			price+=item.getHerbalprescription().getPaynumber()*(item.getHerbaldetailed().getPrice().floatValue());
		}
		for(PrescriptionPack item:prescriptiondetaileds) {
			price+=item.getPrescriptiondetailed().getAmount().floatValue()*(item.getDrugs().getDrugsprice().floatValue());
		}
		//开冲红发票
		Invoice invoice=new Invoice();
		invoice.setInvoicenum(UUID.randomUUID().toString());
		invoice.setMoney(new BigDecimal(0-price));
		invoice.setState(7);
		invoice.setCreationtime(now);
		invoice.setDailystate(0);
		invoice.setRegistid(registID);
		invoice.setUserid(userID);
		//TODO
		invoice.setFeetype(51);
		
		invoiceMapper.insertSelective(invoice);
		int invoiceId=invoice.getId();
		
		//填患者费用明细表
		for(CheckPack item:checkPacks){
			PatientcostsExample example=new PatientcostsExample();
			com.neuedu.pojo.PatientcostsExample.Criteria criteria=example.createCriteria();
			criteria.andRegistidEqualTo(registID);
			criteria.andNameEqualTo(item.getFmeditem().getItemname());
			Patientcosts old=paintCostMapper.selectByExample(example).get(0);
			
			Patientcosts cost=new Patientcosts(); 
			Checkapply temp1=item.getCheckapply();
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(temp1.getItemid());
			cost.setItemtype(1);
			cost.setName(item.getFmeditem().getItemname());
			cost.setPrice(item.getFmeditem().getPrice());
			cost.setAmount(new BigDecimal(0-temp1.getNum()));
			cost.setDeptid(item.getFmeditem().getDeptid());
			cost.setCreatetime(now);
			cost.setCreateoperid(temp1.getDoctorid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
			old.setBackid(cost.getId());
			paintCostMapper.updateByPrimaryKeySelective(old);
			
		}
		for(HerbalPack item:herbalPacks) {
			PatientcostsExample example=new PatientcostsExample();
			com.neuedu.pojo.PatientcostsExample.Criteria criteria=example.createCriteria();
			criteria.andRegistidEqualTo(registID);
			criteria.andNameEqualTo(item.getDrugs().getDrugsname());
			Patientcosts old=paintCostMapper.selectByExample(example).get(0);
			
			Patientcosts cost=new Patientcosts(); 
			Herbalprescription hp=item.getHerbalprescription();
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(item.getDrugs().getId());
			cost.setItemtype(2);
			cost.setName(item.getDrugs().getDrugsname());
			cost.setPrice(item.getHerbaldetailed().getPrice());
			cost.setAmount(new BigDecimal(0-hp.getPaynumber()));
			cost.setDeptid(132);
			cost.setCreatetime(now);
			cost.setCreateoperid(hp.getUserid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
			old.setBackid(cost.getId());
			paintCostMapper.updateByPrimaryKeySelective(old);
		}
		for(PrescriptionPack item:prescriptiondetaileds) {
			PatientcostsExample example=new PatientcostsExample();
			com.neuedu.pojo.PatientcostsExample.Criteria criteria=example.createCriteria();
			criteria.andRegistidEqualTo(registID);
			criteria.andNameEqualTo(item.getDrugs().getDrugsname());
			Patientcosts old=paintCostMapper.selectByExample(example).get(0);
			
			Patientcosts cost=new Patientcosts(); 
			cost.setRegistid(registID);
			cost.setInvoiceid(invoiceId);
			cost.setItemid(item.getDrugs().getId());
			cost.setItemtype(2);
			cost.setName(item.getDrugs().getDrugsname());
			cost.setPrice(item.getDrugs().getDrugsprice());
			cost.setAmount(item.getPrescriptiondetailed().getAmount().negate());
			cost.setDeptid(132);
			cost.setCreatetime(now);
			cost.setCreateoperid(item.getPrescription().getUserid());
			cost.setPaytime(now);
			cost.setRegisterid(userID);
			cost.setFeetype(51);
			paintCostMapper.insertSelective(cost);
			
			old.setBackid(cost.getId());
			paintCostMapper.updateByPrimaryKeySelective(old);
		}
		
	}

	@Override
	public List<Invoice> getInvoicesByCaseNumber(String CaseNumber,int state) {
		RegisterExample registerExample=new RegisterExample();
		registerExample.setOrderByClause("VisitDate DESC");
		Criteria criteria=registerExample.createCriteria();
		criteria.andCasenumberEqualTo(CaseNumber);
		Register register=registerMapper.selectByExample(registerExample).get(0);
		
		InvoiceExample invoiceExample=new InvoiceExample();
		com.neuedu.pojo.InvoiceExample.Criteria invoiceCriteria=invoiceExample.createCriteria();
		invoiceCriteria.andRegistidEqualTo(register.getId());
		invoiceCriteria.andStateEqualTo(state);
		List<Invoice> list=invoiceMapper.selectByExample(invoiceExample);
		return list;
	}

	@Override
	public void rePrintInvoice(List<Integer> list) {
		Invoice invoice=new Invoice();
		invoice.setState(4);
		InvoiceExample example=new InvoiceExample();
		example.createCriteria().andIdIn(list);
		invoiceMapper.updateByExampleSelective(invoice, example);
	}

	@Override
	public void printInvoiceAgain(int id) {
		Invoice oldInvoice=invoiceMapper.selectByPrimaryKey(id);
		Invoice pos=new Invoice();
		Invoice neg=new Invoice();
		
		pos.setInvoicenum(UUID.randomUUID().toString());
		neg.setInvoicenum(UUID.randomUUID().toString());
		pos.setMoney(oldInvoice.getMoney());
		neg.setMoney(oldInvoice.getMoney().negate());
		pos.setState(4);
		neg.setState(7);
		pos.setCreationtime(oldInvoice.getCreationtime());
		neg.setCreationtime(oldInvoice.getCreationtime());
		pos.setUserid(oldInvoice.getUserid());
		neg.setUserid(oldInvoice.getUserid());
		pos.setRegistid(oldInvoice.getRegistid());
		neg.setRegistid(oldInvoice.getRegistid());
		pos.setFeetype(oldInvoice.getFeetype());
		neg.setFeetype(oldInvoice.getFeetype());
		pos.setDailystate(0);
		neg.setDailystate(0);
		invoiceMapper.insertSelective(pos);
		invoiceMapper.insertSelective(neg);
		oldInvoice.setBack(neg.getInvoicenum());
		oldInvoice.setState(2);
		invoiceMapper.updateByPrimaryKeySelective(oldInvoice);
	}

	
	@Override
	public Date getDailySettleAccountStartTime(User user) {
		RegistworkExample registworkExample=new RegistworkExample();
		com.neuedu.pojo.RegistworkExample.Criteria criteria=registworkExample.createCriteria();
		criteria.andRegisteridEqualTo(user.getId());
		registworkExample.setOrderByClause("ID DESC");
		List<Registwork> list=registworkMapper.selectByExample(registworkExample);
		return list.get(0).getEndtime();
	}
	
	
}
