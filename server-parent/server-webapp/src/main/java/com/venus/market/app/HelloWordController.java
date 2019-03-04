package com.venus.market.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * mail to minglin.zml<href a="895589685@qq.com"> edit on 2019年3月4日 下午12:08:56
 */
@Controller
public class HelloWordController {
	@RequestMapping("/sayHello")
	public ModelAndView sayHello() {
		Map model = new HashMap<String, String>();
		model.put("greating", "hello zhangminglin");
		return new ModelAndView("hello", model);
	}
}
