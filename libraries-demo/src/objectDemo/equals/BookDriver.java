package objectDemo.equals;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book(1, 250, 12);
		Book b2 = new Book(1, 250, 12);
		System.out.println(b1 == b2);// false
		System.out.println(b1.equals(b2));// true
		Book b3 = b1;
		System.out.println(b1 == b3);// s true
		System.out.println(b1.equals(b3));// true

		System.out.println("b1.hashCode():" + b1.hashCode());
		System.out.println("b2.hashCode():" + b2.hashCode());
	}
}
