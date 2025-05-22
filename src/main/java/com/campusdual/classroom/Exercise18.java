package com.campusdual.classroom;

import com.campusdual.util.Utils;



public class Exercise18 {

	public static void main(String[] args) {
		int numero = Utils.integer("Ingresa los números de posiciones del array:");
		showInlineArray(createAndInitializeArray(numero));
	}

	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = i+1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i < intArray.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
