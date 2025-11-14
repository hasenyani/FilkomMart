import java.util.Scanner;
import java.util.Arrays;

/**
 * SOLUSI SOAL-SOAL UTP POLA: INPUT ARRAY + PERULANGAN
 * 20 Soal dengan pola: Input Array → Loop Processing → Output Hasil
 */

public class SoalArrayLoopPattern {
    
    static Scanner input = new Scanner(System.in);
    
    // ===== SOAL 1: Rata-rata & Nilai di Atas Rata-rata =====
    static void soal1() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        // Input array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Hitung rata-rata
        int jumlah = 0;
        for (int i = 0; i < n; i++) {
            jumlah += arr[i];
        }
        double rataRata = (double) jumlah / n;
        
        // Cari nilai > rata-rata
        System.out.println("\nRata-rata: " + rataRata);
        System.out.print("Nilai di atas rata-rata: ");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > rataRata) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\nJumlah nilai > rata-rata: " + count);
    }
    
    // ===== SOAL 2: Pisah Genap & Ganjil =====
    static void soal2() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Pisahkan genap & ganjil
        int[] genap = new int[n];
        int[] ganjil = new int[n];
        int countGenap = 0, countGanjil = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                genap[countGenap] = arr[i];
                countGenap++;
            } else {
                ganjil[countGanjil] = arr[i];
                countGanjil++;
            }
        }
        
        System.out.print("Array genap: [");
        for (int i = 0; i < countGenap; i++) {
            System.out.print(genap[i]);
            if (i < countGenap - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array ganjil: [");
        for (int i = 0; i < countGanjil; i++) {
            System.out.print(ganjil[i]);
            if (i < countGanjil - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Jumlah genap: " + countGenap);
        System.out.println("Jumlah ganjil: " + countGanjil);
    }
    
    // ===== SOAL 3: Inverse Array =====
    static void soal3() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] inverse = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Balik urutan
        for (int i = 0; i < n; i++) {
            inverse[i] = arr[n - 1 - i];
        }
        
        System.out.print("Array asli: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array dibalik: [");
        for (int i = 0; i < n; i++) {
            System.out.print(inverse[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // ===== SOAL 4: Cari Elemen Terbesar & Posisi =====
    static void soal4() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Cari max
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        
        // Cari posisi
        System.out.println("Elemen terbesar: " + max);
        System.out.print("Posisi: ");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print("index " + i);
                if (i < n - 1) System.out.print(" dan ");
                count++;
            }
        }
        System.out.println("\nJumlah kemunculan: " + count);
    }
    
    // ===== SOAL 5: Jumlah, Kali, Rata-rata, Median =====
    static void soal5() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Hitung jumlah & kali
        int sum = 0;
        long product = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        
        double rataRata = (double) sum / n;
        
        // Hitung median
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        double median = (n % 2 == 0) ? 
            (sorted[n/2 - 1] + sorted[n/2]) / 2.0 : 
            sorted[n/2];
        
        System.out.println("Jumlah (sum): " + sum);
        System.out.println("Hasil kali (product): " + product);
        System.out.printf("Rata-rata: %.2f\n", rataRata);
        System.out.printf("Median: %.2f\n", median);
    }
    
    // ===== SOAL 6: Bubble Sort (dengan count swap) =====
    static void soal6() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Print array asli
        System.out.print("Array asli: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        // Bubble Sort Ascending
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        
        System.out.print("Array terurut (ascending): [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Total swap: " + swapCount);
    }
    
    // ===== SOAL 7: Frekuensi Elemen =====
    static void soal7() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        System.out.println("Frekuensi elemen:");
        boolean[] sudahDihitung = new boolean[n];
        int maxFreq = 0;
        int modeValue = 0;
        
        for (int i = 0; i < n; i++) {
            if (!sudahDihitung[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("- " + arr[i] + " muncul " + count + " kali");
                sudahDihitung[i] = true;
                
                if (count > maxFreq) {
                    maxFreq = count;
                    modeValue = arr[i];
                }
                
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        sudahDihitung[j] = true;
                    }
                }
            }
        }
        
        System.out.println("\nElemen paling sering muncul: " + modeValue + " (" + maxFreq + " kali)");
    }
    
    // ===== SOAL 8: Gabung Dua Array & Sort =====
    static void soal8() {
        System.out.print("Masukkan ukuran array 1: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            System.out.print("Elemen ke-" + (i+1) + " array 1: ");
            arr1[i] = input.nextInt();
        }
        
        System.out.print("Masukkan ukuran array 2: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        
        for (int i = 0; i < n2; i++) {
            System.out.print("Elemen ke-" + (i+1) + " array 2: ");
            arr2[i] = input.nextInt();
        }
        
        // Gabung array
        int[] gabung = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            gabung[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            gabung[n1 + i] = arr2[i];
        }
        
        // Sort
        for (int i = 0; i < gabung.length - 1; i++) {
            for (int j = 0; j < gabung.length - 1 - i; j++) {
                if (gabung[j] > gabung[j + 1]) {
                    int temp = gabung[j];
                    gabung[j] = gabung[j + 1];
                    gabung[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Array 1: [");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i]);
            if (i < n1 - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array 2: [");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i]);
            if (i < n2 - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array gabung: [");
        for (int i = 0; i < gabung.length; i++) {
            System.out.print(gabung[i]);
            if (i < gabung.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array gabung (sorted): [");
        for (int i = 0; i < gabung.length; i++) {
            System.out.print(gabung[i]);
            if (i < gabung.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // ===== SOAL 9: Hapus Duplikat =====
    static void soal9() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // Cari elemen unik
        int[] unique = new int[n];
        boolean[] counted = new boolean[n];
        int uniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
                
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        counted[j] = true;
                    }
                }
            }
        }
        
        System.out.print("Array asli: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array tanpa duplikat: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i]);
            if (i < uniqueCount - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Jumlah elemen unik: " + uniqueCount);
        System.out.println("Jumlah duplikat dihapus: " + (n - uniqueCount));
    }
    
    // ===== SOAL 10: Rotasi Array ke Kanan =====
    static void soal10() {
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        System.out.print("Masukkan jumlah rotasi: ");
        int k = input.nextInt();
        k = k % n; // Optimize
        
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        
        System.out.print("Array asli: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array setelah rotasi " + k + " kali ke kanan: [");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // ===== DEMO MAIN METHOD (Tampilkan Menu Soal) =====
    
    public static void main(String[] args) {
        System.out.println("===== SOAL-SOAL ARRAY + LOOP PATTERN =====\n");
        
        int pilihan;
        do {
            System.out.println("\nMenu Soal:");
            System.out.println("1. Rata-rata & Nilai di Atas Rata-rata");
            System.out.println("2. Pisah Genap & Ganjil");
            System.out.println("3. Inverse Array");
            System.out.println("4. Cari Elemen Terbesar & Posisi");
            System.out.println("5. Jumlah, Kali, Rata-rata, Median");
            System.out.println("6. Bubble Sort dengan Count Swap");
            System.out.println("7. Frekuensi Elemen");
            System.out.println("8. Gabung Dua Array & Sort");
            System.out.println("9. Hapus Duplikat");
            System.out.println("10. Rotasi Array ke Kanan");
            System.out.println("0. Keluar");
            System.out.print("\nPilih soal (0-10): ");
            pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1: soal1(); break;
                case 2: soal2(); break;
                case 3: soal3(); break;
                case 4: soal4(); break;
                case 5: soal5(); break;
                case 6: soal6(); break;
                case 7: soal7(); break;
                case 8: soal8(); break;
                case 9: soal9(); break;
                case 10: soal10(); break;
                case 0: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}
