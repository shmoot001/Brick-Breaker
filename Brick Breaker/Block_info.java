import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Block_info {

	Font myFont = new Font ("", 0, 17);
	private Blocks[] block_info;
	public Block_info() 
	{
		block_info = new Blocks[3];
		
		for(int i = 0; i < 3; i++){
			block_info[0] = new Blocks(820,40,50,12,Color.cyan);
			block_info[1] = new Blocks(820,60,50,12,new Color(69,170,242));
			block_info[2] = new Blocks(820,80,50,12,Color.blue);
		}
		
	}
	
	public void draw(Graphics2D graphics) {
		for(int i = 0; i<3; i++) {
			block_info[i].draw(graphics);	
		}
		graphics.setColor(Color.white);
		graphics.setFont(myFont);
		graphics.drawString("1 Point",900,52);
		graphics.drawString("2 Points",900,72);
		graphics.drawString("3 Points",900,92);
		graphics.drawString("Max poäng 100",820,120);
		
		
	}

}
