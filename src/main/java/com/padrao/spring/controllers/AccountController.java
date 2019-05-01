package com.padrao.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.padrao.spring.entities.Account;
import com.padrao.spring.entities.Group1;
import com.padrao.spring.entities.Group2;
import com.padrao.spring.validators.AccountValidator;

@Controller
@RequestMapping(value = "account")
public class AccountController {
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Validated( {Group1.class} ) @ModelAttribute("account") Account account, 
			           BindingResult bindingResult,  ModelMap modelMap ) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		
		if(bindingResult.hasErrors()) {
			return "account/register";
		} else {
			modelMap.put("account", account);
			return "account/success1";
		}
		
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit( ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(@Validated( {Group2.class} ) @ModelAttribute("account") Account account, 
			           BindingResult bindingResult,  ModelMap modelMap ) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		
		if(bindingResult.hasErrors()) {
			return "account/edit";
		} else {
			modelMap.put("account", account);
			return "account/success2";
		}
		
	}
	    
}
