package stringDemo;

public class S10 {
	public static void main(String[] args) {
		String str = "HellO hOw ArE You";
//		String s1 = str.toUpperCase();
//		String s2 = str.toLowerCase();
//		System.out.println("s1:" + s1);
//		System.out.println("s2:" + s2);

//		String str = "  hello  how are you     ";
//		String s2 = str.trim();
//
//		System.out.println(str.length());
//		System.out.println(s2.length());
//
//		System.out.println(str);
//		System.out.println(s2);
		String[] words = str.split(" ");
		System.out.println("length:" + words.length);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		
	}
}
