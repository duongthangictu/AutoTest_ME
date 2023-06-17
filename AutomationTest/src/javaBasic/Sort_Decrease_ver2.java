package javaBasic;

import java.util.Scanner;

// BTVN Day 3
public class Sort_Decrease_ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Sort_Decrease_ver2 myObj = new Sort_Decrease_ver2();

		System.out.println("Nhap so luong phan tu cua mang can sap xep:");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Phan tu thu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("\nMang ban dau:");
		printArray(arr);
		sortArray(arr);
		System.out.println("\nMang sau khi Sort:");
		printArray(arr);
	}

	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	static void sortArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
