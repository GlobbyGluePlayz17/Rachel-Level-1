import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	static TypingTutor a;
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	static int score = 0;
	Date timeAtStart = new Date();
	
	public static void main(String[] args) {
	a = new TypingTutor();
	a.createUI();
		}
	
	public void createUI() {
		frame.add(panel);
		panel.add(label);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(250.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
	}
	
	char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {
			System.out.println(currentLetter);
			System.out.println("Correct!");
			panel.setBackground(Color.GREEN);
		}else {
			System.out.println("Incorrect, try again!");
			panel.setBackground(Color.RED);
		}
		if (score == 20) {
			showTypingSpeed(score);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {
			currentLetter = generateRandomLetter();
			label.setText("" + currentLetter);
			score++;
			System.out.println(score);
		}
	}
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
