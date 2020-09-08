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
		System.out.println("分支添加");
		System.out.println("在线添加");
		System.out.println("在线添加2");
		return "Hello World!";
	}
}
