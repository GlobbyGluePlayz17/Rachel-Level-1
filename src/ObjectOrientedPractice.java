
public class ObjectOrientedPractice {
		boolean isFluffy;
		void sit(){
			System.out.println("The dog is fluffy and can sit. o.O");
		}
		
	public static void main(String[] args) {
		ObjectOrientedPractice dog = new ObjectOrientedPractice();
		dog.sit();
	}
}
//void is when you do not return anything; otherwise with int, you have to do "return s; int s = 5;"
//constructors do not have a return type
//this.name = String name = member variable ...?