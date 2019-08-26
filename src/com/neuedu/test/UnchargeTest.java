package com.neuedu.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.mapper.UnchargeMapper;
import com.neuedu.pojo.ChargeList;
import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.HerbalPack;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.PrescriptionPack;
import com.neuedu.pojo.UnchargeItems;
import com.neuedu.service.RegisterService;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class UnchargeTest extends BaseTest {

	@Autowired
	private UnchargeMapper unchargeMapper;
	
	@Autowired
	private RegisterService registerservice;
	
	
	//@Test
	public void getUnchargeItemsTest() {
		UnchargeItems items=registerservice.getUnchargeItems(32);
		return;
	}
	//@Test
	public void unchargeMapperTest() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(31);
		list.add(32);
		List<CheckPack> list1=unchargeMapper.getCheckappliesByID(list);
		list.clear();
		list.add(1);
		list.add(2);
		List<HerbalPack> list2=unchargeMapper.getHerbalPacksByID(list);
		List<PrescriptionPack> list3=unchargeMapper.getPrescriptionPacksByID(list);
		return ;
	}
	//@Test
	public void chargeTest() {
		ChargeList chargeList=new ChargeList();
		ArrayList<Integer> checkapply=new ArrayList<Integer>();
		checkapply.add(25);
		checkapply.add(26);
		chargeList.setCheckapply(checkapply);
		ArrayList<Integer> herbal=new ArrayList<Integer>();
		herbal.add(1);
		herbal.add(2);
		chargeList.setHerbal(herbal);
		chargeList.setPrescription(herbal);
		//registerservice.charge(chargeList);
		return ;
	}
	
	//@Test
	public void withdrawTest() {
		//registerservice.withdraw(45);
		return;
	}
	@Test
	public void getchargeItemsTest() {
		//UnchargeItems items=registerservice.getWithdrawableItems(33);
		registerservice.printInvoiceAgain(149);
		return;
	}
	
	//@Test
	public void refundTest() {
		ChargeList chargeList=new ChargeList();
		ArrayList<Integer> checkapply=new ArrayList<Integer>();
		checkapply.add(25);
		chargeList.setCheckapply(checkapply);
		ArrayList<Integer> herbal=new ArrayList<Integer>();
		herbal.add(1);
		herbal.add(2);
		chargeList.setHerbal(herbal);
		chargeList.setPrescription(herbal);
		//registerservice.refund(chargeList);
		return ;
	}
	//@Test
	public void getInvoiceByCaseNumber() {
		//List<Invoice> list=registerservice.getInvoicesByCaseNumber("12345678");
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(148);
		list.add(149);
		registerservice.rePrintInvoice(list);
		return;
	}
	
}
