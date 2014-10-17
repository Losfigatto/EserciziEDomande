package it.losfigatto.esercizi.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program for a palindrome WITHOUT COPYING OR USING THE REVERSE
 * LOGIC prove that a given string is a palindrome or not
 * 
 * @author amarasco
 * 
 */
public class CheckPalindrom {

	public static void main(String[] args) {
		List<String> tests = new ArrayList<String>();
		tests.add("A man, a plan, a canal - Panama!");
		tests.add("My Frase!");
		tests.add("Anna");
		tests.add("Ana");
		tests.add("a");
		tests.add(null);
		
		for(String test : tests){
			System.out.println("isPalindromeStrict(\""+test+"\") = "+isPalindromeStrict(normalizeString(test)));
		}
	}
	
	public static String normalizeString(String toNormalize){
		if(toNormalize==null || toNormalize.trim().length()==0){
			return toNormalize;
		}
		
		return toNormalize.replaceAll("\\W", "").toLowerCase();
	}
	
	public static boolean isPalindromeStrict(String str) {
		if (str == null) {
			return true; // null string is palindrome
		}

		// It is not necessary to check the whole string. If the first half
		// match the second half is enough
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
