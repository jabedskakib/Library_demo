package stringDemo;

public class S2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = "hello";
		String s4 = "hello";
		System.out.println("s1==s2:" + (s1 == s2));// false
		System.out.println("s1.equals(s2):" + s1.equals(s2));// true

		System.out.println("s1==s3:" + (s1 == s3));// false
		System.out.println("s1.equals(s3):" + s1.equals(s3));// true

		System.out.println("s3==s4:" + (s3 == s4));// true
		System.out.println("s3.equals(s4):" + s1.equals(s2));// true

	}
}
