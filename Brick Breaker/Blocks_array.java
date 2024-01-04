import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class Blocks_array  {
	private int antal_blockar = 10;
	private Blocks[] block_1;
	public Blocks[] getBlock_1() {
		return block_1;
	}

	public void setBlock_1(Blocks[] block_1) {
		this.block_1 = block_1;
	}

	public Blocks[] getBlock_2() {
		return block_2;
	}

	public void setBlock_2(Blocks[] block_2) {
		this.block_2 = block_2;
	}

	public Blocks[] getBlock_3() {
		return block_3;
	}

	public void setBlock_3(Blocks[] block_3) {
		this.block_3 = block_3;
	}

	private Blocks[] block_2;
	private Blocks[] block_3;
	

	public Blocks_array() {
		
		
		block_1 = new Blocks[antal_blockar];
		block_2 = new Blocks[antal_blockar];
		block_3 = new Blocks[antal_blockar];
		
		
		for(int i = 0; i<antal_blockar; i++) {	
				block_1[i] = new Blocks(75*i+40,110,50,12,Color.cyan);
				block_2[i] = new Blocks(75*i+40,78,50,12,new Color(69,170,242));
				block_3[i] = new Blocks(75*i+40,45,50,12,Color.blue);
				}	
	
			}

	

	public void draw(Graphics2D graphics) {
		
		for(int i = 0; i < antal_blockar; i++) {
			block_1[i].draw(graphics);
			block_2[i].draw(graphics);
			block_3[i].draw(graphics);	
		}
	}
}


