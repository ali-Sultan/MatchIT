import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThrowDice {
	public static void main(String[] args) {

		System.out.println("number of throws " + 1000);
//		System.out.println("what number should we test for ");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		double y = howFrequent(x);
		double [] arr = new double[6];
		arr = howFrequentAll();
//		System.out.format("we've got %d's %f present out of 1000 trial", x, y);
		System.out.print("we've got "+Arrays.toString(arr));

	}

	private static double []  howFrequentAll() {
		double[] arr = new double[6];
		Arrays.fill(arr, 0);
		Random r = new Random();
		for(int i =0;i<1000;i++) {
		int rand = r.nextInt(6)+1;
	    switch(rand) {
       case 1:
        	arr[0]++;
            break;
        case 2:
        	arr[1]++;

            break;
        case 3:
        	arr[2]++;

            break;
        case 4:
        	arr[3]++;

            break;
        case 5:
        	arr[4]++;

            break;
        case 6:
        	arr[5]++;

            break;
	        default:
	    }
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]/1000;
		}
		return arr;

	}

	private static double howFrequent(int x) {
 		Random r = new Random();
		int count = 0;
		for(int i =0;i<1000;i++) {
		int rand = r.nextInt(6)+1;
		if(rand==x) {
			count++;
		}
		}
		return count/1000.0;
	}

}
