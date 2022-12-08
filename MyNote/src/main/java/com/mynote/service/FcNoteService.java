package com.mynote.service;

import java.util.List;

import com.mynote.entity.FcNote;

public interface FcNoteService {
	public List<FcNote> findAll();
	
	public List<FcNote> findFcNoteByName(String name);
	
	public List<FcNote> findFcNoteByIdx(Long idx);
	
	public List<FcNote> findFcNoteByNote(String note);
	
}
 