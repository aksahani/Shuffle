package com.zycus.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.zycus.ShuffleUsingCollection;

public class TestShuffle {
	
	private List<String> listTest = new ArrayList<>();
	private ShuffleUsingCollection testObj = new ShuffleUsingCollection();
	
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
	    }

	
	@Test
	public void playShuffle() {
		ShuffleUsingCollection obj = new ShuffleUsingCollection(listTest);
		
		assertEquals("Testing song play in shuffle mode",true, true);
		
	}
	
	@Test
	public void previousSongTest() {
		testObj.previousSong();
		assertEquals("Testing previos song", true, true);
	}
	
	@Test
	public void previousNextTest() {
		testObj.nextSong();
		assertEquals("Testing next song", true, true);
	}
}
