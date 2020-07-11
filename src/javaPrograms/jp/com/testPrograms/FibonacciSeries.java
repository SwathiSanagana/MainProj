package com.testPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0, b=1,c = 0;
		for (int i = 0; i < 7; i++) {
			a=b; // store b value in variable a and b value with c, 
			b=c;
			c=a+b;
			System.out.println(c);
			
		}
		
	}

}
