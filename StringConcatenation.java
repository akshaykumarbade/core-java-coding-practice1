package com.practice;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello ";
		String str2 = "World";
		
		String concatinatedString = str.concat(str2);
		String str3 = str+str2;
		System.out.println(concatinatedString);
		System.out.println(str3);

	}

}
