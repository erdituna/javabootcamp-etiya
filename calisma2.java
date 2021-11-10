package Intro;

public class calisma2 {

	public static void main(String[] args) {

		int[] dizi = new int[] { 15, 15, 20, 25, 30, 35, 35 };

		int length = dizi.length;
		length = ciftleriSil(dizi, length);
		for (int i = 0; i < length; i++)
			System.out.print(dizi[i] + " ");
	}

	private static int ciftleriSil(int[] array, int length) {
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}
		array[j++] = array[length - 1];
		return j;
	}
}
