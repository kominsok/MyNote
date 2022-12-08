package com.mynote.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FcNoteRepository extends JpaRepository<FcNote, Long> {
	
	List<FcNote> findFcNoteByName(String name);
	
	List<FcNote> findFcNoteByIdx(Long idx);
	
	@Query( value = "select * from fc_note where note like %?1%", nativeQuery = true)
	List<FcNote> findFcNoteByNote(String note);
}
