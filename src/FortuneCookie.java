import javax.swing.JFrame;
import javax.swing.JButton;
/*
Fortune Cookie recipe: Create a button that gives one of five random fortunes when clicked.

Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 

Make a JFrame in showButton method and get it to show.

Make a JButton and add it to the JFrame.

Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.

Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.
 */

public class FortuneCookie {
	public static void main(String[] args) {
		
	}
	
	public static void showButton() {
		System.out.println("YO!");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
	}
}
