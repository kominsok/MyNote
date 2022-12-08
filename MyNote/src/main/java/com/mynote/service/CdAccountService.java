package com.mynote.service;

import java.util.List;

import com.mynote.entity.CdAccount;

public interface CdAccountService {
	public List<CdAccount> findAll();
	
	public List<CdAccount> findCdAccountByName(String name);
	
	public List<CdAccount> findCdAccountByIdx(Long idx);
	
	public List<CdAccount> findCdAccountByAccount(String account);
}
