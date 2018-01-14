import javax.swing.JOptionPane;

public class IntroToMethodWriting {
	public static void main(String[] args) {
		iRock();
		
		Rocker("Bob");
		
		Echo("Joe");
		
		String name = JOptionPane.showInputDialog("Who is your favorite singer?");
		Truth(name);
		
		String message = JOptionPane.showInputDialog("Write in a message.");
		String repeat = JOptionPane.showInputDialog("Now, write in a number. [distant]*owww");
		int repeat2 = Integer.parseInt(repeat);
		Echo2(message, repeat2);
		
		String number = JOptionPane.showInputDialog("Type in a numver.");
		String numbers = JOptionPane.showInputDialog("Type in a number again. :O");
		int one = Integer.parseInt(number);
		int two = Integer.parseInt(numbers);
		int sum = Add(one, two);
		System.out.println("The sum is " + sum + ".");
		
		String chose = JOptionPane.showInputDialog("Type in a number. AGINA.");
		int num = Integer.parseInt(chose);
		boolean numfinal = isEven(num);
		System.out.println("This number is even: " + numfinal);
	}
	public static void iRock() {
		
		System.out.println("Billy rocks!");
	}
	
	public static void Rocker(String name) {
		
		System.out.println(name + " rocks!");
	}
	
	public static void Truth(String name) {
		if (name.equals("Justin Bieber")) {
			System.out.println(name + " suks. XP");
		}else {
			System.out.println(name + " is awesome. o.O");
		}
	}
	
	public static void Echo(String stinrng) {
		for (int i = 0; i < 2; i++) {
			System.out.println(stinrng);
		}
	}
	
	public static void Echo2(String message, int repeat2) {
		for (int i = 0; i < repeat2; i++) {
			System.out.println(message);
		}
	}
	
	public static int Add(int one, int two) {
		return one + two;
	}
	
	public static boolean isEven(int num) {
		if (num%2 == 0) {
			return true;
			
		}else {
			return false;
		}
	}
}
