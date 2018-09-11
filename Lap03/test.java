import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class test {
	public int x =1;
	private int y =2;
	public static void main(String[] args) {
		int x =9;
		System.out.print("isEven number: "+isEven(x));

	
	}
	public static boolean isEven(int x) {
		return x%2==0;
	}
	public static void scanDouble(Scanner in) {
		System.out.print("Enter a number: ");
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}

	private static void printLogarithm(double x) {
		Array.
		// TODO Auto-generated method stub
		
	}
}
