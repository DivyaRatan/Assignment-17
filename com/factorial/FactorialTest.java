package com.factorial;
import java.util.Scanner;

public class FactorialTest {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		Factorial fact=new Factorial();
		
		int num=scanner.nextInt();
		//try and catch for exception handling
		try {
			int a=fact.getFactorial(num);
			System.out.println(a);
		}
		catch(InvalidInputException e) {
			e.printStackTrace();
		}
		catch(FactorialException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
