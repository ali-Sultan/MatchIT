
import java.util.Scanner;

public class Calculator {
	static double Multi (double x,double y) {
		return x*y;
	}
	public static void main(String[] args) {
		System.out.println("write two numbers");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		double sum = nbr1 + nbr2;
		System.out.println("The sum of the numbers is " + sum);
		double sub = nbr1 - nbr2;
		System.out.println("The difference between the numbers is " + sub);
		//double multi = nbr1 * nbr2;
		System.out.println("The product of the languages ​​is " + Multi(nbr1,nbr2));
		double ratio = nbr1 / nbr2;
		if(nbr2==0) {
			System.out.println("can't devaide by zero");
		}else {
		System.out.println("The ratio between the numbers is " + ratio);
		}
		scan.close();
	}
}
