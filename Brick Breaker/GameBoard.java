import java.awt.*;
import java.awt.event.*;
import javax.swing.JComponent;

public class GameBoard extends JComponent {
	
	private final int FPS = 60; 
	private Game game;
	private Keyboard keyboard;
	private High_Score_Board HSB;
	
	public GameBoard() {
		keyboard = new Keyboard();
		game = new Game(this);
		HSB = new High_Score_Board(this);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1000, 600);
	}
	
	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D graphics = (Graphics2D)arg0;
		graphics.setColor(new Color(53,59,72));
		graphics.fillRect(0, 0, getWidth(), getHeight());
		game.draw(graphics);
	}
	
	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		if (e.getID() == KeyEvent.KEY_PRESSED)
			keyboard.processKeyEvent(e.getKeyCode(), true);
		else if (e.getID() == KeyEvent.KEY_RELEASED)
			keyboard.processKeyEvent(e.getKeyCode(), false);
	}

	public void start() {
		while(true) {
			game.update(keyboard);
			try {
				Thread.sleep(1000 / FPS); //Throttle thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.repaint();
		}
	}
	public void Restart(Game game) {
		this.game = game;
	}
	public High_Score_Board getHSB() {
		return HSB;
	}

	public void setHSB(High_Score_Board hSB) {
		HSB = hSB;
	}
}
