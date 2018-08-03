package com.factorial;
class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		super(message);
	}
}
class FactorialException extends Exception{
	public FactorialException(String message) {
		super(message);
	}
}

public class Factorial {
	int getFactorial(int num) throws Exception {
		if(num==0 || num==1) {
			throw new InvalidInputException("Number cannot be 0 or 1");//throwing exception when input is 0 or 1
		}
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		if(fact>2_147_483_647) {
			throw new FactorialException("Number is out of range");//throwing exception when input is greater than range of integer
		}
		return (int)fact;
	}
}
