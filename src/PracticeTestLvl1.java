
public class PracticeTestLvl1 {
	
	public static void main(String[] args) {
		String name = "Java";
		int a = name.length();
		
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
					System.out.println(name.charAt(j));
				}
			}
		
		//	for (int j = 0; j <= name.length(); j++) {
			//	System.out.println(name.substring(0, j));
		//}
	}
}
