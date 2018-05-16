package io.spring.part01.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public String createMessage() {
		return "Random message created!";
	}
}
