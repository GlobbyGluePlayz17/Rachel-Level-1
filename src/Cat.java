public class Cat {

	private String name;
	private int lives = 5;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("Meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}
	
	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("Nice try, but "+ name +" still have " + lives + " lives left. >:o");
		else if (lives < 0)
			System.out.println("That's overkill, yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		
		// 1. Make the Cat meow
			Cat cat = new Cat("CAT");
		// 2. Get the Cat to print it's name
			cat.printName();
		// 3. Kill the Cat!
			for (int i = 0; i < 10; i++) {
			cat.kill();
		}
	}
}