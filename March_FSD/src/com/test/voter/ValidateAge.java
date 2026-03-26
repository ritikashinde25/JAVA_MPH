package com.test.voter;

public class ValidateAge {
	
	public void checkAge(int age)
	{
		if(age<18)
		{
			throw new AgeValidationException("Age should be greater than 18");
		}
		else
		{
			System.out.println("Valid age for voting");
		}
	}

}
