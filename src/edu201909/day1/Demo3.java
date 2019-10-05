package edu201909.day1;

public class Demo3 {
	public static void main(String[] args) {
		int[] array = {23, 15, 7, 1, 4, 2 };
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		
		System.out.println();
		System.out.println(getMax(array));
		System.out.println(getMin(array));
		int c=array[0];
		array[0]=array[1];
		array[1]=c;
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		
		
	}

	private static int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	private static int getMin(int[] array) {
		int min = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (min >= array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
