import javax.swing.JButton;
import javax.swing.JFrame;

public class JFramePractice {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("Click me!");
		frame.add(button);
		frame.pack();
	}
}
