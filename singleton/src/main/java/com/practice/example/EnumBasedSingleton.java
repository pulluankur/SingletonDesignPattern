package com.practice.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public enum EnumBasedSingleton {
	INSTANCE;

	private int value;
	
	EnumBasedSingleton() {
		value = 34;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private void doSomething() {

	}
}

class EnumBasedSingletonDemo {
	
	static void saveToFile(EnumBasedSingleton enumBasedSingleton, String fileName) throws Exception {
		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(enumBasedSingleton);
		}
	}

	static EnumBasedSingleton readFromFile(String fileName) throws Exception {
		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (EnumBasedSingleton) in.readObject();
		}
	}
	public static void main(String args[]) throws Exception {	
		String fileName = "singleton.bin";
		EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
		singleton.setValue(111);
		saveToFile(singleton, fileName);

		EnumBasedSingleton singleton2 = readFromFile(fileName);

		System.out.println(singleton == singleton2);
		
		System.out.println(singleton2.getValue());
	}
}
