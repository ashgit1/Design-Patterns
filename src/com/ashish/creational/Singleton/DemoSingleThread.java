package com.ashish.creational.Singleton;

/**
 * 1. Naïve Singleton (single-threaded) It’s pretty easy to implement a sloppy
 * Singleton. You just need to hide the constructor and implement a static
 * creation method.
 */

public class DemoSingleThread {

	public static void main(String args[]) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		Singleton firstObject = Singleton.getInstance("Ashish");
		Singleton secondObject = Singleton.getInstance("Ashu");
		System.out.println(firstObject.value);
		System.out.println(secondObject.value);
	}
}