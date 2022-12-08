package com.mynote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.mynote.entity.FcNote;
import com.mynote.service.FcNoteService;

@RestController
public class FcNoteController {
	@Autowired
	FcNoteService fcNoteService;
	
	@GetMapping({"/fcnote", "/fcnote/{idx}"})
	public List<FcNote> fcNote(@PathVariable(required = false) String idx) {
		if (idx == null){
			return fcNoteService.findAll();
		}
		else {
			
			return fcNoteService.findFcNoteByIdx(Long.parseLong(idx));
		}
		
	}

}
