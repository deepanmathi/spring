package com.spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//CourseCode name should be same name as CourseCode.java
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();// getting value="luv"
	}

	@Override
	public boolean isValid(String userEnteredCourseCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if (userEnteredCourseCode != null) //nullpointerexception will occur
			result = userEnteredCourseCode.startsWith(coursePrefix);	
		else
			result=true;

		return result;
	}

}
