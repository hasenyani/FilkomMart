import java.util.Scanner;

public class kwekratarata {

	public static int hitungJumlah(int[] arr) {
		int sum = 0;
        for (int i = 0; i < arr.length; i++) { 
         sum += arr[i];
        } 
        return sum;
	}   

	public static double hitungRataRata(int[] arr) {
    int sum = hitungJumlah(arr);
    return hitungJumlah(arr) / (double) arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int sum = hitungJumlah(arr);
			double a = hitungRataRata(arr);

			System.out.println(sum);
			System.out.printf("%.2f%n", a);
		}
	}
}
