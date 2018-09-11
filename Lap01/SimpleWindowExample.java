import java.awt.*;
import java.awt.event.MouseEvent;

import se.lth.cs.pt.window.SimpleWindow; 
import javax.swing.*;
// Create a simple GUI window
public class SimpleWindowExample {
   private static void createWindow() {
      //Create and set up the window.
      JFrame frame = new JFrame("Simple GUI");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
      textLabel.setPreferredSize(new Dimension(300, 100));
      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      //Display the window.
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
   }
   
   public void mouseClicked(MouseEvent me) {
            
       System.out.println(me.getX());
       System.out.println(me.getY());
        
       }
   
   private static void simpleDrwo() {
		SimpleWindow w = new SimpleWindow(500, 500, "Drawing Window");
		w.moveTo(100, 100);
		w.lineTo(150, 100);
		while (true) {
			 //void waitForMouseClick(); 
			
			w.waitForMouseClick();

			int x= w.getMouseX();
			int y= w.getMouseY();
			System.out.print(y + " ");
			System.out.print(x);

			w.lineTo(x,y);
			
			 //void mouseClicked(MouseEvent e)
			// wait until the user clicks a mouse button
			// draw a line to the point where the user clicked
			} 
		}
   public static void main(String[] args) {
      //createWindow();
	  simpleDrwo();
   }
} 
