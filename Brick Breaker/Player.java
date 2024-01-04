import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Player extends Sprite {
	
	public Player() {
		super(0,580,90,12,Color.white);
		
	}

	@Override
	public void update(Keyboard keyboard) {
		
		if(keyboard.isKeyDown(Key.Left)) {
			if(getX()>= 12) {
				setX(getX()-10);}
		}
		if(keyboard.isKeyDown(Key.Right)) {
			if(getX() < 700) {
				setX(getX()+10);}
		}
	}

	
	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(new Color(0,151,230));
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	
	public Rectangle getHited() {
		return new Rectangle (getX(),getY(),getWidth(),getHeight());		
	}

}
