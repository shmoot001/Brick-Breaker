import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Ball extends Sprite {
	Font myFont = new Font ("", 0, 17);
	Font myFont_1 = new Font ("", 0, 90);


	private int ballX = -4;
	private int ballY = 6;
	
	public Ball() {
		super(400, 300, 18, 18,Color.blue);
	}

	@Override
	public void update(Keyboard keyboard) {
		setX(getX()+ ballX);
		setY(getY()+ ballY);
		if(getX()  <= 12) {
			ballX = -ballX;				
		}
		if(getX() >= 770) {
			ballX = -ballX;
		}
		if(getY() <= 12) {
			ballY = -ballY;
		}
	}
	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.white);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	public void changeMove() {
		ballY = - ballY;
	}


	public Rectangle getHited() {
		return new Rectangle (getX(),getY(),getWidth(),getHeight());		
	}
	public int getBallX() {
		return ballX;
	}

	public void setBallX(int ballX) {
		this.ballX = ballX;
	}

	public int getBallY() {
		return ballY;
	}

	public void setBallY(int ballY) {
		this.ballY = ballY;
	}


}