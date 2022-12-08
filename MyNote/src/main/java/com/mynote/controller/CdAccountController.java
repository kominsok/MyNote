package com.mynote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mynote.entity.CdAccount;
import com.mynote.service.CdAccountService;

@RestController
public class CdAccountController {
	@Autowired
	CdAccountService cdAccountService;
	
	@GetMapping({"/cdaccount", "/cdaccount/{idx}"})
	public List<CdAccount> CdAccount(@PathVariable(required = false) String idx) {
		if (idx == null){
			return cdAccountService.findAll();
		}
		else {
			
			return cdAccountService.findCdAccountByIdx(Long.parseLong(idx));
		}
		
	}
}
