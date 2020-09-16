package com.springboot.example.springbootpoc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestService {

	@GetMapping("/student")
	public List<Student> getStudent() {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("stu2s1s","Student1"));
		return stuList;
	}

}
