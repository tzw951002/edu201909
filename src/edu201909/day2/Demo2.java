package edu201909.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class Demo2 {

	public static void main(String[] args) {
		
		Userinfo user=new Userinfo();
		user.setUserId(1001);
		user.setUserName("Tom");
		user.setAge(20);
		
		
		Userinfo user2=new Userinfo(1002,"Jerry",18);
		
		List<String> strList = new ArrayList<String>();
		List<String> strList2 = new LinkedList<String>();
		
		strList.add(user.toString());
		strList.add(user2.toString());
//		for(int i=0;i<strList.size();i++) {
//			System.out.println(strList.get(i));
//		}
//		
//		for(String s:strList) {
//			System.out.println(s);
//			
//		}
		
		Map<Integer,Userinfo> map=new HashMap<Integer,Userinfo>();
		map.put(user.getUserId(), user);
		map.put(user2.getUserId(),user2);
		
		System.out.println(map.get(1002));
		
//		List<Userinfo> userList = Lists.newArrayList(user,user2);
//		System.out.println(userList);
		
		List<String> testString = Lists.newArrayList("aa","bb","cc");
		String sss ="";
		for(String s:testString) {
			sss+=s+"-";
		}
		System.out.println(sss);
		
		String result = Joiner.on("-").join(testString);
		System.out.println(result);
	}
	
}
