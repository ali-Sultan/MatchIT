import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
public static void main (String [] args) {
SimpleWindow w = new SimpleWindow (500, 500, "LineDrawing");
w.moveTo (100, 100);
w.lineTo(150, 150);

while (true) {
// wait until the user clicks a mouse button
// draw a line to the point where the user clicked
}
}
}
/*
Clue: SimpleWindow also includes methods for managing mouse clicks. These
Methods have the following description:
¨*/
/** Waiting until the user has clicked a mouse button * /
void waitForMouseClick ();
/ ** Determines the x coordinate of the mouse's position
at last mouse click */
//int getMouseX (); 