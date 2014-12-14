
package leetCode;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter the number array you want to sort, separete by comma: ");
			System.out.println("Or enter \"exit\" to exit the program");
			String input = s.nextLine();
			if(input.toLowerCase().equals("exit")) {
				break;
			}
			String[] in = input.split(",");
			int[] array = new int[in.length];
			for(int i = 0; i<in.length; i++) {
				array[i] = Integer.parseInt(in[i]);
			}
			System.out.print("Before sort: ");
			print(array);
			QuickSort.sort(array);
			System.out.print("After sort: ");
			print(array);
		}
		System.out.println("Thank you for using our QuickSort Program");
		s.close();
	}
	
	public static void print(int[] array) {
		if(array.length > 0) {
			System.out.print("[" + array[0]);
		}
		
		for(int i = 1; i<array.length; i++) {
			System.out.print(", "+array[i]);
		}
		
		System.out.println("]");
	}
	
	public static void sort(int[] array) {
		if(array == null || array.length <= 1) {
			return;
		}
		sort(array, 0, array.length - 1);
	}
	
	private static void sort(int[] array, int start, int end) {
		while(start <= end) {
			
		}
	}
}
