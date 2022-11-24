package objectDemo.equals;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(4, 1, 45000);
		Laptop l2 = new Laptop(4, 1, 45000);
		System.out.println(l1 == l2);// false
		Laptop l3 = l1;
		System.out.println(l1 == l3);// true
		System.out.println(l1.equals(l2));// false
		System.out.println(l1.equals(l3));// true

	}
}
