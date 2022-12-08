package com.mynote.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CdAccountRepository extends JpaRepository<CdAccount, Long> {
	List<CdAccount> findCdAccountByName(String name);
	
	List<CdAccount> findCdAccountByIdx(Long idx);
	
	@Query( value = "select * from cd_account where Account like %?1%", nativeQuery = true)
	List<CdAccount> findCdAccountByAccount(String account);
}
