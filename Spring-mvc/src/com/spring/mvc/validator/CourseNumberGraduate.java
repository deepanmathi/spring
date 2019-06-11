package com.spring.mvc.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseNumberGraduateValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseNumberGraduate {
	
    public String[] value() default {"5"};
	
	public String message() default "Graduate must contain 500 level or 600 level course";
	
    public Class<?>[] groups() default{};
	
	//payload provides details about validation failure (severity level, error code)
	public Class<? extends Payload>[] payload() default{};

}
