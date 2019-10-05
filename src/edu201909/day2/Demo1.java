package edu201909.day2;

public class Demo1 {
	public static void main(String[] args) {
		int[] arry = { 12, 4, 56, 38 };

		int temp = 0;

		for (int i = 0; i < arry.length - 1; i++) {
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[j] > arry[i]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		for (int i : arry) {
			System.out.println(i + ",");
		}
		System.out.println();

	}
}
