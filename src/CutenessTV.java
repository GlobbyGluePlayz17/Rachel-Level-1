import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	void showCat() {
		playVideo("TReCLbmhlMs");
	}

	void showMoreAnimals() {
		playVideo("77VfQKzYsnY");
	}
	
	void showScreamingAnimals() {
		playVideo("1LTxZ2aNytc");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CutenessTV run = new CutenessTV();
		run.userInterface();
	}
	
	public void userInterface() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.show();
		button1.setText("Cat");
		button2.setText("More Animals");
		button3.setText("Screaming Animals");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button1) {
			showCat();
		}
		if (e.getSource()==button2) {
			showMoreAnimals();
		}
		if (e.getSource()==button3) {
			showScreamingAnimals();
		}
	}
}

