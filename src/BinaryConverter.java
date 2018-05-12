import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField userinput = new JTextField(5);
	JTextField answer = new JTextField(5);
	JButton button = new JButton("convert");

	public static void main(String[] args) {
		BinaryConverter b1 = new BinaryConverter();
		b1.createUI();
	}

	public void createUI() {
		frame.setVisible(true);
		frame.setTitle("Binary Converter");
		frame.setSize(300, 65);
		frame.add(panel);
		panel.add(userinput);
		panel.add(button);
		panel.add(answer);
		userinput.addActionListener(this);
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String converttostring(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			int output = convert(userinput.getText());
		}
	}
}