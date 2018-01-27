import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("Mole");
	
	public void drawButtons(int random) {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(250, 300);
		frame.setTitle("Whack A Mole");
		mole.addActionListener(this);
		
		for (int i = 0; i < 24; i++) {
			if (i == random) {
				panel.add(mole);
			} else {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			}
		}
	}
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	public static void main(String[] args) {
		int rand = new Random().nextInt(24);
		new WhackAMole().drawButtons(rand);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(mole)) {
			speak("You are a wonderful, yet mole hitting human being. Good job!");
		} else {
			speak("You're a dork. You suck. Boo.");
		}
	}
}
