package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@PostMapping("/test")
public String textMe() {
	return "tayf";
}
}
