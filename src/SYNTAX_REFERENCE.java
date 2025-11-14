/**
 * SYNTAX REFERENCE - PEMROGRAMAN DASAR JAVA
 * Panduan lengkap syntax untuk UTP
 */

public class SYNTAX_REFERENCE {
    
    // ===== 1. VARIABEL & TIPE DATA =====
    
    public static void variabelDanTipeData() {
        // Integer
        int angka = 10;
        long angkaLarge = 100000L;
        
        // Float & Double
        float desimal1 = 3.14f;
        double desimal2 = 3.14;
        
        // Boolean
        boolean benar = true;
        boolean salah = false;
        
        // String
        String nama = "Budi";
        String gabung = "Halo " + nama;
        
        // Char
        char huruf = 'A';
    }
    
    // ===== 2. INPUT OUTPUT =====
    
    public static void inputOutput() {
        // OUTPUT
        System.out.println("Print dengan newline");
        System.out.print("Print tanpa newline");
        System.out.printf("Format: %d %s %.2f\n", 10, "text", 3.14);
        
        // INPUT (dengan Scanner)
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int num = input.nextInt();
        
        System.out.print("Masukkan text: ");
        String text = input.nextLine();
        
        System.out.print("Masukkan desimal: ");
        double des = input.nextDouble();
        
        input.close();
    }
    
    // ===== 3. OPERATOR ARITMATIKA =====
    
    public static void operatorAritmatika() {
        int a = 10;
        int b = 3;
        
        int tambah = a + b;      // 13
        int kurang = a - b;      // 7
        int kali = a * b;        // 30
        int bagi = a / b;        // 3 (integer)
        int modulo = a % b;      // 1 (sisa bagi)
        
        // Increment & Decrement
        a++;    // a = 11
        a--;    // a = 10
        ++a;    // pre-increment
        a += 5; // a = a + 5
        a -= 2; // a = a - 2
    }
    
    // ===== 4. OPERATOR PERBANDINGAN =====
    
    public static void operatorPerbandingan() {
        int a = 10;
        int b = 5;
        
        boolean hasil1 = a == b;   // false (sama dengan)
        boolean hasil2 = a != b;   // true (tidak sama dengan)
        boolean hasil3 = a > b;    // true (lebih dari)
        boolean hasil4 = a < b;    // false (kurang dari)
        boolean hasil5 = a >= b;   // true (lebih dari atau sama)
        boolean hasil6 = a <= b;   // false (kurang dari atau sama)
    }
    
    // ===== 5. OPERATOR LOGIKA =====
    
    public static void operatorLogika() {
        boolean a = true;
        boolean b = false;
        
        boolean dan = a && b;      // false (AND)
        boolean atau = a || b;     // true (OR)
        boolean tidak = !a;        // false (NOT)
        
        // Kombinasi
        if (a && (b || !b)) {
            System.out.println("Kondisi terpenuhi");
        }
    }
    
    // ===== 6. SELEKSI KONDISI (IF-ELSE) =====
    
    public static void seleksiKondisi() {
        int nilai = 75;
        
        // IF
        if (nilai >= 80) {
            System.out.println("Grade A");
        }
        
        // IF-ELSE
        if (nilai >= 80) {
            System.out.println("Grade A");
        } else {
            System.out.println("Grade kurang dari A");
        }
        
        // IF-ELSE IF-ELSE
        if (nilai >= 80) {
            System.out.println("Grade A");
        } else if (nilai >= 70) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
        
        // TERNARY (short IF-ELSE)
        String grade = (nilai >= 80) ? "A" : "B";
        System.out.println(grade);
    }
    
    // ===== 7. SWITCH CASE =====
    
    public static void switchCase() {
        int bulan = 3;
        String namaBulan;
        
        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            default:
                namaBulan = "Bulan tidak dikenal";
        }
        
