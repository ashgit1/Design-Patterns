package com.ashish.creational.Singleton;

/*
 * 2. Naïve Singleton (multithreaded)
 * The same class behaves incorrectly in a multithreaded environment. 
 * Multiple threads can call the creation method simultaneously and get several instances of Singleton class. 
 */

public class DemoMultiThread {

	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		Thread fooThread = new Thread(new ThreadFoo());
		Thread booThread = new Thread(new ThreadBoo());
		fooThread.start();
		booThread.start();
	}

	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("Foo");
			System.out.println(singleton.value);
		}
	}

	static class ThreadBoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("Boo");
			System.out.println(singleton.value);
		}
	}

}