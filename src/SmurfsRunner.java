public class SmurfsRunner{
	
	public static void main(String[] args) {
		Smurf smurf1 = new Smurf("Handy Smurf");
		String printname = smurf1.getName();
		System.out.println(printname);
		smurf1.eat();
	
		System.out.println("");
		
		Smurf smurf2 = new Smurf("Papa Smurf");
		String printname2 = smurf2.getName();
		System.out.println(printname2);
		String hatcolor = smurf2.getHatColor("red");
		System.out.println(hatcolor);
		String genderprint = smurf2.isGirlOrBoy("boy");
		System.out.println(genderprint);
		
		System.out.println("");
		
		Smurf smurf3 = new Smurf("Smurfette");
		String printname3 = smurf3.getName();
		System.out.println(printname3);
		String hatcolor2 = smurf3.getHatColor("white");
		System.out.println(hatcolor2);
		String genderprint2 = smurf3.isGirlOrBoy("girl");
		System.out.println(genderprint2);
	}

}