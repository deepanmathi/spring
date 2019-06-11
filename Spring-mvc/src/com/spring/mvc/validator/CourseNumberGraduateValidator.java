package com.spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseNumberGraduateValidator implements ConstraintValidator<CourseNumberGraduate, String>{

	private String[] prefixes;
	@Override
	public void initialize(CourseNumberGraduate theCourseNumGrad) {
		prefixes=theCourseNumGrad.value();
		
	}

	@Override
	public boolean isValid(String userEnteredGradCourse, ConstraintValidatorContext arg1) {
		boolean result=false;
		if(userEnteredGradCourse!=null)
		{
			for(String temp:prefixes)
			{
				result=userEnteredGradCourse.startsWith(temp);
				
				if(result)
					break;
			}
		}
			
		return result;
	}

}
