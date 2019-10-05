package edu201909.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu201909.spring.domain.EmpInfo;
import edu201909.spring.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<EmpInfo> getEmpList() {
		return empService.getEmpList();
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String turnToIndex(ModelMap modelmap) {
		List<EmpInfo> list=empService.getEmpList();
		modelmap.put("list",list);
		return "emplist";
	}
	
	
}
