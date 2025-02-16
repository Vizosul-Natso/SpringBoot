package com.natso.sbmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.natso.sbmvc.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelDate(Model m) {
		m.addAttribute("name", "Alien");
	}
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int a ,@RequestParam("num2") int b , HttpSession session) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		
//		int sum = a + b;
//		
//		mv.addObject("sum", sum);
//		
//		session.setAttribute("sum", sum);
//		
//		return mv;
//	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a ,Model m) {
			
		m.addAttribute("alien",a);
		
		return "result";
		
	}

}
