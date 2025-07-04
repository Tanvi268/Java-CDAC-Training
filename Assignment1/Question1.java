package com.dkte;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num: ");
		int num = sc.nextInt();
		System.out.print("given number is:"+num);
		System.out.print("\noctal number of given num is "+Integer.toOctalString(num));
		System.out.print("\nbinary number of given num is "+Integer.toBinaryString(num));
		System.out.print(" \nhexadecimal number of given num is "+Integer.toHexString(num));
		
		}
}
