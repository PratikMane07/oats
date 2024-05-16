package com.cjc;

interface A{
	
	public void m1();
	
	default void m2()
	{
		System.out.println("m2 default method of INT A");
	}
	
	public static void  m3()
	{
		System.out.println("m3 static method of int A");
	}
	
	
}

interface B{
	
	public void m1();
	
	default void m2()
	{
		System.out.println("m2 default method of INT B");
	}
	
	public static void  m3()
	{
		System.out.println("m3 static method of int B");
	}
	
	
}

public class Test implements A, B{
	
	int x = 10;
	
	

	@Override
	public void m1() {
		
		System.out.println("Impl of m1");
		
	}

	@Override
	public void m2() {
		
		A.super.m2();
	}
	
	public static void main(String[] args) {
		
		A test = new Test();
		
		test.m2();
		test.m1();
		
		A.m3();
		B.m3();
	    
		
	}

}
