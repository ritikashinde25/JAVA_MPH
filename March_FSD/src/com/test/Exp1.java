package com.test;

interface Inf1
{
	float pi = 3.14f;//public static final 
	
	void disp();
	
	default void show()
	{
		System.out.println("default inf");
	}
	
	static void userLogin()
	{
		System.out.println("static inf");
	}
	
}

interface Inf2
{
	void dog();
}

abstract class Abs1
{
	public abstract void cat();
	
	public void fox()
	{
		System.out.println("abs implemented");
	}
}

class Impl1 extends Abs1 implements Inf1,Inf2
{
	@Override
	public void disp()
	{
		System.out.println("disp inf1");
	}
	
	@Override
	public void dog()
	{
		System.out.println("dog inf2");
	}
	
	@Override
	public void cat()
	{
		System.out.println("cat abs1");
	}
}

public class Exp1 {
	
	public static void main(String[] args)
	{
		Impl1 obj = new Impl1();
		
		obj.disp();
		obj.dog();
		obj.cat();
		obj.fox();
		obj.show();
		
		Inf1.userLogin();
		
		System.err.println("Test main");
	}
	
}
