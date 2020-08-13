package com.in28minutes.oops;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('a');
		System.out.println("Is number: " + myChar.isNumber());
		System.out.println("Is alphabet: " + myChar.isAlphabet());
		System.out.println("Is vowel: " + myChar.isVowel());
		System.out.println("Lower case: " + myChar.lowerCase());
		System.out.println("Upper case: " + myChar.upperCase());

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
