package com.zycus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * @author Ajit Kumar Sahani
 */
public class ShuffleUsingCollection implements Runnable{
	


	private static int currentIndex=0;
	public int getCurrentIndex() {
		return currentIndex;
	}

	List<String> mySongList = new ArrayList<>();
	
	public ShuffleUsingCollection(List<String> list){
		for(String i : list) {
			mySongList.add(i);
		}
		Collections.shuffle(mySongList,new Random(3));
	}
	
	public ShuffleUsingCollection() {
		super();
	}
	
	@Override
	public void run() {
		 playSong(mySongList);
	}
	
	public void playSong(List<String> songList) {
		for(int i=currentIndex;i<mySongList.size();i++) {
			 try{
				 Thread.sleep(1000);
			 } catch(InterruptedException e){
				 System.out.println("Thread interrupted...... ");
				 break;
				}
			 currentIndex=i;
			 System.out.println("Songs played in shuffle manner "+mySongList.get(i));  
			 //i++;
		}
	}
	//previous the last track will be played
	public void previousSong() {
		if(currentIndex!=0) {
			currentIndex--;
		}
		
	}
	
	//next shuffled song will be played
	public void nextSong() {
		if(currentIndex!=mySongList.size()-1) {
			currentIndex++;
		}
	}



}

