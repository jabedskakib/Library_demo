package stringDemo;

public class S5 {
	public static void main(String[] args) {
		String s1 = "hii";
		System.out.println(s1);// hii
		s1.concat("hello");// not storing
		System.out.println(s1);// hii
		s1 = s1.concat("hello");// we are storing
		System.out.println(s1);// hiihello
	}
}
