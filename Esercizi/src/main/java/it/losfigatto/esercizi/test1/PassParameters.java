package it.losfigatto.esercizi.test1;

import java.util.ArrayList;

/**
 * Question: 
 * How an object is passed in Java, It's either by reference or value?
 * @author amarasco
 *
 */
public class PassParameters {

	public static void main(String[] args) {
		
		Integer i = new Integer(0);

		modifyInteger1(i);
		System.out.println("1. Result: " + i);
		
		modifyInteger2(i);
		System.out.println("2. Result: " +i);

		modifyInteger3(i);
		System.out.println("3. Result: " +i);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		modifyList(list);
		System.out.println("4. Result: " +list);

		String str = "1";
		
		modifyString1(str);
		System.out.println("5. Result: " +str);
		
		modifyString2(str);
		System.out.println("6. Result: " +str);
	}

	public static void modifyInteger1(Integer i) {
		i = 100;
	}

	public static void modifyInteger2(Integer i) {
		i++;
	}

	public static void modifyInteger3(Integer i) {
		i = new Integer(400);
	}
	
	public static void modifyList(ArrayList<Integer> list) {
		list.add(3);
		list = new ArrayList<Integer>();
		list.add(1);
	}

	public static void modifyString1(String str) {
		str = "1234";
	}

	public static void modifyString2(String str) {
		str.concat("123");
	}
}