import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class checkers {
	
	private Color[][] board = new Color[9][9];
					
	public static void main(String[] args) {
		
		Board b = initializeBoard(new Board(9,9));
		char[][] grid = initializeGrid();
		for (int i = 0; i < 9; i++) System.out.println(Arrays.toString(grid[i]));
		
		Coordinate c1;
		Coordinate c2;
		boolean borrow = false;
		
		int i = 0;
		
		while(true) {
			
			c1 = b.getClick();
			char ownColor = i % 2 == 1 ? 'R' : 'B';
			char enemyColor = i % 2 == 1 ? 'B' : 'R';
			int vertical = i % 2 == 1 ? -1 : 1;
			
			if (grid[c1.getRow()][c1.getCol()] == ownColor && borrow == false) {
				b.removePeg(c1.getRow(), c1.getCol());
				borrow = true;
				c2 = b.getClick();
				if (c2.getRow() == c1.getRow() + 2*vertical && (c2.getCol() == c1.getCol() + 2 || c2.getCol() == c1.getCol() + 2)) {
					
				}
				
			}
			
			
			
			
			//while (!moved)
			
			
			
			
		}
		
		
		
		/**
		while (true) {  // increments i if its odd its player 1's turn if its even it's player 2's turn
			String color = i % 2 == 1 ? "Red" : "Blue"; 
			c1 = b.getClick(); // Are the coordinates of a square that the player clicks on first
			b.removePeg(c1.getRow(), c1.getCol()); // Removes peg at c1 
			c2 = b.getClick(); // c2 are the coordinates of the destination square 
			b.putPeg(color, c2.getRow(), c2.getCol()); // puts peg of appropriate color in destination square
			b.removePeg((Math.abs(c1.getRow()+c2.getRow())/2), (Math.abs(c1.getCol()+c2.getCol())/2));
			i++;
		}
		
		
		while(true) {
			c1 = b.getClick();
			b.removePeg(0, 6);
			b.getClickc2;
			if (player == 1) {
				b.putPeg("Blue", 1, player = 2);
			}
				else {
					b.putPeg("Red", player = 1);
				}
			}
			
				}
			}
		**/
		
			
	}

	private static Board initializeBoard(Board b) {
		
		int rem;
		
		for (int i = 0; i < 3; i++) {
			
			rem = i % 2;
			for (int j = rem; j < 9; j = j + 2) b.putPeg("Red", i, j);
		
		}
		
		for (int i = 6; i < 9; i++) {
			
			rem = i % 2;
			for (int j = rem; j < 9; j = j + 2) b.putPeg("Blue", i, j);
		
		}
		
		return b;
		
	}
	
	private static char[][] initializeGrid() {
		
		char[][] grid = new char[9][9];
		
		int rem;
		
		for (int i = 0; i < 3; i++) {
			
			rem = i % 2;
			Arrays.fill(grid[i], '!');
			for (int j = rem; j < 9; j = j + 2) grid[i][j] = 'R';
		
		}
		
		for (int i = 3; i < 6; i++) Arrays.fill(grid[i], '!');
		
		for (int i = 6; i < 9; i++) {
			
			rem = i % 2;
			Arrays.fill(grid[i], '!');
			for (int j = rem; j < 9; j = j + 2) grid[i][j] = 'B';
		
		}
		
		return grid;
		
	}
	
}
		
		
		
	


