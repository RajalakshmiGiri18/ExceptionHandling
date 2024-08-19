package com.exceptionhandling;

public class UncheckedExceptionTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Started");
		try
		{
			int x=10/0;
			System.out.println("Division result is: "+x);
		}
		catch(ArithmeticException e )
		{
			System.out.println("Something went wrong.Please check the exception."+e.getMessage());
		}
     System.out.println("Program End");
	}

}
