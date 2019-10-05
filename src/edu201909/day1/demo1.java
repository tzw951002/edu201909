package edu201909.day1;

public class demo1 {
	// ダブルクリック { 範囲判断できる
	// ctrl+space
	// ctrl+d 一行delete

	public static boolean isAdult(int age) {
		if (age > 18) {
			return true;
		}
		return false;

	}

	public static boolean isAdultV2(int age) {
		return age > 18 ? true : false;
	}

	public static void main(String[] args) {// 方法、関数
		// printAge();
		// printSum(0,100);
		System.out.println(roomCountV2(0));
		System.out.println(roomCountV2(1));
		System.out.println(roomCountV2(4));
		System.out.println(roomCountV2(5));
		System.out.println(roomCountV2(8));
		System.out.println(roomCountV2(9));

	}

	public static int roomCount(int num,int k) {
		if (num % k == 0) {
			return num / k;
		} else if (num % k != 0) {
			return num / k + 1;
		}

		return 0;
	}

	public static int roomCountV2(int num) {
		return num % 4 == 0 ? num / 4 : num / 4 + 1;
		//return (num+k-1)/k k部屋最大の人数
	}

	private static void printSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

	private static void printAge() {
		int age = 11;
		// age = age / 2;
		// double price = 3.33;
		// float p = 3.33f;
		// char c = 'a';
		// boolean rule=true;
		// System.out.println(rule);
		// System.out.println(price);
		// System.out.println(p);
		// System.out.println(age / 2);
		// System.out.println(c);
		// System.out.println("Hello World!");

		if (isAdult(age)) {
			System.out.println("成年");

		} else {
			System.out.println("未成年");
		}
	}
}
