package edu201909.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import edu201909.day2.Userinfo;
import edu201909.spring.service.PlayerService;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Override
	public List<Userinfo> getUsers() {
		Userinfo u1=new Userinfo(1001,"Mark",33);
		Userinfo u2=new Userinfo(1002,"Jager",45);
		Userinfo u3=new Userinfo(1003,"Hibana",28);
		// TODO Auto-generated method stub
		return Lists.newArrayList(u1,u2,u3);
	}

}
