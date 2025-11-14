/*Shilvia Hasenyani
255150400111018
 */

import java.util.Scanner;
public class prima {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan sebuah bilangan: ");
		int n = in.nextInt();

		if (isPrima(n)) {
			System.out.println(n + " adalah bilangan prima");
		} else {
			System.out.println(n + " bukan bilangan prima");
		}

		System.out.println("Bilangan prima 1-100:");
		for (int i = 1; i <= 100; i++) {
			if (isPrima(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private static boolean isPrima(int x) {
		if (x < 2) return false;
		if (x == 2) return true;
		if (x % 2 == 0) return false;
		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) return false;
		}
		return true;
	}
}
