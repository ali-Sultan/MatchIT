import se.lth.cs.pt.window.SimpleWindow;

public class TimeMeasure {
	public static void main(String[] args) {
//		SimpleWindow w = new SimpleWindow(600, 600, "Drawing Window");
		long start = System.currentTimeMillis();
		//this.sleep(2000);
	    //Thread.sleep(1000);
		SimpleWindow.delay(2000);
		long end = System.currentTimeMillis();
		long sleeping=end-start;
		System.out.print(sleeping);
	}

}
