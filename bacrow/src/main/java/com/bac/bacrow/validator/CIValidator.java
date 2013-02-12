package com.bac.bacrow.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bac.bacrow.domain.CI;

//import javax.validation.Valid;



@Component
public class CIValidator implements Validator{

	public boolean supports(Class clazz) {
		//just validate the Student instances
		return CI.class.isAssignableFrom(clazz);

	}

	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cinum",
				"required.cinum", "Field cinum is required.");
		
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type",
				//"required.type", "Field type is required.");
	}
	
}