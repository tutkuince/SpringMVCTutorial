package io.spring.part01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.part01.service.HelloService;

@Controller
@RequestMapping(value = "/hello.controller")
public class SpringHelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/print.message")
	public String printMessage(ModelMap modelMap) {
		String message = helloService.createMessage();
		
		modelMap.addAttribute("myMessage", message);
		
		return "_01hellopage";
	}
}
