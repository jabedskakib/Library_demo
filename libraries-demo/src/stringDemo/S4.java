package stringDemo;

public class S4 {
	public static void main(String[] args) {
		char[] ch = { 'a', 'p', 'p', 'l', 'e' };
		String s1 = String.copyValueOf(ch);
		System.out.println(s1);

		String s2 = String.valueOf(ch);
		System.out.println(s2);

		String s3 = String.valueOf(false);
		System.out.println(s3);

		String s4 = String.valueOf(107.56777);
		System.out.println(s4);
	}
}
