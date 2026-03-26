package com.test;

import java.util.HashMap;
import java.util.HashSet;

class ThreadDemo implements Runnable
{

	@Override
	public void run() {
		
		try
		{
			System.out.println("Thread started");
			
			Thread.sleep(1000);
			
			System.out.println("After 1 sec thread executed.");
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}

public class Exp5 {
	
	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo();
		
		//t1.start();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
		HashSet data = new HashSet<>();
		
		
		data.add("java");
		
		System.out.println(data.add("java"));
		
		data.add(234);
		
		System.out.println(data.size());
		System.out.println(data);
		
		HashMap<String, Integer> dt = new  HashMap<>();
		
		dt.put("java", 8);
		dt.put("java", 25);
		
		dt.put("spirng", 7);
		
		System.out.println(dt);
		
		
	}
}
