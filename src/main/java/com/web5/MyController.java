package com.web5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
@RequestMapping("/")
public String home()
{
	return "home";
}
@RequestMapping("/req1")
public String cust(@RequestParam String n1,
		     @RequestParam String course,@RequestParam String track,ModelMap m)
{
	m.put("key1", n1);
	m.put("key2", course);
	m.put("key3",track);
	
	return "result";
}

}
