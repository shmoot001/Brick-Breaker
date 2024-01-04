import java.awt.Graphics2D;

public class Game {
	private Action action;
	public Game(GameBoard board) {
		action = new Action(board);
		}

	public void update(Keyboard keyboard) {	
		try {
			action.update(keyboard);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void draw(Graphics2D graphics) {
		action.draw(graphics);
	}
}
