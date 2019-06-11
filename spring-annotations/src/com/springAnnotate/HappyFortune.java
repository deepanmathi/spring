package com.springAnnotate;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{

	@Override
	public String getFortune() {
		return "happy day !!!";
	}

}
