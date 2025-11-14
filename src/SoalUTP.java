import java.util.Scanner;

/**
 * SOLUSI SOAL-SOAL UTP PEMROGRAMAN DASAR
 * Materi: Seleksi Kondisi, Perulangan, dan Array
 */

public class SoalUTP {
    
    static Scanner input = new Scanner(System.in);
    
    // ===== BAGIAN 1: SELEKSI KONDISI =====
    
    // Soal 1.1: Bilangan Genap atau Ganjil
    static void cekGenapGanjil(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan genap");
        } else {
            System.out.println(n + " adalah bilangan ganjil");
        }
    }
    
    // Soal 1.2: Nilai Grade
    static void hitungGrade(int nilai) {
        String grade;
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade: " + grade);
    }
    
    // Soal 1.3: Bilangan Terbesar dari 3 Angka
    static void bilanganTerbesar(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Bilangan terbesar: " + max);
    }
    
    // Soal 1.5: Tahun Kabisat
    static void cekTahunKabisat(int tahun) {
        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
    
    // ===== BAGIAN 2: PERULANGAN =====
    
    // Soal 2.1: Print Angka 1-10
    static void printAngka1Hingga10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Soal 2.2: Jumlah Deret Bilangan
    static void jumlahDeret(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        System.out.println("Jumlah 1 hingga " + n + " = " + jumlah);
    }
    
    // Soal 2.3: Tabel Perkalian
    static void tabelPerkalian(int angka) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
    
    // Soal 2.4: Factorial
    static void hitungFactorial(int n) {
        long hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }
        System.out.println(n + "! = " + hasil);
    }
    
    // Soal 2.5: Fibonacci Sequence
    static void fibonacciSequence(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
    
    // Soal 2.6: Bilangan Prima
    static void cekBilanganPrima(int n) {
        if (n < 2) {
            System.out.println(n + " bukan bilangan prima");
            return;
        }
        boolean isPrima = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrima = false;
                break;
            }
        }
        if (isPrima) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
    
    // Soal 2.7: Jumlah Digit
    static void jumlahDigit(int n) {
        int jumlah = 0;
        int temp = n;
        while (temp > 0) {
            jumlah += temp % 10;
            temp /= 10;
        }
        System.out.println("Jumlah digit dari " + n + " = " + jumlah);
    }
    
    // Soal 2.8: Pola Segitiga
    static void polaSegitiga(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // ===== BAGIAN 3: ARRAY =====
    
    // Soal 3.1: Jumlah dan Rata-rata Array
    static void jumlahRataRataArray(int[] arr) {
        int jumlah = 0;
        for (int i = 0; i < arr.length; i++) {
            jumlah += arr[i];
        }
        double rataRata = (double) jumlah / arr.length;
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);
    }
    
    // Soal 3.2: Elemen Terbesar dan Terkecil
    static void eemenTerbesarTerkecil(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Elemen terbesar: " + max);
        System.out.println("Elemen terkecil: " + min);
    }
    
    // Soal 3.3: Linear Search
    static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Elemen " + target + " ditemukan di index " + i);
                return;
            }
        }
        System.out.println("Elemen " + target + " tidak ditemukan");
    }
    
    // Soal 3.4: Reverse Array
    static void reverseArray(int[] arr) {
        System.out.print("Array reversed: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // Soal 3.5: Bubble Sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Array terurut: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // Soal 3.6: Hitung Frekuensi
    static void hitungFrekuensi(int[] arr) {
        System.out.println("Frekuensi elemen:");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Print hanya sekali
            boolean sudahDiprint = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    sudahDiprint = true;
                    break;
                }
            }
            if (!sudahDiprint) {
                System.out.println(arr[i] + " muncul " + count + " kali");
            }
        }
    }
    
    // Soal 3.7: Gabung Dua Array
    static void gabungArray(int[] arr1, int[] arr2) {
        int[] hasil = new int[arr1.length + arr2.length];
        int index = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            hasil[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            hasil[index] = arr2[i];
            index++;
        }
        
        System.out.print("Array gabungan: [");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i]);
            if (i < hasil.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // ===== BAGIAN 4: KOMBINASI =====
    
    // Soal 4.1: Bilangan Genap dalam Array
    static void filterGenapArray(int[] arr) {
        System.out.print("Bilangan genap: [");
        boolean pertama = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (!pertama) System.out.print(", ");
                System.out.print(arr[i]);
                pertama = false;
            }
        }
        System.out.println("]");
    }
    
    // Soal 4.3: Filter dan Hitung (Genap/Ganjil)
    static void filterGenapGanjil(int[] arr) {
        int countGenap = 0, countGanjil = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countGenap++;
            } else {
                countGanjil++;
            }
        }
        System.out.println("Bilangan genap: " + countGenap);
        System.out.println("Bilangan ganjil: " + countGanjil);
    }
    
    // ===== MAIN UNTUK TESTING =====
    
    public static void main(String[] args) {
        System.out.println("===== TESTING SOAL UTP =====\n");
        
        // Test 1: Cek Genap Ganjil
        System.out.println("--- Test 1.1: Genap/Ganjil ---");
        cekGenapGanjil(7);
        cekGenapGanjil(10);
        
        // Test 2: Hitung Grade
        System.out.println("\n--- Test 1.2: Grade ---");
        hitungGrade(75);
        hitungGrade(85);
        
        // Test 3: Bilangan Terbesar
        System.out.println("\n--- Test 1.3: Bilangan Terbesar ---");
        bilanganTerbesar(10, 25, 15);
        
        // Test 4: Tahun Kabisat
        System.out.println("\n--- Test 1.5: Tahun Kabisat ---");
        cekTahunKabisat(2020);
        cekTahunKabisat(2021);
        
        // Test 5: Print Angka
        System.out.println("\n--- Test 2.1: Print Angka 1-10 ---");
        printAngka1Hingga10();
        
        // Test 6: Jumlah Deret
        System.out.println("\n--- Test 2.2: Jumlah Deret ---");
        jumlahDeret(10);
        
        // Test 7: Tabel Perkalian
        System.out.println("\n--- Test 2.3: Tabel Perkalian 5 ---");
        tabelPerkalian(5);
        
        // Test 8: Factorial
        System.out.println("\n--- Test 2.4: Factorial ---");
        hitungFactorial(5);
        
        // Test 9: Fibonacci
        System.out.println("\n--- Test 2.5: Fibonacci ---");
        fibonacciSequence(7);
        
        // Test 10: Bilangan Prima
        System.out.println("\n--- Test 2.6: Bilangan Prima ---");
        cekBilanganPrima(17);
        cekBilanganPrima(15);
        
        // Test 11: Jumlah Digit
        System.out.println("\n--- Test 2.7: Jumlah Digit ---");
        jumlahDigit(12345);
        
        // Test 12: Pola Segitiga
        System.out.println("\n--- Test 2.8: Pola Segitiga ---");
        polaSegitiga(5);
        
        // Test 13: Array Jumlah Rata-rata
        System.out.println("\n--- Test 3.1: Jumlah & Rata-rata Array ---");
        int[] arr1 = {5, 10, 15, 20, 25};
        jumlahRataRataArray(arr1);
        
        // Test 14: Max Min Array
        System.out.println("\n--- Test 3.2: Max & Min Array ---");
        int[] arr2 = {3, 7, 2, 9, 1, 5};
        eemenTerbesarTerkecil(arr2);
        
        // Test 15: Linear Search
        System.out.println("\n--- Test 3.3: Linear Search ---");
        int[] arr3 = {10, 20, 30, 40, 50};
        linearSearch(arr3, 30);
        linearSearch(arr3, 60);
        
        // Test 16: Reverse Array
        System.out.println("\n--- Test 3.4: Reverse Array ---");
        int[] arr4 = {1, 2, 3, 4, 5};
        reverseArray(arr4);
        
        // Test 17: Bubble Sort
        System.out.println("\n--- Test 3.5: Bubble Sort ---");
        int[] arr5 = {5, 2, 8, 1, 9};
        bubbleSort(arr5);
        
        // Test 18: Hitung Frekuensi
        System.out.println("\n--- Test 3.6: Hitung Frekuensi ---");
        int[] arr6 = {1, 2, 2, 3, 3, 3, 4};
        hitungFrekuensi(arr6);
        
        // Test 19: Gabung Array
        System.out.println("\n--- Test 3.7: Gabung Array ---");
        int[] arr7a = {1, 2, 3};
        int[] arr7b = {4, 5, 6};
        gabungArray(arr7a, arr7b);
        
        // Test 20: Filter Genap
        System.out.println("\n--- Test 4.1: Filter Genap ---");
        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8};
        filterGenapArray(arr8);
        
        // Test 21: Filter Genap Ganjil
        System.out.println("\n--- Test 4.3: Filter Genap/Ganjil ---");
        int[] arr9 = {1, 2, 3, 4, 5, 6};
        filterGenapGanjil(arr9);
    }
}
