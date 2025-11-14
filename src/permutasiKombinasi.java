import java.math.BigInteger;
import java.util.Scanner;

public class permutasiKombinasi {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int pilih;
            do {
                System.out.println("Program Menghitung Permutasi dan Kombinasi");
                System.out.println("1. Menghitung Permutasi");
                System.out.println("2. Menghitung Kombinasi");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan Anda: ");

                while (!in.hasNextInt()) {
                    System.out.print("Input tidak valid. Masukkan angka 1-3: ");
                    in.next();
                }
                pilih = in.nextInt();

                switch (pilih) {
                    case 1:
                        permutasi(in);
                        break;
                    case 2:
                        kombinasi(in);
                        break;
                    case 3:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.\n");
                }

            } while (pilih != 3);
        }
    }

    private static void permutasi(Scanner in) {
        System.out.print("Masukkan nilai n: ");
        int n = readInt(in);
        System.out.print("Masukkan nilai r: ");
        int r = readInt(in);

        if (n < 0 || r < 0 || r > n) {
            System.out.println("n dan r harus >= 0 serta r <= n.\n");
            return;
        }

        BigInteger nFact = faktorial(n);
        BigInteger denom = faktorial(n - r);
        BigInteger result = nFact.divide(denom);

        System.out.println();
        System.out.println("Rumus: nPr = n! / (n-r)!");
        System.out.printf("Hasil Permutasi untuk n=%d dan r=%d adalah: %s%n%n", n, r, result.toString());
    }

    private static void kombinasi(Scanner in) {
        System.out.print("Masukkan nilai n: ");
        int n = readInt(in);
        System.out.print("Masukkan nilai r: ");
        int r = readInt(in);

        if (n < 0 || r < 0 || r > n) {
            System.out.println("n dan r harus >= 0 serta r <= n.\n");
            return;
        }

        BigInteger numerator = faktorial(n);
        BigInteger denom = faktorial(n - r).multiply(faktorial(r));
        BigInteger result = numerator.divide(denom);

        System.out.println();
        System.out.println("Rumus: nCr = n! / ((n-r)! * r!)");
        System.out.printf("Hasil Kombinasi untuk n=%d dan r=%d adalah: %s%n%n", n, r, result.toString());
    }

    private static int readInt(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.print("Input tidak valid, masukkan bilangan bulat: ");
            in.next();
        }
        return in.nextInt();
    }

    private static BigInteger faktorial(int x) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
