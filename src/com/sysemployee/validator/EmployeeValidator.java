package com.sysemployee.validator;

import javax.validation.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.sysemployee.model.EmployeeEntity;

@Component
public abstract class EmployeeValidator implements Validator {
 
    public boolean supports(Class clazz) {
        return EmployeeEntity.class.isAssignableFrom(clazz);
    }
 
    public void validate(Object target, Errors errors) 
    {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.firstName", "First name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.lastName", "Last name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email", "Email is required.");
    }
}
