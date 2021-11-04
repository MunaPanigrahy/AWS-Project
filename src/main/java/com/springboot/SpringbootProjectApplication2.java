package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootProjectApplication2 {
@RequestMapping
public String getname() {
	return "Muna Panigrahy";
}
}
