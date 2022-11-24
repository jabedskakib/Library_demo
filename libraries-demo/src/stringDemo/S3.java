package stringDemo;

public class S3 {
	public static void main(String[] args) {
		String s1 = "hii";
		String s2 = s1;
		System.out.println("s1:" + s1);// hii
		System.out.println("s2:" + s2);// hii
		System.out.println("s1==s2:" + (s1 == s2)); // true
		s1 = s1 + "hello";
		System.out.println("s1:" + s1);// hiihello
		System.out.println("s2:" + s2);// hii
		System.out.println("s1==s2:" + (s1 == s2));// false

	}
}
