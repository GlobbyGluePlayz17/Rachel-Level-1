import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotPractice {
	private String shape;
	private String imageURL;
	Robot r1 = new Robot();
	
	RobotPractice(String shape, String imageURL) {
		this.shape = shape;
		this.imageURL = imageURL;
	}
	
	public String GetShape() {
		return this.shape;
	}
	
	public void SetShape(String shape) {
		this.shape = shape;
	}
	
	public String GetImage() {
		return this.imageURL;
	}
	
	public void SetImage(String imageURL) {
		this.imageURL = imageURL;
	}
	
	public void draw() {
		if (shape.equalsIgnoreCase("square")) {
			r1.changeRobot("https://www.wikihow.com/images/thumb/9/9a/User-Completed-Image-Draw-a-Robot-2016.08.03-10.10.24.0.png/-crop-225-225-126px-User-Completed-Image-Draw-a-Robot-2016.08.03-10.10.24.0.png");
			r1.setSpeed(30);
			r1.penDown();
			r1.setRandomPenColor();
			for (int i = 0; i <4; i++) {
				r1.move(100);
				r1.turn(90);
			}
			r1.hide();
		}
		if (shape.equalsIgnoreCase("circle")) {
			r1.changeRobot("https://exceptionnotfound.net/content/images/2017/05/rubber-duck-art-piece.jpg");
			r1.setSpeed(40);
			r1.penDown();
			r1.setRandomPenColor();
			for (int i = 0; i <360; i++) {
				r1.move(1);
				r1.turn(360/360);
			}
			r1.hide();
		}
		if (shape.equalsIgnoreCase("rectangle")) {
			r1.changeRobot("http://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/whaleshark.png?itok=8qpUgHgW&resize=1100x619\"");
			r1.setSpeed(10);
			r1.penDown();
			r1.setRandomPenColor();
			for (int i = 0; i < 2; i++) {
			r1.move(100);
			r1.turn(90);
			r1.move(50);
			r1.turn(90);
			}
			r1.hide();
		}
		if (shape.equalsIgnoreCase("triangle")) {
			r1.changeRobot("https://vignette.wikia.nocookie.net/clubpenguin/images/2/2d/Illuminati.png/revision/latest?cb=20150117022611");
			r1.setSpeed(10);
			r1.penDown();
			r1.setRandomPenColor();
			for (int i = 0; i <3; i++) {
				r1.move(100);
				r1.turn(360/3);
			}
			r1.hide();
		}
	}
}