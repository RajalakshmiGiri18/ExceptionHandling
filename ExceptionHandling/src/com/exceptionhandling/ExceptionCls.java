package com.exceptionhandling;

public class ExceptionCls {
	int a=10;
	public void dis()
	{
		System.out.println("Value of x is: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionCls obj=new ExceptionCls();
		obj.dis();
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}

}
