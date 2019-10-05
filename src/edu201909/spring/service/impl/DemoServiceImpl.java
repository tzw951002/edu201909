package edu201909.spring.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;

import edu201909.MathUnit;
import edu201909.spring.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	@Override
	public Map<String, Integer> ten2binary(Integer n) {
		Map<String,Integer> result=Maps.newHashMap();
		result.put("ten_number",n);
		
		result.put("binary_number", Integer.parseInt(MathUnit.ten2Binary(n)));
		return result;
	}

}
