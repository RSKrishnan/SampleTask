package com;

public class ExceptionCheckedAirth {

	public static void main(String[] args) {

		System.out.println("Arithmetic Exception example");
		try 
		{
			int a=100/0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
