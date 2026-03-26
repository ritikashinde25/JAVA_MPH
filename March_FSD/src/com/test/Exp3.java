package com.test;

public class Exp3 {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(200/0);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			//System.out.println(e);
			
			e.printStackTrace();
		}
	}
	
}
