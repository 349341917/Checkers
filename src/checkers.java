import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class checkers {
	
	
					
	public static void main(String[] args) {
		
		Board b = initializeBoard(new Board(9,9));
		boolean p1 = true;
		boolean pClicked;
		boolean isLegal = false;
		Color pegColor = null;
		Coordinate clicked;
		Coordinate start = null;
		Coordinate dest;
		
		while (true) {
			pClicked = false;
			while (pClicked == false) {
				start = b.getClick();
				if (b.isOwn(start, p1)) {
					pClicked = true;
					pegColor = b.getColor(start);
					b.removePeg(start.getRow(), start.getCol());
				}
			}
			isLegal = false;
			while (!isLegal) {
				dest = b.getClick();
				if (b.isLegalMove(start, dest, p1)) {
					b.putPeg(p1 ? Color.red: Color.BLUE, dest.getRow(), dest.getCol());
					if (Math.abs(start.getCol()-dest.getCol()) == 2) b.removePeg((dest.getRow()+start.getRow())/2, (dest.getCol()+start.getCol())/2); 	
					isLegal = true;
				}
			}
			
			p1 = !p1;
			
		}
		
		
			
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
	
	
}
		
		
		
	


