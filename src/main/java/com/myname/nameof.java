package com.myname;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class nameof {
	@GetMapping("/Name")
	public String getName() {
		return  "new java developer";
	}

}
