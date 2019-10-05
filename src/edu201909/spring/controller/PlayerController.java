package edu201909.spring.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.bind.annotation.ResponseBody;
//
//import edu201909.day2.Userinfo;
import edu201909.spring.service.PlayerService;


@Controller
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	@Autowired
	private edu201909.spring.service.Turn2Binary turn2Binary;


	@RequestMapping("/index")
	public String getUsers(ModelMap modelMap) {
		modelMap.put("list", playerService.getUsers());
		return "index";
	}

	@RequestMapping("/test")
	public String getnumber(ModelMap modelMap) {
		
		return "test";
	}

	@RequestMapping(value = "/test/turn2Binary", method = RequestMethod.POST)
	public String getnumber(HttpServletRequest request) {
		String result_data = request.getParameter("data");

		request.setAttribute("binary_result",turn2Binary.getnumber(result_data));
		request.setAttribute("ten_number", result_data);
		return "test";
	}

//public String ten_number(ModelMap model Map,integer JSP要接收的参数的名字)
//@ResponseBody
//public Map<String,Integer> ten2binaryJson(Integer,String){  return Map<ten_number,binary_result>;
//	}
//	@RequestMapping("/json")
//	@ResponseBody
//	public List<Userinfo> getUsersJson(ModelMap modelMap){
//		
//		return playerService.getUsers();
//	}

}
