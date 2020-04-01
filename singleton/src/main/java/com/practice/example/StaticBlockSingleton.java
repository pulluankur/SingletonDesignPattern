package com.practice.example;

import java.io.File;
import java.io.IOException;

/**
 * If we have a singleton constructor which can actually throw some exception
 * then we have to use a static block to code in try-catch manner and try making
 * the instance of the singleton. One more benefit of static block approach is
 * if we want some additional kind of stuff to do before creation of singleton
 * object then we can do that in try block before instantiation.
 * 
 * some exception and handle that.
 * 
 * @author Piyush Goel
 *
 */
public class StaticBlockSingleton {

	private StaticBlockSingleton() throws IOException {
		System.out.println("StaticBlockSingleton is initializing...");
		File.createTempFile(".", ".");
	}

	private static StaticBlockSingleton instance;

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (IOException e) {
			System.err.println("error occurred while instantiating StaticBlockSingleton.");
		}
	}
}

class StaticInstantiationDemo {
	public static void main(String args[]) {
		StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
	}
}