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
public class FcNote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	private String name;
	
	private String note;
	
	private Long account_FK;
	
	@Builder
	public FcNote(String name, String note, Long account_FK) {
		this.name = name;
		this.note = note;
		this.account_FK = account_FK;
	}
}