package com.boocrun.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
    @RequestMapping (value="/", method=RequestMethod.GET)
    public String root (ModelMap model) {
	model.put("hello", "Hello World from new App !!!");
	return "index";
    }

}
