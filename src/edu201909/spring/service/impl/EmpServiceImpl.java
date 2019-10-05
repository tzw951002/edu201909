package edu201909.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu201909.spring.domain.EmpInfo;
import edu201909.spring.model.mapper.EmpMapper;
import edu201909.spring.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<EmpInfo> getEmpList(){
		return empMapper.getEmpList();
	}
}
