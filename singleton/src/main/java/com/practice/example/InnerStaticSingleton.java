package com.practice.example;

public class InnerStaticSingleton {

	private InnerStaticSingleton() {

	}
	
	static {
		System.out.println("InnerStaticSingleton loading....");
	}
	
	// This approach actually avoids the problem of synchronization and guarantees
	// effectively that whenever we initialize the instance we are only going to get
	// one instance whatever happens.
	private static class InnerStaticSingletonImpl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
		static {
			System.out.println("InnerStaticSingletonImpl loading....");
		}
	}

	public static InnerStaticSingleton getInstance() {
		return InnerStaticSingletonImpl.INSTANCE;
	}

}

class InnerStaticSingletonDemo {
	public static void main(String args[]) {
		System.out.println(InnerStaticSingleton.getInstance());
	}
}
