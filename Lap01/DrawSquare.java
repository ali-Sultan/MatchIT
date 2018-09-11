import java.awt.Color;

import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawSquare {

public static void main (String [] args) {
SimpleWindow w = new SimpleWindow (600, 600, "square");
Square sq = new Square(20, 10, 40);

w.setLineColor(Color.blue);
w.setLineWidth(5);
sq.draw(w);
System.out.println(sq.getArea());
}
}

