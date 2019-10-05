package edu201909.day1;

public class Demo4 {
	public static void main(String[] args) {
		ten2Binary(10);
		ten2Binary(20);
		ten8Binary(20);
		ten16Binary(20);
	}

	private static void ten2Binary(int n) {
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		System.out.println(sb.reverse());
	}

	private static void ten8Binary(int n) {
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			sb.append(n % 8);
			n = n / 8;
		}
		System.out.println(sb.reverse());
	}

	static char C[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	private static void ten16Binary(int n) {
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			sb.append(C[n % 16]);
			n = n / 16;
		}
		System.out.println(sb.reverse());
	}
}
