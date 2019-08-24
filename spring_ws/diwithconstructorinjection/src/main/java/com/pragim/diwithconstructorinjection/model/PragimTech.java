package com.pragim.diwithconstructorinjection.model;

import java.util.Arrays;
import java.util.List;

public class PragimTech implements Institute {

	@Override
	public List<String> getCourseList() {
		return Arrays.asList("JAVA","HTML","JS","MICROSERVICES");
	}

}
