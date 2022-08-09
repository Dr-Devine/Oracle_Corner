package com.example.oracle;

import com.example.oracle.models.Tarot;
import com.example.oracle.repositories.TarotRepository;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class OracleApplicationTests {

	@Autowired
	TarotRepository tarotRepository;


	@Test
	void contextLoads() {
	}


	@Test
	public void getName(){
		Tarot tarot = new Tarot("five of swords",5, "have a good time guys","swords", "five of swords is a good time");
		assertEquals("five of swords", tarot.getName());
	}




}
