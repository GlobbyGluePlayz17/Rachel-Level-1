import java.util.Random;

import javax.swing.JOptionPane;

public class MthodWtingTo {
	public static void main(String[] args) {
		String friendname = JOptionPane.showInputDialog("Who's present would you like to know? Choices: Sofie, Ariana, or Charissa.");
		System.out.println(whichPresent(friendname));
		
		String food = JOptionPane.showInputDialog("What food do you want to know that pigs can eat? *type in bananas plz*");
		doPigsEat("bananas");
		
		JOptionPane.showMessageDialog(null, "Your lucky number is: " + getLuckyNumber() + ".");
		
		System.out.println("Mom wants " + numEggsMomWants() + " eggs.");
		System.out.println("Dad wants " + numEggsDadWants() + " eggs.");
		System.out.println("Baby wants " + numEggsBabyWants() + " eggs.");
		System.out.println("Everyone wants " + numEggsEveryoneWants() + " eggs.");
	}
	public static String whichPresent(String friendname) {
		if (friendname.equalsIgnoreCase("Sofie")) {
			return "Cookies";
			
		} else if (friendname.equalsIgnoreCase("Ariana")) {
			return "Milk";
			
		} else if (friendname.equalsIgnoreCase("Charissa")) {
			return "5 gallons of glue.";
		} else {
			return "unknown.";
		}
	}
	
	public static boolean doPigsEat(String food) {
		if (food.equalsIgnoreCase("bananas")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getLuckyNumber() {
		Random rand = new Random();
		int randgen = rand.nextInt(656) + 13;
		return randgen;
	}
	
	public static int numEggsMomWants() {
		Random rand = new Random();
		int mom = rand.nextInt(43);
		return mom;
	}
	public static int numEggsDadWants() {
		Random rand = new Random();
		int dad = rand.nextInt(43);
		return dad;
	}
	public static int numEggsBabyWants() {
		Random rand = new Random();
		int baby = rand.nextInt(43);
		return baby;
	}
	public static int numEggsEveryoneWants() {
		return numEggsMomWants() + numEggsDadWants() + numEggsBabyWants();
	}
}
