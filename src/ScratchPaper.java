
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

//Primitive types:
	//double(decimal, double memory of float, 64GB, 8bytes*8), float(decimal, 32BG, 4bytes*8), long(integer, 64bit), int(integer, 32bit),
	//char(single letter, needs 's'), short(small number, less memory, up to 65,000, 16bit), boolean(true or false), byte(up to 256, 8bit)
		//type name = value - char letter = 'a';		*String can be initiated to look like a primitive type

//Non-Primitive types - String
	//has methods in itself, basically its own class
	//ex: .substring(0, 5) --- first # is inclusive(counted), second # is exclusive(not-counted)

//Variable types:
	//member/instance variable - non-static (this.pinapple)
	//static variable - static, shared by entire class (move(0);)