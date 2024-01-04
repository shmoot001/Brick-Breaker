import java.awt.Color;
import java.awt.Graphics2D;

public class Wall extends Sprite {
	private Color color;
	public Wall(int x, int y, int width, int height, Color color) {
		super(x, y, width, height,color);
		this.color = color; 
	}
	

	@Override
	public void update(Keyboard keyboard) {
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(new Color(245,246,250));
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
