package com.practice.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BasicSingleton implements Serializable {

	private BasicSingleton() {
		System.out.println("Singleton is initializing");
	}

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	private static final BasicSingleton INSTANCE = new BasicSingleton();

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Here, we're giving the JVM a hint that whenever serialization happens it has
	// to happen in the context of this instance.
	protected Object readResolve() {
		return INSTANCE;
	}
}

class Demo {
	static void saveToFile(BasicSingleton basicSingleton, String fileName) throws Exception {
		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(basicSingleton);
		}
	}

	static BasicSingleton readFromFile(String fileName) throws Exception {
		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (BasicSingleton) in.readObject();
		}
	}

	public static void main(String args[]) throws Exception {
		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(111);

		String fileName = "singleton.bin";
		saveToFile(singleton, fileName);

		singleton.setValue(222);

		BasicSingleton singleton2 = readFromFile(fileName);

		System.out.println(singleton == singleton2);
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());

	}
}
