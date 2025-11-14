/*
  SHILVIA HASENYANI
    255150400111018
 */

import java.util.Scanner;

public class modul3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih program:");
        System.out.println("1. Segitiga bintang");
        System.out.println("2. Deret bilangan genap");
        System.out.println("3. Faktorial");
        System.out.println("4. Cek bilangan prima");
        System.out.print("Masukkan pilihan (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan nilai n: ");
                int n = input.nextInt();
                printTriangle(n);
                break;
            case 2:
                System.out.print("Masukkan nilai n: ");
                int m = input.nextInt();
                printEven(m);
                break;
            case 3:
                System.out.print("Masukkan bilangan: ");
                int f = input.nextInt();
                System.out.println(f + "! = " + factorial(f));
                break;
            case 4:
                System.out.print("Masukkan bilangan: ");
                int p = input.nextInt();
                System.out.println(p + (isPrime(p) ? " adalah prima" : " bukan prima"));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printEven(int n) {
        System.out.print("Deret bilangan genap dari 1 sampai " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}