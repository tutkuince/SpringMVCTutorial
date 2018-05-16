package io.spring.part02.javabased.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/persons")
@Controller
public class PersonController {

	@RequestMapping("/person.detail")
	public ModelAndView personDetail(ModelAndView mv) {
		mv.setViewName("personPage");
		mv.addObject("message", "PersonController#personDetail");
		return mv;
	}
}
