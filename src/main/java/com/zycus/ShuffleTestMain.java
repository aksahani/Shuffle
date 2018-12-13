package com.zycus;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShuffleTestMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			list.add("My music "+i);
		}
		ShuffleUsingCollection obj = new ShuffleUsingCollection(list);
		Thread t1 = new Thread(obj);
		t1.start();
		try(Scanner sc = new Scanner(new InputStreamReader(System.in))){
			while(true){
				String msg = sc.next();
				if("Previous".equalsIgnoreCase(msg)) {
					t1.interrupt();
					obj.previousSong();
					t1 = new Thread(obj);
					t1.start();
				} else if("Next".equalsIgnoreCase(msg)) {
					t1.interrupt();
					obj.nextSong();
					t1 = new Thread(obj);
					t1.start();
				}
			}
		} catch(Exception e) {
			System.out.println("Exception "+e);
		}
		
	}
}