        System.out.println(namaBulan);
    }
    
    // ===== 8. PERULANGAN FOR =====
    
    public static void perulanganFor() {
        // FOR biasa
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // FOR mundur
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        // FOR dengan step 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        
        // FOR nested (loop dalam loop)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        // FOR-EACH (loop array)
        int[] arr = {10, 20, 30};
        for (int num : arr) {
            System.out.println(num);
        }
    }
    
    // ===== 9. PERULANGAN WHILE =====
    
    public static void perulanganWhile() {
        // WHILE
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        
        // DO-WHILE (minimal jalan 1x)
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
        
        // WHILE dengan kondisi kompleks
        java.util.Scanner input = new java.util.Scanner(System.in);
        String perintah = "";
        while (!perintah.equals("keluar")) {
            System.out.print("Masukkan perintah: ");
            perintah = input.nextLine();
        }
        input.close();
    }
    
    // ===== 10. BREAK & CONTINUE =====
    
    public static void breakContinue() {
        // BREAK - keluar dari loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // keluar loop
            }
            System.out.println(i);  // print 1,2,3,4
        }
        
        // CONTINUE - lanjut iterasi berikutnya
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // skip ke iterasi berikutnya
            }
            System.out.println(i);  // print 1,2,3,4,6,7,8,9,10
        }
    }
    
    // ===== 11. ARRAY 1 DIMENSI =====
    
    public static void array1Dimensi() {
        // Deklarasi dan inisialisasi
        int[] arr = {10, 20, 30, 40, 50};
        
        // Deklarasi ukuran terlebih dahulu
        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        
        // Akses element
        System.out.println(arr[0]);        // 10
        System.out.println(arr.length);    // 5
        
        // Loop array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        // FOR-EACH array
        for (int num : arr) {
            System.out.println(num);
        }
        
        // String array
        String[] nama = {"Budi", "Ani", "Citra"};
    }
    
    // ===== 12. ARRAY 2 DIMENSI (MATRIX) =====
    
    public static void array2Dimensi() {
        // Deklarasi matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Akses element
        System.out.println(matrix[0][0]);    // 1
        System.out.println(matrix[1][2]);    // 6
        
        // Loop matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Deklarasi ukuran
        int[][] arr = new int[3][3];
    }
    
    // ===== 13. STRING OPERATION =====
    
    public static void stringOperation() {
        String text = "Hello World";
        
        // Length
        int panjang = text.length();        // 11
        
        // charAt - ambil karakter di index
        char c = text.charAt(0);            // 'H'
        
        // substring - ambil potongan
        String sub = text.substring(0, 5); // "Hello"
        
        // toUpperCase & toLowerCase
        String upper = text.toUpperCase();  // "HELLO WORLD"
        String lower = text.toLowerCase();  // "hello world"
        
        // contains - cek isi
        boolean ada = text.contains("World"); // true
        
        // indexOf - cari posisi
        int pos = text.indexOf("World");    // 6
        
        // replace - ganti
        String replaced = text.replace("World", "Java"); // "Hello Java"
        
        // split - potong berdasarkan delimiter
        String[] words = text.split(" ");   // ["Hello", "World"]
        
        // equals - bandingkan string
        boolean sama = text.equals("Hello World");  // true
        
        // Concatenation
        String gabung = "Hello" + " " + "World";
    }
    
    // ===== 14. METHOD / FUNCTION =====
    
    public static void methodTanpaParameter() {
        System.out.println("Method tanpa parameter");
    }
    
    public static void methodDenganParameter(int a, String b) {
        System.out.println("Nilai: " + a + " " + b);
    }
    
    public static int methodDenganReturn(int x, int y) {
        return x + y;
    }
    
    // Overloading (method dengan nama sama tapi parameter berbeda)
    public static void print(int a) {
        System.out.println("Int: " + a);
    }
    
    public static void print(String a) {
        System.out.println("String: " + a);
    }
    
    public static void print(double a) {
        System.out.println("Double: " + a);
    }
    
    // ===== 15. SORTING ARRAY (BUBBLE SORT) =====
    
    public static void bubbleSort(int[] arr) {
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
    }
    
    // ===== 16. SEARCHING ARRAY (LINEAR SEARCH) =====
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // ketemu, return index
            }
        }
        return -1;  // tidak ketemu
    }
    
    // ===== 17. PATTERN PRINTING =====
    
    public static void patternSegitiga(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternInvertedSegitiga(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // ===== 18. MATHEMATICAL FUNCTION =====
    
    public static void mathFunction() {
        // Math.abs - absolute value
        int abs = Math.abs(-10);        // 10
        
        // Math.max & Math.min
        int max = Math.max(10, 20);     // 20
        int min = Math.min(10, 20);     // 10
        
        // Math.pow - pangkat
        double power = Math.pow(2, 3);  // 8.0
        
        // Math.sqrt - akar kuadrat
        double sqrt = Math.sqrt(16);    // 4.0
        
        // Math.random - random 0.0 - 1.0
        double random = Math.random();
        
        // Random angka 1-10
        int randomInt = (int)(Math.random() * 10) + 1;
    }
    
    // ===== 19. EXCEPTION HANDLING =====
    
    public static void exceptionHandling() {
        try {
            int hasil = 10 / 0;  // Error!
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai");
        }
    }
    
    // ===== 20. CLASS & OBJECT (DASAR) =====
    
    static class Mobil {
        // Attribute
        String merk;
        String warna;
        int tahun;
        
        // Constructor
        Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }
        
        // Method
        void informasi() {
            System.out.println("Merk: " + merk + ", Warna: " + warna + ", Tahun: " + tahun);
        }
    }
    
    // ===== MAIN - TESTING SEMUA SYNTAX =====
    
    public static void main(String[] args) {
        System.out.println("===== SYNTAX REFERENCE =====\n");
        
        // Test input output
        System.out.println("1. Variabel & Tipe Data");
        variabelDanTipeData();
        
        System.out.println("\n2. Operator Aritmatika");
        int a = 10, b = 3;
        System.out.println("10 + 3 = " + (a + b));
        System.out.println("10 % 3 = " + (a % b));
        
        System.out.println("\n3. Operator Perbandingan");
        System.out.println("10 > 3: " + (10 > 3));
        System.out.println("10 == 3: " + (10 == 3));
        
        System.out.println("\n4. Operator Logika");
        System.out.println("true && false: " + (true && false));
        System.out.println("true || false: " + (true || false));
        
        System.out.println("\n5. Seleksi Kondisi");
        int nilai = 75;
        if (nilai >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }
        
        System.out.println("\n6. FOR Loop (1-5)");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n7. WHILE Loop");
        int i = 1;
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        System.out.println("\n8. Array");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\n9. String Operation");
        String text = "Hello World";
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains 'World': " + text.contains("World"));
        
        System.out.println("\n10. Pattern Segitiga");
        patternSegitiga(4);
        
        System.out.println("\n11. Math Function");
        System.out.println("Math.abs(-10): " + Math.abs(-10));
        System.out.println("Math.max(10,20): " + Math.max(10, 20));
        System.out.println("Math.pow(2,3): " + Math.pow(2, 3));
        
        System.out.println("\n12. Class & Object");
        Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);
        mobil1.informasi();
    }
}
