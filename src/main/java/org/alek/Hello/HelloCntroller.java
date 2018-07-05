package org.alek.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCntroller {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	

}
