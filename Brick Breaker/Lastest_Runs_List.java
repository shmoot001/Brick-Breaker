import java.util.*;

import javax.swing.*;

public class Lastest_Runs_List {

	private JList lastest_run_list;
	private DefaultListModel lastest_run_model;

	public Lastest_Runs_List() {
		lastest_run_model = new DefaultListModel();
		lastest_run_list = new JList(lastest_run_model);

	}
	
	public void addLS(int score) {
		lastest_run_model.add(0, score);
		if(lastest_run_model.size() > 3) {
			lastest_run_model.remove(3);
		}
	}

	public DefaultListModel getLastest_run_model() {
		return lastest_run_model;
	}
	public void setLastest_run_model(DefaultListModel lastest_run_model) {
		this.lastest_run_model = lastest_run_model;
	}
	public JList getLastest_run_list() {
		return lastest_run_list;
	}

	public void setLastest_run_list(JList lastest_run_list) {
		this.lastest_run_list = lastest_run_list;
	}
}

