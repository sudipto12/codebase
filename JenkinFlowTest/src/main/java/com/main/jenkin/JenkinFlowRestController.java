package com.main.jenkin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinFlowRestController {
	@RequestMapping("/")
	public String getResponse() {
		return "This is for Jenkin Flow";
	}
}
