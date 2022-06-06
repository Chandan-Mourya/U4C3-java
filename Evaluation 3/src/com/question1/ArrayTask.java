package com.question1;

import java.util.Scanner;


public class ArrayTask {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");

		try {
			int access = sc.nextInt();
			try {
				System.out.println("The array element at index " + access + "=" + arr[access]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			}
		} catch (Exception e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}
}