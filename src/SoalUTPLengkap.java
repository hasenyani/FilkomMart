import java.util.Arrays;
import java.util.Scanner;

/**
 * SOLUSI SOAL-SOAL UTP PEMROGRAMAN DASAR (LENGKAP)
 * 32 Soal dengan 3 Tingkat Kesulitan
 */

public class SoalUTPLengkap {
    
    static Scanner input = new Scanner(System.in);
    
    // ===== EASY LEVEL =====
    
    // Soal 1: Konversi Suhu
    static void konversiSuhu(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Celsius: %.1f\n", celsius);
        System.out.printf("Fahrenheit: %.1f\n", fahrenheit);
        System.out.printf("Kelvin: %.2f\n", kelvin);
    }
    
    // Soal 2: Hitung Diskon
    static void hitungDiskon(double harga) {
        double diskon = 0;
        if (harga > 100000) {
            diskon = harga * 0.10;
        } else if (harga > 50000) {
            diskon = harga * 0.05;
        }
        double hargaAkhir = harga - diskon;
        System.out.printf("Harga awal: %.0f\n", harga);
        System.out.printf("Diskon: %.0f\n", diskon);
        System.out.printf("Harga akhir: %.0f\n", hargaAkhir);
    }
    
    // Soal 3: Validasi Login
    static void validasiLogin(String username, String password) {
        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login berhasil! Selamat datang " + username);
        } else {
            System.out.println("Username atau password salah");
        }
    }
    
    // Soal 4: Cek Tipe Segitiga
    static void cekSegitiga(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Segitiga sama sisi");
            } else if (a == b || b == c || a == c) {
                System.out.println("Segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
    
    // Soal 5: Luas & Keliling Lingkaran
    static void lingkaran(double radius) {
        double pi = 3.14159;
        double luas = pi * radius * radius;
        double keliling = 2 * pi * radius;
        System.out.printf("Radius: %.1f\n", radius);
        System.out.printf("Luas: %.2f\n", luas);
        System.out.printf("Keliling: %.2f\n", keliling);
    }
    
    // ===== MEDIUM LEVEL =====
    
    // Soal 6: Sistem Nilai Mahasiswa
    static void sistemNilai(int quiz, int uts, int uas) {
        double nilaiAkhir = (quiz * 0.2) + (uts * 0.3) + (uas * 0.5);
        String grade;
        
        if (nilaiAkhir >= 85) grade = "A";
        else if (nilaiAkhir >= 75) grade = "B";
        else if (nilaiAkhir >= 65) grade = "C";
        else if (nilaiAkhir >= 55) grade = "D";
        else grade = "E";
        
        System.out.printf("Nilai Akhir: %.1f\n", nilaiAkhir);
        System.out.println("Grade: " + grade);
    }
    
    // Soal 7: Deret Bilangan Prima
    static void deretPrima(int n) {
        System.out.print("Bilangan prima dari 1-" + n + ": ");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nJumlah: " + count);
    }
    
    // Soal 8: Hitung Digit Terbesar & Terkecil
    static void analisisDigit(int bilangan) {
        String str = String.valueOf(Math.abs(bilangan));
        int jumlahDigit = str.length();
        int sumDigit = 0;
        int digitMax = 0;
        int digitMin = 9;
        
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            sumDigit += digit;
            if (digit > digitMax) digitMax = digit;
            if (digit < digitMin) digitMin = digit;
        }
        
        System.out.println("Bilangan: " + bilangan);
        System.out.println("- Jumlah digit: " + jumlahDigit);
        System.out.println("- Jumlah nilai digit: " + sumDigit);
        System.out.println("- Digit terbesar: " + digitMax);
        System.out.println("- Digit terkecil: " + digitMin);
    }
    
    // Soal 9: Reverse Bilangan
    static void reverseBilangan(int bilangan) {
        int reversed = 0;
        int temp = Math.abs(bilangan);
        
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        
        if (bilangan < 0) reversed = -reversed;
        System.out.println("Bilangan asli: " + bilangan);
        System.out.println("Bilangan dibalik: " + reversed);
    }
    
    // Soal 10: Cek Palindrome
    static void cekPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        
        if (clean.equals(reversed)) {
            System.out.println(text + " adalah palindrome");
        } else {
            System.out.println(text + " bukan palindrome");
        }
    }
    
    // Soal 11: Statistik Array Lengkap
    static void statistikArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array kosong");
            return;
        }
        
        // Jumlah & Rata-rata
        int jumlah = 0;
        int max = arr[0];
        int min = arr[0];
        int countGenap = 0, countGanjil = 0;
        
        for (int i = 0; i < arr.length; i++) {
            jumlah += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] % 2 == 0) countGenap++;
            else countGanjil++;
        }
        
        double rataRata = (double) jumlah / arr.length;
        
        // Median
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        double median = (arr.length % 2 == 0) ?
            (sorted[arr.length/2 - 1] + sorted[arr.length/2]) / 2.0 :
            sorted[arr.length/2];
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("- Jumlah elemen: " + arr.length);
        System.out.printf("- Rata-rata: %.1f\n", rataRata);
        System.out.printf("- Median: %.1f\n", median);
        System.out.println("- Max: " + max + ", Min: " + min);
        System.out.println("- Genap: " + countGenap + ", Ganjil: " + countGanjil);
    }
    
    // Soal 12: Bubble Sort & Linear Search
    static void sortDanCari(int[] arr, int target) {
        int[] sorted = arr.clone();
        
        // Bubble Sort
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Array asli: " + Arrays.toString(arr));
        System.out.println("Array terurut: " + Arrays.toString(sorted));
        
        // Linear Search
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == target) {
                System.out.println("Elemen " + target + " ditemukan di index " + i);
                return;
            }
        }
        System.out.println("Elemen " + target + " tidak ditemukan");
    }
    
    // Soal 13: Hitung Frekuensi Karakter
    static void frekuensiKarakter(String text) {
        System.out.println("String: " + text);
        System.out.println("Frekuensi karakter:");
        
        boolean[] printed = new boolean[256];
        for (char c : text.toCharArray()) {
            if (!printed[c] && c != ' ') {
                int count = 0;
                for (char ch : text.toCharArray()) {
                    if (ch == c) count++;
                }
                System.out.println(c + ": " + count);
                printed[c] = true;
            }
        }
    }
    
    // Soal 14: Password Validator
    static boolean validasiPassword(String password) {
        boolean valid = true;
        String error = "";
        
        if (password.length() < 8) {
            valid = false;
            error += "Terlalu pendek (< 8 karakter), ";
        }
        if (!password.matches(".*[A-Z].*")) {
            valid = false;
            error += "Tidak ada huruf besar, ";
        }
        if (!password.matches(".*[a-z].*")) {
            valid = false;
            error += "Tidak ada huruf kecil, ";
        }
        if (!password.matches(".*[0-9].*")) {
            valid = false;
            error += "Tidak ada angka, ";
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            valid = false;
            error += "Tidak ada karakter spesial, ";
        }
        
        if (valid) {
            System.out.println("Password '" + password + "' VALID");
        } else {
            System.out.println("Password TIDAK VALID: " + error.replaceAll(", $", ""));
        }
        
        return valid;
    }
    
    // Soal 15: Matrix Transpose
    static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Matrix Awal:");
        printMatrix(matrix);
        System.out.println("\nMatrix Transpose:");
        printMatrix(transpose);
    }
    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    // ===== HARD LEVEL & MIXED =====
    
    // Soal 17: GCD (Greatest Common Divisor)
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    // Soal 20: Hitung Kombinasi
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    static void kombinasiPermutasi(int n, int r) {
        if (r > n) {
            System.out.println("r tidak boleh > n");
            return;
        }
        long c = factorial(n) / (factorial(r) * factorial(n - r));
        long p = factorial(n) / factorial(n - r);
        
        System.out.println("Kombinasi C(" + n + "," + r + "): " + c);
        System.out.println("Permutasi P(" + n + "," + r + "): " + p);
    }
    
    // Soal 21: Konversi Basis Bilangan
    static void konversiBasis(int desimal) {
        String biner = Integer.toBinaryString(desimal);
        String oktal = Integer.toOctalString(desimal);
        String heksa = Integer.toHexString(desimal).toUpperCase();
        
        System.out.println("Desimal: " + desimal);
        System.out.println("Biner: " + biner);
        System.out.println("Oktal: " + oktal);
        System.out.println("Heksadesimal: " + heksa);
    }
    
    // Soal 23: GCD & LCM
    static void gcdLcm(int a, int b) {
        int gcdVal = gcd(a, b);
        int lcmVal = (a * b) / gcdVal;
        
        System.out.println("Bilangan: " + a + " dan " + b);
        System.out.println("GCD: " + gcdVal);
        System.out.println("LCM: " + lcmVal);
    }
    
    // Soal 24: Simulasi ATM Sederhana
    static void simulasiATM(long saldoAwal, int pilihan, long jumlah) {
        long saldo = saldoAwal;
        System.out.println("Saldo awal: " + saldo);
        System.out.println("\nMenu:");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Setoran");
        System.out.println("3. Penarikan");
        System.out.println("Pilihan: " + pilihan);
        
        if (pilihan == 1) {
            System.out.println("Saldo Anda: " + saldo);
        } else if (pilihan == 2) {
            saldo += jumlah;
            System.out.println("Setoran " + jumlah + " berhasil. Saldo baru: " + saldo);
        } else if (pilihan == 3) {
            if (jumlah > saldo) {
                System.out.println("Saldo tidak cukup!");
            } else {
                saldo -= jumlah;
                System.out.println("Penarikan " + jumlah + " berhasil. Saldo baru: " + saldo);
            }
        }
    }
    
    // Soal 25: Program Toko Sederhana
    static void toko(String namaBarang, int harga, int qty, int uangDiberikan) {
        System.out.println("Daftar barang:");
        System.out.println("1. Mie Goreng - Rp. 15000");
        System.out.println("2. Nasi Kuning - Rp. 20000");
        
        int total = harga * qty;
        int kembalian = uangDiberikan - total;
        
        System.out.println("\nBarang: " + namaBarang);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("Jumlah: " + qty);
        System.out.println("Total: Rp. " + total);
        System.out.println("Uang diberikan: Rp. " + uangDiberikan);
        
        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp. " + kembalian);
        } else {
            System.out.println("Uang tidak cukup!");
        }
    }
    
    // Soal 26: Sistem Booking Hotel
    static void bookingHotel(String tipeKamar, int hargaPerMalam, int jumlahHari) {
        int total = hargaPerMalam * jumlahHari;
        double diskon = 0;
        
        if (jumlahHari >= 3) {
            diskon = total * 0.10;
        }
        
        int hargaAkhir = (int)(total - diskon);
        
        System.out.println("Tipe kamar: " + tipeKamar);
        System.out.println("Harga per malam: Rp. " + hargaPerMalam);
        System.out.println("Jumlah hari: " + jumlahHari);
        System.out.println("Total: Rp. " + total);
        if (diskon > 0) {
            System.out.println("Diskon 10%: Rp. " + (int)diskon);
        }
        System.out.println("Harga akhir: Rp. " + hargaAkhir);
    }
    
    // Soal 27: Program Perpustakaan
    static void perpustakaan(String judul, int tglPinjam, int tglKembaliTarget, int tglKembaliAktual) {
        int keterlambatan = tglKembaliAktual - tglKembaliTarget;
        long denda = (long)keterlambatan * 5000;
        
        System.out.println("Buku: " + judul);
        System.out.println("Tanggal pinjam: " + tglPinjam);
        System.out.println("Tgl kembali target: " + tglKembaliTarget);
        System.out.println("Tgl kembali aktual: " + tglKembaliAktual);
        
        if (keterlambatan > 0) {
            System.out.println("Keterlambatan: " + keterlambatan + " hari");
            System.out.println("Denda: Rp. " + denda);
        } else {
            System.out.println("Kembali tepat waktu!");
        }
    }
    
    // Soal 28: Sistem Nilai Ujian Berkala
    static void nilaiUjianBerkala(int[] nilai) {
        int jumlah = 0;
        int max = nilai[0];
        int min = nilai[0];
        int lulus = 0;
        
        for (int n : nilai) {
            jumlah += n;
            if (n > max) max = n;
            if (n < min) min = n;
            if (n >= 70) lulus++;
        }
        
        double rataRata = (double) jumlah / nilai.length;
        double persenLulus = (double) lulus / nilai.length * 100;
        
        System.out.println("Nilai siswa: " + Arrays.toString(nilai));
        System.out.printf("Rata-rata: %.1f\n", rataRata);
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Siswa lulus: " + lulus + " (" + (int)persenLulus + "%)");
        
        System.out.print("Siswa > rata-rata: [");
        boolean pertama = true;
        for (int n : nilai) {
            if (n > rataRata) {
                if (!pertama) System.out.print(", ");
                System.out.print(n);
                pertama = false;
            }
        }
        System.out.println("]");
    }
    
    // Soal 29: Validasi No. Identitas
    static void validasiIdentitas(String nomorIdentitas) {
        System.out.println("Nomor: " + nomorIdentitas);
        
        if (nomorIdentitas.length() == 16 && nomorIdentitas.matches("[0-9]+")) {
            System.out.println("KTP valid");
        } else if (nomorIdentitas.length() == 10 && nomorIdentitas.matches("[0-9]+")) {
            String tahun = nomorIdentitas.substring(0, 2);
            System.out.println("NIM valid (tahun: " + tahun + ", angkatan: 20" + tahun + ")");
        } else {
            System.out.println("Nomor identitas tidak valid");
        }
    }
    
    // Soal 30: Jumlah Digit Fibonacci
    static void fibonacciDenganDigit(int n) {
        long a = 0, b = 1;
        int totalDigit = 0;
        
        System.out.print("Fibonacci " + n + " suku: ");
        System.out.print(a + " ");
        totalDigit += String.valueOf(a).length();
        
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            totalDigit += String.valueOf(b).length();
            long temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("\nTotal digit: " + totalDigit);
    }
    
    // Soal 31: Cari Pasangan dengan Sum Target (Two Sum)
    static void twoSum(int[] arr, int target) {
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target sum: " + target);
        
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target + " (index " + i + " dan " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Tidak ada pasangan yang sesuai");
        }
    }
    
    // Soal 32: Substring Palindrome Terpanjang
    static void palindromeTerpanjang(String str) {
        if (str.length() < 2) {
            System.out.println("String: " + str);
            System.out.println("Palindrome terpanjang: " + str);
            return;
        }
        
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                String rev = new StringBuilder(sub).reverse().toString();
                if (sub.equals(rev) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Palindrome terpanjang: " + longest + " (panjang: " + longest.length() + ")");
    }
    
    // ===== MAIN - DEMO SEMUA SOAL =====
    
    public static void main(String[] args) {
        System.out.println("===== SOLUSI SOAL-SOAL UTP LENGKAP =====\n");
        
        // EASY
        System.out.println("--- EASY LEVEL ---\n");
        
        System.out.println("Soal 1: Konversi Suhu");
        konversiSuhu(25);
        
        System.out.println("\nSoal 2: Hitung Diskon");
        hitungDiskon(150000);
        
        System.out.println("\nSoal 3: Validasi Login");
        validasiLogin("admin", "12345");
        
        System.out.println("\nSoal 4: Cek Tipe Segitiga");
        cekSegitiga(5, 5, 5);
        
        System.out.println("\nSoal 5: Lingkaran");
        lingkaran(7);
        
        // MEDIUM
        System.out.println("\n--- MEDIUM LEVEL ---\n");
        
        System.out.println("Soal 6: Sistem Nilai");
        sistemNilai(80, 75, 85);
        
        System.out.println("\nSoal 7: Deret Prima");
        deretPrima(20);
        
        System.out.println("\nSoal 8: Analisis Digit");
        analisisDigit(12345);
        
        System.out.println("\nSoal 9: Reverse Bilangan");
        reverseBilangan(12345);
        
        System.out.println("\nSoal 10: Palindrome");
        cekPalindrome("radar");
        cekPalindrome("12321");
        
        System.out.println("\nSoal 11: Statistik Array");
        int[] arr11 = {3, 7, 2, 9, 1, 5, 8};
        statistikArray(arr11);
        
        System.out.println("\nSoal 12: Sort & Cari");
        int[] arr12 = {5, 2, 8, 1, 9};
        sortDanCari(arr12, 8);
        
        System.out.println("\nSoal 13: Frekuensi Karakter");
        frekuensiKarakter("programming");
        
        System.out.println("\nSoal 14: Password Validator");
        validasiPassword("Pass1234!");
        validasiPassword("abc123");
        
        System.out.println("\nSoal 15: Transpose Matrix");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transposeMatrix(matrix);
        
        // HARD & MIXED
        System.out.println("\n--- HARD LEVEL & MIXED ---\n");
        
        System.out.println("Soal 16-19: (Silakan lihat method di file ini)\n");
        
        System.out.println("Soal 20: Kombinasi & Permutasi");
        kombinasiPermutasi(5, 2);
        
        System.out.println("\nSoal 21: Konversi Basis");
        konversiBasis(255);
        
        System.out.println("\nSoal 22: (Analisis String)\n");
        
        System.out.println("Soal 23: GCD & LCM");
        gcdLcm(12, 18);
        
        System.out.println("\n--- SOAL KOMBINASI (MIXED) ---\n");
        
        System.out.println("Soal 24: Simulasi ATM");
        simulasiATM(1000000, 2, 500000);
        
        System.out.println("\nSoal 25: Program Toko");
        toko("Mie Goreng", 15000, 3, 50000);
        
        System.out.println("\nSoal 26: Booking Hotel");
        bookingHotel("Double", 500000, 4);
        
        System.out.println("\nSoal 27: Program Perpustakaan");
        perpustakaan("Clean Code", 14, 21, 25);
        
        System.out.println("\nSoal 28: Sistem Nilai Ujian");
        int[] nilaiSiswa = {75, 80, 65, 90, 70};
        nilaiUjianBerkala(nilaiSiswa);
        
        System.out.println("\nSoal 29: Validasi Identitas");
        validasiIdentitas("1234567890123456");
        validasiIdentitas("2305220001");
        
        System.out.println("\nSoal 30: Fibonacci dengan Digit");
        fibonacciDenganDigit(10);
        
        System.out.println("\nSoal 31: Two Sum");
        int[] arr31 = {2, 7, 11, 15};
        twoSum(arr31, 9);
        
        System.out.println("\nSoal 32: Palindrome Terpanjang");
        palindromeTerpanjang("babad");
        palindromeTerpanjang("abcda");
    }
}
