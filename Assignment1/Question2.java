package com.dkte;

import java.util.Scanner;

public class Question2 {
	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		      System.out.print("Enter 1st value: ");
		        if((sc.hasNextDouble())&&(sc.hasNextInt())) {
		            System.out.println("Error: Input is not a valid double.");
		            return; 
		        }
		        
		        double num1 = sc.nextDouble();	
		        System.out.print("Enter 2nd value: ");
		        if ((sc.hasNextDouble())&&(sc.hasNextInt())) {
		            System.out.println("Error: Input is not a valid double.");
		            return; 
		        }
		        
		        double num2 = sc.nextDouble();
		        
	            double average = (num1 + num2) / 2;
		        System.out.println("Average: " + average);
		    }
		
	}


