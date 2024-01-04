import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class High_Score_List{

	private DefaultListModel high_score_model;
	private JList high_score_list;

	public High_Score_List() {
		high_score_model = new DefaultListModel();
		high_score_list = new JList(high_score_model);
	}
	


	public void addHS(int score, String name) {
		if (score < 10) {
		high_score_model.addElement("00"+score+" "+name);
		}
		else if  (score < 100) {
			high_score_model.addElement("0"+score+" "+name);
		} else {
			high_score_model.addElement(score+" "+name);
		}
		sort(high_score_model);
		if(high_score_model.size() > 10) {
			high_score_model.remove(0);
		}
	}
	
	public void sort(DefaultListModel model) {
		ArrayList<String>  tmp = new ArrayList<>();
		for (int i = 0; i < model.size(); i++) {	
			tmp.add((String) model.get(i));
		}
		Collections.sort(tmp, Collections.reverseOrder());
		model.removeAllElements();
		for (String s : tmp) {
			model.addElement(s);
		}
	}
	
public DefaultListModel getHigh_score_model() {
	return high_score_model;
}
public void setHigh_score_model(DefaultListModel high_score_model) {
	this.high_score_model = high_score_model;
}
public JList getHigh_score_list() {
	return high_score_list;
}
public void setHigh_score_list(JList high_score_list) {
	this.high_score_list = high_score_list;
}

}
