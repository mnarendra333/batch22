package com.pragim.diwithconstructorinjection.model;

import java.util.Arrays;
import java.util.List;

public class VisionTech implements Institute {

	@Override
	public List<String> getCourseList() {
		return Arrays.asList("SAP","Hadoop","AI","ML");
	}

}
