package com.padrao.spring.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.padrao.spring.entities.Account;

public class AccountValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	}

}
