package com.venus.market.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * mail to minglin.zml<href a="895589685@qq.com"> edit on 2019年3月4日 下午12:08:56
 */
@Controller
public class HelloWordController {
	@RequestMapping("/sayHello")
	public ModelAndView sayHello() {
		// Map<String, List<Student>> st = new HashMap<String, List<Student>>();
		List<Student> students = new ArrayList<Student>();
		for (int s = 0; s < 10; s++) {

			Student ss = new Student();
			ss.setAge(18);
			ss.setName("zhangminglin");
			if (new Random().nextInt() % 2 == 0) {
				ss.setPic("./dress.jpg");
			} else {
				ss.setPic("./dress2.jpg");
			}

			ss.setPromotionPrice(120.90);
			ss.setOriginPrice(250.00);
			ss.setTitle("this is my best like dress,enjoy it!");
			students.add(ss);
		}

		return new ModelAndView("hello", "st", students);
	}

	@ResponseBody
	@RequestMapping("/getStudentList")
	public List<Student> getStudentList() {
		List<Student> students = new ArrayList<Student>();
		Student temp;
		for (int i = 0; i < 10; i++) {
			temp = new Student();
			temp.setAge(12);
			temp.setName("the most beauty lady");
			temp.setPic("www.baidu.com");
			students.add(temp);
		}
		return students;
	}
}
