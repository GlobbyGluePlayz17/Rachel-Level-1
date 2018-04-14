import java.util.Random;

public class DonutClass {
	private String topping;
	private int totalPrice;
	
	DonutClass(String topping, int totalPrice) {
		this.topping = topping;
		this.totalPrice = totalPrice;
	}
	
	public String getTopping() {
		return this.topping;
	}
	
	public void setTopping() {
		this.topping = topping;
	}
	
	public int getTotalPrice() {
		return this.totalPrice;
	}
	
	public void setTotalPrice() {
		this.totalPrice = totalPrice;
	}
	
	public void orderArrays() {
		Random r1 = new Random();
		int numDonuts = r1.nextInt(11);
		int numDonutstwo = numDonuts *= 2;
		System.out.println(numDonutstwo);
	}
}	
