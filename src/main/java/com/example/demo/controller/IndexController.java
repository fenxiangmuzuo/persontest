package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("更新1");
		System.out.println("新建分支DEV");
		System.out.println("主干添加");
		return "Hello World!";
	}
}
