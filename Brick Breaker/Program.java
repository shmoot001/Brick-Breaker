import java.awt.event.KeyEvent;
import javax.swing.*;

public class Program extends JFrame {
	GameBoard gameboard;
	public Program() {
		gameboard = new GameBoard();
		add(gameboard);
		setResizable(true);
		pack();
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		gameboard.start();
	}
	
	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		gameboard.processKeyEvent(e);
	}

	public static void main(String[] args) {
		Program program = new Program();
	}

}
