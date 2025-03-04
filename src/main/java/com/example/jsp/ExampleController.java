package com.example.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExampleController {

	@RequestMapping("/testJSP")
	public ModelAndView test1() {
		ModelAndView mv = new ModelAndView("testJSP");
		mv.addObject("name", "JSP");

		List<String> testList = List.of("Java", "Spring", "Hibernate");

		mv.addObject("list", testList);
		return mv;
	}
}
