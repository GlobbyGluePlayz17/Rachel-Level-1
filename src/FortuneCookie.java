import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
/*
Fortune Cookie recipe: Create a button that gives one of five random fortunes when clicked.

Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 

Make a JFrame in showButton method and get it to show.

Make a JButton and add it to the JFrame.

Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.

Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JButton button;

	public static void main(String[] args) {
		new FortuneCookie().showButton();
	}

	public void showButton() {
		System.out.println("Yo!");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		button = new JButton();
		button.setText("Click me to get your fortune!");
		frame.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		// TODO Auto-generated method stub
		if (action.getSource() == button) {
			Random random = new Random();
			int rand = random.nextInt(6);
			System.out.println(rand);
			if (rand == 0) {
				JOptionPane.showMessageDialog(null,
						"You will live a short life and die sufferabley. That is not a word just to let you know. Good luck in life. :o");
			} else if (rand == 1) {
				JOptionPane.showMessageDialog(null, "HI...");
			} else if (rand == 2) {
				JOptionPane.showMessageDialog(null, "Hellow!");
			} else if (rand == 3) {
				JOptionPane.showMessageDialog(null,
						"Maybe you will live a good life? Maybe you won't. Who knows... I'M NOT A FORTUNE TELLER!!!");
			} else if (rand == 4) {
				JOptionPane.showMessageDialog(null, ":o");
			} else if (rand == 5) {
				JOptionPane.showMessageDialog(null,
						"You broke the game, idiot. >:P You suck with technology. YOu weRe pRobaBly nOt boRn In geNerAtiOn Z.");
			}
		}
	}
}
// the the the the the the the the the the the the the the the the the the the
// the the the the the the the the the the the the the the the the the the the