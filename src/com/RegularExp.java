package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {

		Pattern objPat = Pattern.compile("Songii",Pattern.CASE_INSENSITIVE);
		Matcher objMat = objPat.matcher("K7 mom songii romba somberi");
		
		if(objMat.find())
			System.out.println("songii romba somberi");
		else
			System.out.println("songii somberi ella");
	}

}
