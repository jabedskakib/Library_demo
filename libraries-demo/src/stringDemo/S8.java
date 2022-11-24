package stringDemo;

public class S8 {
	public static void main(String[] args) {
		String str = "hello";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println(str.contains("hii"));// false
		System.out.println(str.contains("llo"));// true
	}
}
