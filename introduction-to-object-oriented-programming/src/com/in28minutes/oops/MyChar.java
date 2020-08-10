package com.in28minutes.oops;

public class MyChar {
	private char letter;

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	MyChar(char letter) {
		this.setLetter(letter);
	}

	public boolean isNumber() {
		if (this.getLetter() >= 48 && this.getLetter() <= 57)
			return true;
		else
			return false;
	}

	public boolean isAlphabet() {
		if (lowerCase() >= 'a' && lowerCase() <= 'z')
			return true;
		else
			return false;
	}

	public boolean isVowel() {
		if (lowerCase() == 'a' || lowerCase() == 'e' || lowerCase() == 'i' || lowerCase() == 'o' || lowerCase() == 'u')
			return true;
		else
			return false;
	}

	public Character lowerCase() {
		return Character.toLowerCase(this.getLetter());
	}

	public Character upperCase() {
		return Character.toUpperCase(this.getLetter());
	}

	public static void printLowerCaseAlphabets() {
		for (char i = 97; i <= 122; i++)
			System.out.println("Letter: " + i);
	}

	public static void printUpperCaseAlphabets() {
		for (char i = 65; i <= 90; i++)
			System.out.println("Letter: " + i);
	}
}
