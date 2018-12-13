package com.zycus.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zycus.ShuffleUsingCollection;

public class TestShuffle {
	
	private List<String> listTest = new ArrayList<>();
	ShuffleUsingCollection obj;
	
	@Before
	public void init() {
		listTest.add("Song1");
		listTest.add("Song2");
		listTest.add("Song3");
		listTest.add("Song4");
		listTest.add("Song5");
		listTest.add("Song6");
		listTest.add("Song7");
		listTest.add("Song8");
		listTest.add("Song9");
		listTest.add("Song10");
		
		obj = new ShuffleUsingCollection(listTest);
	    }

	
	@Test
	public void test1() {
		obj.playSong(listTest);
		assertEquals("Testing song play in shuffle mode",9, obj.getCurrentIndex());
		
	}
	
	@Test
	public void test2() {
		obj.previousSong();
		assertEquals("Testing previos song", 8, obj.getCurrentIndex());
	}
	
	@Test
	public void test3() {
		obj.nextSong();
		assertEquals("Testing next song", 9, obj.getCurrentIndex());
	}
}
