import javax.swing.JOptionPane;

public class RobotRunner {
	public static void main(String[] args) {
		String userinput = JOptionPane.showInputDialog("What shape would you like the robot to draw? Square, Rectangle, Circle, or Triangle? (If you chose a circle or a triangle, your robot will turn into a whale...hehe:)");
		RobotPractice rp1 = new RobotPractice(userinput, "https://www.wikihow.com/images/thumb/9/9a/User-Completed-Image-Draw-a-Robot-2016.08.03-10.10.24.0.png/-crop-225-225-126px-User-Completed-Image-Draw-a-Robot-2016.08.03-10.10.24.0.png");
		rp1.draw();
	}
}
