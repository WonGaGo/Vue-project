package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.dataBean;

@Controller
public class testController {
	
	private dataBean studentRecords;
	@GetMapping("/test")
	  @ResponseBody
	  public String test() {
		return "TEST";
	  }
	@GetMapping("/student/allstudent")
	  @ResponseBody
	  public dataBean getAllStudents() {
		studentRecords = new dataBean();
		studentRecords.setPhone("0912345678");
		studentRecords.setPassword("admin123");
		
	  return studentRecords;
	  }
}