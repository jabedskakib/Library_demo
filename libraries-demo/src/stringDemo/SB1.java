package stringDemo;

public class SB1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("hello");
		System.out.println(sb1.equals(sb2));//
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	}
}
