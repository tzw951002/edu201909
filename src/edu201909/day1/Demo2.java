package edu201909.day1;

public class Demo2 {
	public static void main(String[] args) {
//		printTringle(5);
//		addTest();
		String s="abc";
		StringBuilder sb=new StringBuilder("abc");
		sb.append(123).append(456).append("cba");
		System.out.println(sb);
		//s.equal(sb.toString())
		//null 的話不可以用來當作對象
	}

	private static void addTest() {
		int a=5;
		int b = a++;
		int c = ++a;
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}

	public static void printTringle(int n) {
		for (int i = n; i >= 0; i--) {
			for (int b = 0; b <= n - i; b++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i - 1; k++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}