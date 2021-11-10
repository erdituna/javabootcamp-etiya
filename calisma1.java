package Intro;

import java.util.Scanner;
import java.util.Random;

public class calisma1 {

	public static void main(String[] args) {

		Scanner object = new Scanner(System.in);
		System.out.println("Kolon sayısını giriniz : ");
		int kolonNum = object.nextInt();
		int[][] kolon = new int[8][6];

		for (int i = 0; i < kolonNum; i++) {
			for (int j = 0; j < 6; j++) {
				Random random = new Random();
				int sayi = 1 + random.nextInt(49);
				if (sayi != kolon[i][j]) {
					kolon[i][j] = sayi;
				}
			}
		}

		for (int i = 0; i < kolonNum; i++) {
			System.out.println(" ");
			for (int j = 0; j < 6; j++) {
				System.out.print(kolon[i][j] + " ");
			}
		}
	}
}
