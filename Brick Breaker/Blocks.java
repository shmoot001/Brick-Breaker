import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Blocks extends Sprite{
	private Color color;
	public Blocks(int x, int y, int width, int height, Color color) {
		super(x, y, width, height,color);	
		this.color = color;
		}

	@Override
	public void update(Keyboard keyboard) {
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());		
	}

	public Rectangle getHited() {
		return new Rectangle (getX(),getY(),getWidth(),getHeight());		
	}
}
