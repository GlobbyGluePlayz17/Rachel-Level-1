import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lvl1PracticeExam implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField tf = new JTextField();
	JButton submit = new JButton("Submit");
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		Lvl1PracticeExam l1pe = new Lvl1PracticeExam();
		l1pe.createUI();
	}
	
	public void createUI() {
		frame.setTitle("My Shopping List");
		frame.add(panel);
		panel.add(submit);
		panel.add(tf);
		panel.add(label);
		tf.addActionListener(this);
		frame.setVisible(true);
	}
	String userinput = tf.getText();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(submit)) {
			label.setText("Submitted:" + userinput);
		}
	}
}