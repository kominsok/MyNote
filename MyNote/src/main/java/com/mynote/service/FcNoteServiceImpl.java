package com.mynote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynote.entity.FcNote;
import com.mynote.entity.FcNoteRepository;

@Service
public class FcNoteServiceImpl implements FcNoteService{
	@Autowired
	FcNoteRepository fcNoteRepository;
	
	@Override
	public List<FcNote> findAll(){
		return fcNoteRepository.findAll();
	}
	
	@Override
	public List<FcNote> findFcNoteByName(String name){
		return fcNoteRepository.findFcNoteByName(name);
	}

	@Override
	public List<FcNote> findFcNoteByIdx(Long idx){
		return fcNoteRepository.findFcNoteByIdx(idx);
	}
	
	@Override
	public List<FcNote> findFcNoteByNote(String note){
		return fcNoteRepository.findFcNoteByNote(note);
	}
}
