package io.spring.part02._01controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/transactions")
public class TransactionContoller {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String helloController(Model model) {
		model.addAttribute("message", "Hello From TransactionController with Model Param");
		return "_02myTransactionPage";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public ModelAndView helloController() {
		ModelAndView mv = new ModelAndView("_02myTransactionPage");
		mv.addObject("message", "Hello From TransactionController with ModelAndView");
		return mv;
	}
}
