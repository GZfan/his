package com.neuedu.service.impl;

import java.util.List;

import com.neuedu.pojo.Rule;
import com.neuedu.pojo.RuleExample;
import com.neuedu.pojo.Scheduling;
import com.neuedu.mapper.RuleMapper;
import com.neuedu.mapper.SchedulingMapper;
import com.neuedu.service.SchedulingService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SchedulingServiceImpl implements SchedulingService{

	@Resource
	SchedulingMapper schedulingInfoMapper;
	
	@Resource
	RuleMapper schedulingRuleMapper;

	@Override
	public Integer insertRule(Rule rule) {
		
		schedulingRuleMapper.insert(rule);
		Integer num=(int)schedulingRuleMapper.countByExample(null);
		rule.setId(num);
		return rule.getId();
	}

	@Override
	public void deleteRuleById(Integer id) {
		
		Rule rule=schedulingRuleMapper.selectByPrimaryKey(id);
		rule.setDelmark(0);
		schedulingRuleMapper.updateByPrimaryKeySelective(rule);
	}

	@Override
	public Rule getSchedulingRuleById(Integer id) {
		
		return schedulingRuleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Rule> getAllSchedulingRule() {
		
		RuleExample ruleExample=new RuleExample();
		RuleExample.Criteria criteria = ruleExample.createCriteria();
		
		return schedulingRuleMapper.selectByExample(ruleExample);
	}
	
	
	

}
