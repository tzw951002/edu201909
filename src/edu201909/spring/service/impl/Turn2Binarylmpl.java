package edu201909.spring.service.impl;

import org.springframework.stereotype.Service;

import edu201909.spring.service.Turn2Binary;

@Service
public  class Turn2Binarylmpl implements Turn2Binary {

	@Override
	public StringBuilder getnumber(String s) {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(s);
		while (n != 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		return sb.reverse();
	
	}

}
