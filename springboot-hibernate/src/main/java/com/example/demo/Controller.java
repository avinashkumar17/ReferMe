package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;

@RestController
public class Controller {

@Autowired
DaoImpl impl;
	
@RequestMapping(value="index",method=RequestMethod.GET,produces="application/json")
public String ind() {
	 List<Company> li=impl.getList();
	 System.out.println("the size is "+li.size());
	return "success";
}
	
}
