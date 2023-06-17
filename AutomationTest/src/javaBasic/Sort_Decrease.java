package javaBasic;

import java.util.Scanner;

public class Sort_Decrease {

	private void Sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so luong phan tu cua mang: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Phan tu thu " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("\nMang ban dau la: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		Sort_Decrease myObj = new Sort_Decrease();

		System.out.println("\n\nMang sau khi Sort la: ");
		myObj.Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
