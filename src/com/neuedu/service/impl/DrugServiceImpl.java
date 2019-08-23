package com.neuedu.service.impl;

import java.util.List;

import com.neuedu.service.DrugService;
import com.neuedu.pojo.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.neuedu.mapper.*;

//药品类业务接口实现类
@Service
public class DrugServiceImpl implements DrugService{
	@Resource
	DrugsMapper drugsMapper;
	
    @Resource
    ConstantitemMapper constantItemsMapper;
	
	
	@Override
	public List<Drugs> getDrugsByMnemoniccode(String mnemoniccode) {
		// TODO Auto-generated method stub
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andMnemoniccodeLike('%'+mnemoniccode+'%');
        return drugsMapper.selectByExample(drugsExample);
	}

	@Override
	public Drugs getDrugsById(Integer id) {
		// TODO Auto-generated method stub
		return drugsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Drugs drugs=drugsMapper.selectByPrimaryKey(id);
		drugs.setDelmark(0);
		drugsMapper.updateByPrimaryKeySelective(drugs);    
	}


	@Override
    public Integer insertSelective(Drugs drugs) {
    	// TODO Auto-generated method stub
        drugsMapper.insertSelective(drugs);
        Integer num=(int)drugsMapper.countByExample(null);
        drugs.setId(num);
        return drugs.getId();
        
    }

	@Override
	public List<Drugs> getAllDrugs() {
		// TODO Auto-generated method stub
		DrugsExample drugsExample = new DrugsExample();
        return drugsMapper.selectByExample(drugsExample);
	}

	@Override
	public void update(Drugs drugs) {
		// TODO Auto-generated method stub
		drugsMapper.updateByPrimaryKey(drugs);
	}


	
}
