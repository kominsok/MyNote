package com.mynote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynote.entity.CdAccount;
import com.mynote.entity.CdAccountRepository;

@Service
public class CdAccountServiceImpl implements CdAccountService{
	@Autowired
	CdAccountRepository cdAccountRepository;
	
	@Override
	public List<CdAccount> findAll(){
		return cdAccountRepository.findAll();
	}
	
	@Override
	public List<CdAccount> findCdAccountByName(String name){
		return cdAccountRepository.findCdAccountByName(name);
	}

	@Override
	public List<CdAccount> findCdAccountByIdx(Long idx){
		return cdAccountRepository.findCdAccountByIdx(idx);
	}
	
	@Override
	public List<CdAccount> findCdAccountByAccount(String account){
		return cdAccountRepository.findCdAccountByAccount(account);
	}
}
