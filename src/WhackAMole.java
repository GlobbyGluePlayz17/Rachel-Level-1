import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("Mole");
	
	Date timeAtStart = new Date();
	static int molesWacked = 0;
	static int fails = 0;
	
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
		if (molesWacked == 10) {
			JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
			JOptionPane.showMessageDialog(null, "End Game.");
		}
		
		if (fails == 1) {
			speak("You're a dork. You suck. Try Again.");
		}
		
		if (fails == 2) {
			speak("You're an idiot.");
		}
		
		if (fails == 3) {
			speak("You are a moron.");
		}
		
		if (fails == 4) {
			speak("You are a complete waste of atoms. U even hue-mon?");
		}
		
		if (fails == 5) {
			speak("You should have never existed. Do you even have a brain?!?");
		}
	}
	
	public static void main(String[] args) {
		int rand = new Random().nextInt(24);
		new WhackAMole().drawButtons(rand);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(mole)) {
			speak("You hit the mole. Now do it again.");
			playSound("WhackAMole.wav");
			frame.dispose();
			int rand = new Random().nextInt(24);
			new WhackAMole().drawButtons(rand);
			molesWacked++;
			endGame(timeAtStart, molesWacked);
		} else {
			fails++;
			endGame(timeAtStart, molesWacked);
		}
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
