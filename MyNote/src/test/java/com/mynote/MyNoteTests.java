package com.mynote;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mynote.entity.FcNote;
import com.mynote.entity.FcNoteRepository;

@SpringBootTest
public class MyNoteTests {
	@Autowired
	FcNoteRepository fcNoteRepository;
	
	@Test
	void save() {
		FcNote fcNote = FcNote.builder()
							.name("Test2")
							.note("테스트 입니다2")
							.account_FK((long) 1)
							.build();
		
		fcNoteRepository.save(fcNote);
		
		FcNote entity = fcNoteRepository.findById((long) 1).get();
		assertThat(entity.getName()).isEqualTo("Test");
		assertThat(entity.getNote()).isEqualTo("테스트 입니다");
		assertThat(entity.getAccount_FK()).isEqualTo((long) 1);
	}
	
	
	@Test
    void findAll() {

        // 1. 전체 게시글 수 조회
        long count = fcNoteRepository.count();

        // 2. 전체 게시글 리스트 조회
        List<FcNote> notes = fcNoteRepository.findAll();
    }
}
