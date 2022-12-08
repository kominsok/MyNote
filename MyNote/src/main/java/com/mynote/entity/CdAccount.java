package com.mynote.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class CdAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	private String account;
	
	private String password;
	
	private String name;
	
	@Builder
	public CdAccount(String account, String password, String name) {
		this.account = account;
		this.password = password;
		this.name = name;
	}

}
