package com.ara.myAra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

	@Autowired
	private testService ser;
	
	@RequestMapping("test.do")
	public String testCon(Model model) {
		
		String msg = ser.test();		
		model.addAttribute("msg", msg);
		
		return "test";
	}
}
