public class MainTemp {

	public static void main(String[] args) {
		double [] temp = {0.8,0.3, 0.9, 2.4, 2.0, 0.8, -2.1, -2.6, -3.5, -0.6, 
				-0.4, -0.9, -2.9, -2.4, -0.6, 2.0, 3.6, 2.9, 4.5, 5.7,
				6.2, 5.7, 3.3, 0.4, -0.7, 5.3, 7.4, 5.5};
//		double minVal = Double.MAX_VALUE;
//
//
//		System.out.println(minVal);

		System.out.println("Number of days: " + temp.length);
		System.out.println("Daytime temperature for the first day of the month: " + temp[0]);
		System.out.println("Daytime temperature for last month of the month: " + temp[temp.length - 1]);
		System.out.println("The averag: " +  ArrayStatistics.avg(temp));
		System.out.println("Minimum daily temperature: " + ArrayStatistics.min(temp));
		System.out.println("Maximum daily temperature: " + ArrayStatistics.max(temp));
		System.out.println("Date of first daylight temperature below 0 degrees: " + 
				(ArrayStatistics.indexfirstNegative(temp) + 1));
	}
	
}
