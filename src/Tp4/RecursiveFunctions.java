package Tp4;

public class RecursiveFunctions {
	
//Determine recursivamente si un número dado es par o impar, usando sólo la operación resta.
	
	public static String itsevenorOdd(int n) {
		
		if(n==0) {
			return  "Its even";
		}
		else if(n==1) {
			return "Its odd";
		}
		else {
			return itsevenorOdd(n-2);
		}
	}
}
