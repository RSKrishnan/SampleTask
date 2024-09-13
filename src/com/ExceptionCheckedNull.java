package com;

import java.util.ArrayList;

public class ExceptionCheckedNull {

	public static void main(String[] args) {

		System.out.println("NullPointer Exception example");
		try 
		{
			String s= null;
			int a=s.length();
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
		
		
		
	}

}
