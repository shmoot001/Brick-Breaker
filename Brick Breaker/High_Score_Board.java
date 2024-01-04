import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.WindowConstants;



public class High_Score_Board extends JFrame implements ActionListener {

	private JPanel high_score_panel;
	private JPanel lastest_run_panel;

	private High_Score_List HSL;
	private Lastest_Runs_List LRL;


	private JButton restart;
	private GameBoard board;

	public High_Score_Board(GameBoard board) {

		this.board = board;
		
		restart = new JButton("Restart");
		HSL = new High_Score_List();
		LRL = new Lastest_Runs_List();

		setLayout(new GridLayout(3, 1));
		high_score_panel = new JPanel();
		high_score_panel.setBackground(new Color(53,59,72));
		high_score_panel.add(new JLabel("High Score"), BorderLayout.NORTH);
		high_score_panel.add(HSL.getHigh_score_list(), BorderLayout.CENTER);
		add(high_score_panel);

		lastest_run_panel = new JPanel();
		lastest_run_panel.setBackground(new Color(53,59,72));
		lastest_run_panel.add(new JLabel("Lastest runs"), BorderLayout.NORTH);
		lastest_run_panel.add(LRL.getLastest_run_list(), BorderLayout.CENTER);
		add(lastest_run_panel);

		restart.addActionListener(this);
		restart.setBackground(new Color(53,59,72));
		add(restart);
		
		setSize(300,600);
		setLocation(1010,0);
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		board.Restart(new Game(board));
	}

	public Lastest_Runs_List getLRL() {
		return LRL;
	}


	public void setLRL(Lastest_Runs_List lRL) {
		LRL = lRL;
	}
	
	public High_Score_List getHSL() {
		return HSL;
	}

	public void setHSL(High_Score_List hSL) {
		HSL = hSL;
	}
}

