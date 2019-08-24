package com.pragim.diwithconstructorinjection.model;

import java.util.List;

public class Person {

	private Institute institute;

	public Person(Institute institute) {
		super();
		this.institute = institute;
	}

	public void getCources() {
		List<String> courseList = institute.getCourseList();
		courseList.forEach(item->{
			System.out.println(item);
		});
	}

}
