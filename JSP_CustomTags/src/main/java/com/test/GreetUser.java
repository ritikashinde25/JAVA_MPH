package com.test;

//import java.util.Date;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class GreetUser extends TagSupport 
{
	private static final long serialVersionUID = 1L;
	
	public int doStartTag()
	{
		JspWriter out = null;
		
		try
		{
			out = pageContext.getOut();
			
			out.println("Welcome To Java AI World...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return SKIP_BODY;
	}
}
