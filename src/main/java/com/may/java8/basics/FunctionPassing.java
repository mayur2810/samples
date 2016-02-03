package com.may.java8.basics;



/**
 * Class contains samples of Java8 specific language constructs. Mostly
 * Lambdas!! Welcome Java to the World of Functional Programming \m/
 */
public class FunctionPassing {

	/**
	 * Function that accepts a function( Functional interface)
	 * @param t
	 * @param c
	 * @return
	 */
	public static String test(String t, TwoArgFunction<String,String,String> c) {
		return c.apply(t, t);
	}


	//A generic two arg functional interface
	interface TwoArgFunction <A, B, R>{
		public R apply (A a, B b);
	}
	
	public static void main(String[] args) {
	
		
		 //An anonymous definition
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("IN THREAD t1!");
			}
		};
		
		//No need to write anonymous definition with Functional interface
		//Note: Functional interface can only have one undefined method
		Runnable r2 = () -> System.out.println("IN THREAD t2!");
		Thread t1 = new Thread(r1);	
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		System.out.println("Main Thread");
		
		
		//Pass the function to test function
		String result = FunctionPassing.test("test", (s1, s2) -> s1.toUpperCase() + s2.toLowerCase());
		System.out.println(result);
		
	
		
	}

}
