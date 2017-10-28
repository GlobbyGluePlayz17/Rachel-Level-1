import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChuckleClicker implements ActionListener{
	JButton button;
	JButton button2;
	public static void main(String[] args) {
		ChuckleClicker CC1 = new ChuckleClicker();
		ChuckleClicker CC2 = new ChuckleClicker();
		CC2.makeButtons();
	}

	public void makeButtons() {
	  //JOptionPane.showMessageDialog(null, ":O");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		button = new JButton();
		button2 = new JButton();
		panel.add(button);
		panel.add(button2);
		button.setText("Joke");
		button2.setText("Punchline");
		frame.setVisible(true);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			JOptionPane.showMessageDialog(null, "Voldemort: Knock knock.");
		}
		if (e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "Harry Potter: Who's there? \n Voldemort: You know. \n Harry Potter: You know who? \n Voldemort: Exactly!");
		}
	}
}