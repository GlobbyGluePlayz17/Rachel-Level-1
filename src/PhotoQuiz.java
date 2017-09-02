// Copyright Wintriss Technical Schools 2013

import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String url = "http://www.basicknowledge101.com/photos/2015/space/Elephant-4214115.jpg";
		// 2. create a variable of type "Component" that will hold your image
			Component image;
		// 3. use the "createImage()" method below to initialize your Component
			image = createImage(url);
		// 4. add the image to the quiz window
			quizWindow.add(image);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			 String Q1 = JOptionPane.showInputDialog("Which galaxy is this?");
		// 7. print "CORRECT" if the user gave the right answer
			if (Q1.equalsIgnoreCase("Milky Way")) {
				JOptionPane.showMessageDialog(null, "Correct! You recognize your home galaxy (if that even makes sense... :P)!");
			}
		// 8. print "INCORRECT" if the answer is wrong
			else {
				JOptionPane.showMessageDialog(null, "Incorrect! You don't even recognize where you live... >:O");
			}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
			String url2 = "https://static.pexels.com/photos/87651/earth-blue-planet-globe-planet-87651.jpeg";
		// 11. add the second image to the quiz window
			Component image2;
			image2 = createImage(url2);
			quizWindow.add(image2);
		// 12. pack the quiz window
			//quizWindow.pack();
		// 13. ask another question
			String Q2 = JOptionPane.showInputDialog("Which planet is this?");
		// 14. check answer, say if correct or incorrect, etc.
			if (Q2.equalsIgnoreCase("Earth")) {
				JOptionPane.showMessageDialog(null, "Correct! You recognize your home planet!");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect! You don't even recognize where you live... >:O");
				}
			}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}