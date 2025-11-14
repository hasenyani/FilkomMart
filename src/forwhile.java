// ===== PROGRAM 3: FOR-WHILE KOMBINASI - Analisis Nilai Mahasiswa =====
import java.util.Scanner;

public class forwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        double totalNilai = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        // FOR LOOP untuk input data setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("\n=== MAHASISWA KE-" + i + " ===");
            System.out.print("Nama mahasiswa: ");
            input.nextLine(); // Clear buffer
            String nama = input.nextLine();
            
            double nilai = 0;
            boolean validInput = false;
            
            // WHILE LOOP untuk validasi input nilai
            while (!validInput) {
                System.out.print("Masukkan nilai " + nama + " (0-100): ");
                nilai = input.nextDouble();
                
                if (nilai >= 0 && nilai <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Nilai harus antara 0-100! Coba lagi.");
                }
            }
            
            // Proses data
            totalNilai += nilai;
            String status;
            
            if (nilai >= 60) {
                status = "LULUS";
                jumlahLulus++;
            } else {
                status = "TIDAK LULUS";
                jumlahTidakLulus++;
            }
            
            System.out.printf("Hasil: %s - %.1f (%s)\n", nama, nilai, status);
        }
        
        // Menampilkan statistik akhir
        double rataRata = totalNilai / jumlahMahasiswa;
        double persentaseLulus = (double) jumlahLulus / jumlahMahasiswa * 100;
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("STATISTIK HASIL UJIAN");
        System.out.println("=".repeat(40));
        System.out.printf("Total Mahasiswa      : %d\n", jumlahMahasiswa);
        System.out.printf("Rata-rata Nilai      : %.2f\n", rataRata);
        System.out.printf("Jumlah Lulus         : %d\n", jumlahLulus);
        System.out.printf("Jumlah Tidak Lulus   : %d\n", jumlahTidakLulus);
        System.out.printf("Persentase Kelulusan : %.1f%%\n", persentaseLulus);
        
        input.close();
    }
}
    
    

