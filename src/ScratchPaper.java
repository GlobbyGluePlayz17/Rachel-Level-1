
public class ScratchPaper {
	ScratchPaper candyName;
	
	void setCandyName(String candyName) {
		//this.candyName = candyName;
	}
	boolean isSkittles() {
		if (this.candyName.equals("Skittles")) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		//candyName = new CandyName();
		
	}
}
//public - access modifier
//static - static modifier - applies to all "clouds" made (class named cloud)
//void - return type - type of [(Object - String, etc.), int, double, float, boolean, long, short, byte, and char] returned
//main - name - name of method
//String[] args  - parameter - string array list names args
