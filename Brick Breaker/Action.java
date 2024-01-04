import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;


public class Action {
	Font myFont = new Font ("", 0, 17);
	Font yourFont = new Font ("", 0, 100);

	private int antal_blockar = 10;

	private int hit_2[];
	private int hit_3[];

	private Objects_In_Game oig;

	public Action(GameBoard board) {
		oig = new Objects_In_Game(board);
		hit_2 = new int [antal_blockar];
		hit_3 = new int [antal_blockar];

	}

	public void update(Keyboard keyboard) throws InterruptedException {
		oig.getBall().update(keyboard);
		oig.getPlayer().update(keyboard);

		if (oig.getBall().getHited().intersects(oig.getPlayer().getHited())) {
			oig.getBall().changeMove();
		}	
		for(int i = 0; i<antal_blockar; i++) {

			if (oig.getBlocks().getBlock_1()[i].getHited().intersects(oig.getBall().getHited())) {
				oig.getBall().changeMove();
				oig.getBlocks().getBlock_1()[i].setHeight(oig.getBlocks().getBlock_1()[i].getHeight() - 32);
				oig.setScore(oig.getScore() + 1);

			}

			if (oig.getBlocks().getBlock_2()[i].getHited().intersects(oig.getBall().getHited())) {
				oig.getBall().changeMove();
				hit_2[i]++;
				if(hit_2[i] == 1) {
					oig.getBlocks().getBlock_2()[i] = new Blocks(75*i+40,78,50,12,Color.cyan);
					oig.setScore(oig.getScore() + 3);
				}
				if(hit_2[i] == 2) {
					oig.getBlocks().getBlock_2()[i].setHeight(oig.getBlocks().getBlock_2()[i].getHeight() - 32);
					oig.setScore(oig.getScore() + 1);
				}
			} 

			else if (oig.getBlocks().getBlock_3()[i].getHited().intersects(oig.getBall().getHited())) {
				oig.getBall().changeMove();
				hit_3[i]++;

				if(hit_3[i] == 1) {
					oig.getBlocks().getBlock_3()[i] = new Blocks(75*i+40,45,50,12, new Color(69,170,242));
					oig.setScore(oig.getScore() + 5);
				}

				if(hit_3[i] == 2) {
					oig.getBlocks().getBlock_3()[i] = new Blocks(75*i+40,45,50,12, Color.cyan);
					oig.setScore(oig.getScore() + 3);
				}
				if(hit_3[i] == 3) {
					oig.getBlocks().getBlock_3()[i].setHeight(oig.getBlocks().getBlock_3()[i].getHeight() - 32);
					oig.setScore(oig.getScore() + 1);
				}
			}
		}
		if (oig.getBall().getY() == 600) {
			oig.setLifes(oig.getLifes() - 1);
			if(oig.getLifes() > 0) {
				oig.setBall(new Ball());
			}
			if(oig.getLifes() == 0){
				oig.getBall().setHeight(oig.getBall().getHeight() - 18);
				oig.getPlayer().setHeight(oig.getPlayer().getHeight() - 12);

				oig.setName(JOptionPane.showInputDialog("Entre Your Name"));
				oig.setName(oig.getName().toUpperCase());
				if(oig.getName().length() > 3) {
					oig.setName(oig.getName().substring(0,3) );
				}

				oig.getBoard().getHSB().getHSL().addHS(oig.getScore(), oig.getName());;
				oig.getBoard().getHSB().getLRL().addLS(oig.getScore());
			}
		}
		if (oig.getScore() == 140) {

			oig.getBall().setHeight(oig.getBall().getHeight() - 18);
			oig.getPlayer().setHeight(oig.getPlayer().getHeight() - 12);
			oig.getBall().setBallX(oig.getBall().getBallX() + 18);
			oig.getBall().setBallY(oig.getBall().getBallY() - 20);

			oig.setName(JOptionPane.showInputDialog("Entre Your Name")) ;
			oig.setName(oig.getName().toUpperCase());
			if(oig.getName().length() > 3) {
				oig.setName(oig.getName().substring(0,3) ) ;
			}

			oig.getBoard().getHSB().getHSL().addHS(oig.getScore(), oig.getName());;
			oig.getBoard().getHSB().getLRL().addLS(oig.getScore());
			oig.setScore(oig.getScore() - 140);

		}

	}



	public void draw(Graphics2D graphics) {
		oig.getBall().draw(graphics);
		oig.getPlayer().draw(graphics);
		oig.getBlocks().draw(graphics);
		oig.getWalls().draw(graphics);
		oig.getBlock_info().draw(graphics);


		graphics.setColor(Color.white);
		graphics.setFont(myFont);
		graphics.drawString("Lifes:" + oig.getLifes(), 820,20);
		if(oig.getScore() <10) {
			graphics.drawString("Score:00" + oig.getScore(), 900,20);
		}
		else if(oig.getScore() >= 10) {
			graphics.drawString("Score:0" + oig.getScore(), 900,20);	
		}
		else {
			graphics.drawString("Score:" + oig.getScore(), 900,20);
		}
		graphics.drawString("Lifes:" + oig.getLifes(), 820,20);

		if(oig.getLifes() == 0) {
			graphics.setColor(Color.white);
			graphics.setFont(yourFont);
			graphics.drawString("Game Over", 150,300);	
		}
		if(oig.getScore() == 100) {
			graphics.setColor(Color.white);
			graphics.setFont(yourFont);
			graphics.drawString("You Won", 150,300);		
		}

	}
}
