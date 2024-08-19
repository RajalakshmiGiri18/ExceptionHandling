package com.exceptionhandling;

public class ThrowsDeclaration {
	int x=443;
	public void dis()
	{
		System.out.println("value of x is "+x);
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ThrowsDeclaration t=new ThrowsDeclaration();
		t.dis();
		Thread.sleep(0);
		

	}

}
