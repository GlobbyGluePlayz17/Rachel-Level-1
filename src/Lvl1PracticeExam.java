import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lvl1PracticeExam implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JTextField tf = new JTextField(20);
	JButton submit = new JButton("Submit");
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		Lvl1PracticeExam l1pe = new Lvl1PracticeExam();
		l1pe.createUI();
	}
	
	public void createUI() {
		frame.setTitle("My Shopping List");
		panel1.add(tf);
		panel1.add(submit);
		panel2.add(label);
		tf.addActionListener(this);
		submit.addActionListener(this);
		panel3.add(panel1);
		panel3.add(panel2);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		frame.add(panel3);
		frame.setSize(450, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//for (int i = 0; i < 2; i++) {
		if (e.getSource().equals(submit)) {
			String userinput = tf.getText();
			label.setText("Submitted: " + "-" + userinput);
			tf.setText("");
		//	}
		}
	}
}