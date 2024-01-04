import java.awt.Color;
import java.awt.Graphics2D;

public class Walls {
	private Wall [] wall;
	public Walls() {
		
		
		wall = new Wall[3];
		
		for(int i = 0; i < 3; i++) {
			wall[0] = new Wall(0,0,12,600,Color.white); 
			wall[1] = new Wall(788,0,12,600,Color.white);
			wall[2] = new Wall(0,0,800,12,Color.white);
		}
		
	}


	public Walls(Walls walls) {
		// TODO Auto-generated constructor stub
	}


	public void draw(Graphics2D graphics) {
		for (int i = 0; i < 3; i++) {
			wall[0].draw(graphics);
			wall[1].draw(graphics);
			wall[2].draw(graphics);
		} 
		
		
	}

}
