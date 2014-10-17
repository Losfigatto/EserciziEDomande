package it.losfigatto.esercizi.test5;

/**
 * Why testA() is wrong while testB() is correct?
 * 
 * @author amarasco
 *
 */
public class FinalClass {

	public void testA() {
		int a = 10;
		final int b = a;
		byte c = b;
	}

	public void testB() {
		int a = 10;
		final int b = 10;
		byte c = b;
	}
}
