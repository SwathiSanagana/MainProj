package com.testPrograms;

import org.testng.annotations.Test;

public class StringOps {
	static String str="9876543210";

	public static void main(String[] args) {
		reverseString();
	}
	@Test
	public static void reverseString() {
		String reversedString = "";
		for (int i = str.length()-1; i >0; i--) {
			reversedString+=str.charAt(i);
		}
		System.out.println(reversedString);
	}

	@Test
	public static void removeDupliCharsFromString() {
		char[] arr = str.toCharArray();
		String uniqueString = "";
		for (int i = 0; i < str.length(); i++) {
			if (!uniqueString.contains(String.valueOf(arr[i]))) {
				uniqueString+= str.charAt(i);
			}
			
		}
		System.out.println("String with Unique Chars "+ uniqueString);
	}
	
	
	@Test
	public static void flyodsTraingle() {
		int n=0;
		for (int i =0; i<=5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(n++ + " ");
			}
			System.out.println();
		}
		
	}

}
