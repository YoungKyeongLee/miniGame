package com.minigame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minigame.dao.TestDAO;

@Service
public class TestService {
	@Autowired TestDAO testDAO;
	
	public String test() {
		return testDAO.test();
	}
}
