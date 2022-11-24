package stringDemo;

public class S9 {
	public static void main(String[] args) {
		String str = "hello how are you";
//		System.out.println(str.indexOf('e'));// 1
//		System.out.println(str.lastIndexOf('e'));// 12
//		System.out.println(str.indexOf('z'));// -1
//
//		System.out.println(str.indexOf("how"));// 6
//		System.out.println(str.indexOf("rocky"));// -1

		System.out.println(str.startsWith("hell"));// true
		System.out.println(str.startsWith("shh"));// false
		System.out.println(str.endsWith("ou"));//true
		System.out.println(str.endsWith("jhhd"));//falseF
	}
}
