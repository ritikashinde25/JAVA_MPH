package com.test;

class TestThread extends Thread
{
	public void run()//RUNNABLE STATE
	{
		System.out.println("Thread is running");
		try {
			
			Thread.sleep(1000);//TIMED_WAITING STATE
			
			System.out.println("Thread is running after 1 second");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class Exp4 {
	
	public static void main(String[] args) {
		
		TestThread t1 = new TestThread();// NEW / BORN STATE
		
		t1.start();//
		
		System.out.println("Main thread is running");
		
		try {
			
			Thread.sleep(500);
			
			System.out.println("Main thread is running after 0.5 second");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	//AFTER EXECUTING THE THREAD TERMINATED STATE
	
}
