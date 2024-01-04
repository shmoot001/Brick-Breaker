import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class Objects_In_Game {
	
	private Block_info block_info;
	private Walls walls;
	private Ball ball;
	private Player player;
	private Blocks_array blocks;

	private GameBoard board;
	
	private int lifes = 3;
	private int score = 0;
	private String name;




	public Objects_In_Game(GameBoard board) {
		this.board = board;
		block_info = new Block_info();
		ball = new Ball();
		player = new Player();
		blocks = new Blocks_array();
		walls = new Walls(); 
	}


	public GameBoard getBoard() {
		return board;
	}

	public void setBoard(GameBoard board) {
		this.board = board;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Block_info getBlock_info() {
		return block_info;
	}
	public void setBlock_info(Block_info block_info) {
		this.block_info = block_info;
	}
	public Walls getWalls() {
		return walls;
	}
	public void setWalls(Walls walls) {
		this.walls = walls;
	}
	public Blocks_array getBlocks() {
		return blocks;
	}
	public void setBlocks(Blocks_array blocks) {
		this.blocks = blocks;
	}
	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getLifes() {
		return lifes;
	}
	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}



}
