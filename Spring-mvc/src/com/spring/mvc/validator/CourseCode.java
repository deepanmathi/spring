package com.spring.mvc.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	
	public String message() default "must start with LUV";
	
	public Class<?>[] groups() default{};
	
	//payload provides details about validation failure (severity level, error code)
	public Class<? extends Payload>[] payload() default{};
	

}
