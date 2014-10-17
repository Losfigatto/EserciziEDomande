package it.losfigatto.esercizi.test3;

/**
 * Write a Java program to encode a given string such that "aaabbabc" such that
 * the encoded value is a3b2abc .
 * 
 * @author amarasco
 * 
 */
public class GroupChar {

	public static void main(String[] args) {
		
		String test = "aaabbabc";
		System.out.println("String to test: "+test);
		System.out.println("compressString1 : "+compressString1(test));
		System.out.println("compressString2 : "+compressString2(test));
		
		test = "abcd";
		
		System.out.println("String to test: "+test);
		System.out.println("compressString1 : "+compressString1(test));
		System.out.println("compressString2 : "+compressString2(test));
	}
	
	public static String compressString2(String input) {
		
		int len = input.length();
		
		if (len == 0 || len == 1)
			return input;
		
		char cChar, lChar;
		lChar = input.charAt(0);
		StringBuilder resultStr = new StringBuilder();
		int i = 0;
		int count = 0;
		
		while (i < len) {
			lChar = input.charAt(i);
			resultStr.append(lChar);
			i++;
			if (i == len)
				break;
			count = 1;
			cChar = input.charAt(i);
			while (cChar == lChar) {
				count++;
				i++;
				if (i == len)
					break;
				cChar = input.charAt(i);
			}
			if (count > 1) {
				resultStr.append(String.valueOf(count));
			}
		}
		return resultStr.toString();
	}

	public static String compressString1(String s) {

		String s2 = "";
		for (int i = 0; i < s.length(); i++) {

			int count = 1;

			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {

				count++;
				i++;
			}

			s2 = s2 + s.charAt(i);
			s2 = s2 + count;
		}

		s2 = s2.replaceAll("1", "");
		return s2;
	}
}
