package snippet;

import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;
import java.awt.*;
import java.util.Arrays;


public class SmallGame {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Drawing Window");
		boolean xy = true;
		// xy determine which player turn is it
		boolean[] blockUesedArray = new boolean[9];
		// keep track of the used cells in the game and find out if we got a draw
		boolean[] Player1Array = new boolean[9];
		// keep track of player 1 used cells and if p1 win
		boolean[] Player2Array = new boolean[9];
		int score1 = 0;
		int score2 = 0;
//		each player score 
		initialize(w, blockUesedArray, Player1Array, Player2Array, score1, score2);

		while (true) {

			if (win(Player1Array)) {

				// here we test if a game ended and we change the scores accordingly
				score1 += 1;
				w.moveTo(225, 175);
				w.writeText("Congrats Player One wins!");
				w.moveTo(225, 275);
				w.writeText("click anywhere to continue..");
				w.waitForMouseClick();
				initialize(w, blockUesedArray, Player1Array, Player2Array, score1, score2);
			} else if (win(Player2Array)) {
				score2 += 1;
				w.moveTo(225, 175);
				w.writeText("Congrats Player Two wins!");
				w.moveTo(225, 275);
				w.writeText("click anywhere to continue..");
				w.waitForMouseClick();
				initialize(w, blockUesedArray, Player1Array, Player2Array, score1, score2);
			} else if (allTrue(blockUesedArray)) {
				w.moveTo(225, 175);
				w.writeText("It's a drow!");
				w.moveTo(225, 275);
				w.writeText("click anywhere to continue..");
				w.waitForMouseClick();
				initialize(w, blockUesedArray, Player1Array, Player2Array, score1, score2);
			}

			w.waitForMouseClick();
			int x = w.getMouseX();
			int y = w.getMouseY();
			// adding a stupid AI as next step using random to select where AI want to play
			// Random rand = new Random();
			// int aIGuess = rand.nextInt(9);
			
			
			//I divided the frame into 9 smaller areas, each with a code name f1 , f2 ...respectively
			// player draw x in position f1
			if (x >= 0 && x < 200 && y > 0 && y < 200 && !blockUesedArray[0]) {
				f1(xy, w);
				blockUesedArray[0] = true;
				if (xy) {
					Player1Array[0] = true;
				} else {
					Player2Array[0] = true;
				}
				xy = !xy;

			} else if (x > 200 && x < 400 && y > 0 && y < 200 && !blockUesedArray[1]) {
				f2(xy, w);
				blockUesedArray[1] = true;
				if (xy) {
					Player1Array[1] = true;
				} else {
					Player2Array[1] = true;
				}
				xy = !xy;

			} else if (x > 400 && x < 600 && y > 0 && y < 200 && !blockUesedArray[2]) {
				f3(xy, w);
				blockUesedArray[2] = true;
				if (xy) {
					Player1Array[2] = true;
				} else {
					Player2Array[2] = true;
				}
				xy = !xy;

			} else if (x >= 0 && x < 200 && y > 200 && y < 400 && !blockUesedArray[3]) {
				f4(xy, w);
				blockUesedArray[3] = true;
				if (xy) {
					Player1Array[3] = true;
				} else {
					Player2Array[3] = true;
				}
				xy = !xy;

			} else if (x > 200 && x < 400 && y > 200 && y < 400 && !blockUesedArray[4]) {
				f5(xy, w);
				blockUesedArray[4] = true;
				if (xy) {
					Player1Array[4] = true;
				} else {
					Player2Array[4] = true;
				}
				xy = !xy;

			} else if (x > 400 && x < 600 && y > 200 && y < 400 && !blockUesedArray[5]) {
				f6(xy, w);
				blockUesedArray[5] = true;
				if (xy) {
					Player1Array[5] = true;
				} else {
					Player2Array[5] = true;
				}
				xy = !xy;

			} else if (x >= 0 && x < 200 && y > 400 && y < 600 && !blockUesedArray[6]) {
				f7(xy, w);
				blockUesedArray[6] = true;
				if (xy) {
					Player1Array[6] = true;
				} else {
					Player2Array[6] = true;
				}
				xy = !xy;

			} else if (x > 200 && x < 400 && y > 400 && y < 600 && !blockUesedArray[7]) {
				f8(xy, w);
				blockUesedArray[7] = true;
				if (xy) {
					Player1Array[7] = true;
				} else {
					Player2Array[7] = true;
				}
				xy = !xy;

			} else if (x > 400 && x < 600 && y > 400 && y < 600 && !blockUesedArray[8]) {
				f9(xy, w);
				blockUesedArray[8] = true;
				if (xy) {
					Player1Array[8] = true;
				} else {
					Player2Array[8] = true;
				}
				xy = !xy;

			}
		}

	}

	static boolean win(boolean[] x) 
	{
//		/here we check the boolean array for each player to see if he got a win case	
		if (   x[0] && x[4] && x[8] 
			|| x[2] && x[4] && x[6] 
			|| x[0] && x[1] && x[2] 
			|| x[3] && x[4] && x[5]
			|| x[6] && x[7] && x[8] 
			|| x[0] && x[3] && x[6] 
			|| x[1] && x[4] && x[7] 
			|| x[2] && x[5] && x[8]) 
		{
			return true;

		} else 
		{
			return false;
		}
	}

	static void f1(boolean x, SimpleWindow w) 
	{
//		in here we draw X or O depending on boolean x in area F1
		if (x) {
			// w.moveTo(100, 100);
			DrawX(w, 0, 0);
			// w.writeText("X");
		} else {
			// w.moveTo(100, 100);
			// w.writeText("O");
			DrawO(w, 0, 0);

		}

	}

	static void f2(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(300, 100);
//   w.writeText("X");
			DrawX(w, 200, 0);

		} else {
//   w.moveTo(300, 100);
//   w.writeText("O");
			DrawO(w, 200, 0);

		}

	}

	static void f3(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(500, 100);
//   w.writeText("X");
			DrawX(w, 400, 0);

		} else {
//   w.moveTo(500, 100);
//   w.writeText("O");
			DrawO(w, 400, 0);

		}

	}

	static void f4(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(100, 300);
//   w.writeText("X");
			DrawX(w, 0, 200);

		} else {
//   w.moveTo(100, 300);
//   w.writeText("O");
			DrawO(w, 0, 200);

		}

	}

	static void f5(boolean x, SimpleWindow w) {

		if (x) {
//   w.moveTo(300, 300);
//   w.writeText("X");
			DrawX(w, 200, 200);

		} else {
//   w.moveTo(300, 300);
//   w.writeText("O");
			DrawO(w, 200, 200);

		}

	}

	static void f6(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(500, 300);
//   w.writeText("X");
			DrawX(w, 400, 200);

		} else {
//   w.moveTo(500, 300);
//   w.writeText("O");
			DrawO(w, 400, 200);

		}

	}

	static void f7(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(100, 500);
//   w.writeText("X");
			DrawX(w, 0, 400);

		} else {
//   w.moveTo(100, 500);
//   w.writeText("O");
			DrawO(w, 0, 400);

		}

	}

	static void f8(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(300, 500);
//   w.writeText("X");
			DrawX(w, 200, 400);

		} else {
//   w.moveTo(300, 500);
//   w.writeText("O");
			DrawO(w, 200, 400);

		}

	}

	static void f9(boolean x, SimpleWindow w) {
		if (x) {
//   w.moveTo(500, 500);
//   w.writeText("X");
			DrawX(w, 400, 400);

		} else {
//   w.moveTo(500, 500);
//   w.writeText("O");
			DrawO(w, 400, 400);

		}

	}

	static void DrawO(SimpleWindow w, int x, int y) {
		Square sq = new Square(x + 25, y + 25, 150);

		w.setLineColor(Color.blue);
		w.setLineWidth(5);
		sq.draw(w);

	}

	static void DrawX(SimpleWindow w, int x, int y) {
		w.setLineColor(Color.red);

		w.setLineWidth(5);
		w.moveTo(x + 10, y + 10);
		w.lineTo(x + 190, y + 190);
		w.moveTo(x + 10, y + 190);
		w.lineTo(x + 190, y + 10);

	}

	private static void initialize(SimpleWindow w, boolean[] blockUesedArray, boolean[] Player1Array,
			boolean[] Player2Array, int score1, int score2) {
// initialize method make the shape # of an X/O game and write the players score in the corner 
		w.clear();
		w.setLineColor(Color.DARK_GRAY);
		w.setLineWidth(5);
		Arrays.fill(blockUesedArray, Boolean.FALSE);
		Arrays.fill(Player1Array, Boolean.FALSE);
		Arrays.fill(Player2Array, Boolean.FALSE);
		w.moveTo(200, 0);
		w.lineTo(200, 600);
		w.moveTo(400, 0);
		w.lineTo(400, 600);
		w.moveTo(0, 200);
		w.lineTo(600, 200);
		w.moveTo(000, 400);
		w.lineTo(600, 400);
		w.moveTo(10, 10);
		w.writeText(" Player One score : " + score1);
		w.moveTo(400, 10);
		w.writeText(" Player Two score : " + score2);

	}

	// future update to reset the score
	private static void ResetScore(int score1, int score2) {
		score1 = score2 = 0;
	}

	private static boolean allTrue(boolean[] values) {
		// test a boolean array to see it's filled with trues
		for (boolean value : values) {
			if (!value)
				return false;
		}
		return true;
	}
}
