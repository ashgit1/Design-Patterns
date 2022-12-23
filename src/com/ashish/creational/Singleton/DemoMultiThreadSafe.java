package com.ashish.creational.Singleton;

/*
 * 3. Thread-safe Singleton with lazy loading
 * To fix the problem, you have to synchronize threads during first creation of the Singleton object.
 */

public class DemoMultiThreadSafe {

	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		Thread threadFoo = new Thread(new ThreadSafeFoo());
		Thread threadBar = new Thread(new ThreadSafeBar());
		threadFoo.start();
		threadBar.start();
	}

	static class ThreadSafeFoo implements Runnable {
		@Override
		public void run() {
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("FOO");
			System.out.println(singleton.value);
		}
	}

	static class ThreadSafeBar implements Runnable {
		@Override
		public void run() {
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}

}