/*Shilvia Haseyani
255150400111018
 */

import java.math.BigInteger;
import java.util.Scanner;

class VoidApp {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        int pilihan;
        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");

            while (!input.hasNextInt()) {
                System.out.print("Input tidak valid. Masukkan angka 1-3: ");
                input.next();
            }
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    permutasi();
                    break;
                case 2:
                    kombinasi();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }

        } while (pilihan != 3);
    }

    private static void permutasi() {
        int n = readInt("Masukkan nilai n : ");
        int r = readInt("Masukkan nilai r : ");
        if (n < 0 || r < 0 || r > n) {
            System.out.println("n dan r harus >= 0 serta r <= n.\n");
            return;
        }

        BigInteger hasil = faktorial(n).divide(faktorial(n - r));

        System.out.println();
        System.out.println("        n!");
        System.out.println("nPr = -------- = " + hasil);
        System.out.println("      (n - r)!\n");
        System.out.println("Maka Hasil Permutasinya adalah : " + hasil + "\n");
    }

    private static void kombinasi() {
        int n = readInt("Masukkan nilai n : ");
        int r = readInt("Masukkan nilai r : ");
        if (n < 0 || r < 0 || r > n) {
            System.out.println("n dan r harus >= 0 serta r <= n.\n");
            return;
        }

        BigInteger nPr = faktorial(n).divide(faktorial(n - r));
        BigInteger hasil = nPr.divide(faktorial(r));

        System.out.println();
        System.out.println("        n!");
        System.out.println("nCr = ------------- = " + hasil);
        System.out.println("      (n - r)! x r!\n");
        System.out.println("Maka Hasil Kombinasinya adalah : " + hasil + "\n");
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.print("Input tidak valid, masukkan bilangan bulat: ");
            input.next();
        }
        return input.nextInt();
    }

    private static BigInteger faktorial(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}