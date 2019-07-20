package org.login;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Welcome";
		String res = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			res = res + ch;
		}
		if (name.equals(res)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		// System.out.println("Reverse String is:"+res);
	}

}
