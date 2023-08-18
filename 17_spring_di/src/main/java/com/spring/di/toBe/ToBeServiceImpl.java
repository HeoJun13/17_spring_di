package com.spring.di.toBe;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당 클래스가 Service 클래스임을 Spring bean에 등록한다.
public class ToBeServiceImpl implements ToBeService {
	
	@Inject
	@Autowired
	private ToBeDAO ToBeDAO;
	

}
