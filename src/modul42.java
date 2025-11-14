/*
    SHILVIA HASENYANI
        255150400111018
 */
import java.util.Scanner;
public class modul42 {
    public static void printBorder() {
        System.out.println("+------------+------------+----------+------------+------------+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] pesanan = new String[10][3];
        int jumlahPesanan = 0;
        String[][] tabel = {
            {"Jenis", "Harga", "Diskon", "AC", "Colokan"},
            {"Ekonomi", "50000", "2 %", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5 %", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7 %", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10 %", "Ada", "Ada"}
        };
        boolean running = true;
        while (running) {
            System.out.println("\nPilihan Kereta Api");
            System.out.println("1. Daftar Kereta Api");
            System.out.println("2. Daftar Kereta Api yang ada AC");
            System.out.println("3. Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Pesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket Kereta Api");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("Daftar Kereta Api:");
                    printBorder();
                    System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                        tabel[0][0], tabel[0][1], tabel[0][2], tabel[0][3], tabel[0][4]);
                    printBorder();
                    for (int i = 1; i < tabel.length; i++) {
                        System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                            tabel[i][0], tabel[i][1], tabel[i][2], tabel[i][3], tabel[i][4]);
                    }
                    printBorder();
                    break;
                case 2:
                    System.out.println("Daftar Kereta Api yang ada AC:");
                    printBorder();
                    System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                        tabel[0][0], tabel[0][1], tabel[0][2], tabel[0][3], tabel[0][4]);
                    printBorder();
                    boolean adaAC = false;
                    for (int i = 1; i < tabel.length; i++) {
                        if (tabel[i][3].equals("Ada")) {
                            System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                                tabel[i][0], tabel[i][1], tabel[i][2], tabel[i][3], tabel[i][4]);
                            adaAC = true;
                        }
                    }
                    if (!adaAC) {
                        System.out.println("| Tidak ada kereta dengan fasilitas AC |");
                    }
                    printBorder();
                    break;
                case 3:
                    System.out.println("Daftar Kereta Api yang ada Colokan:");
                    printBorder();
                    System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                        tabel[0][0], tabel[0][1], tabel[0][2], tabel[0][3], tabel[0][4]);
                    printBorder();
                    boolean adaColokan = false;
                    for (int i = 1; i < tabel.length; i++) {
                        if (tabel[i][4].equals("Ada")) {
                            System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-10s |\n",
                                tabel[i][0], tabel[i][1], tabel[i][2], tabel[i][3], tabel[i][4]);
                            adaColokan = true;
                        }
                    }
                    if (!adaColokan) {
                        System.out.println("| Tidak ada kereta dengan fasilitas colokan |");
                    }
                    printBorder();
                    break;
                case 4:
                    System.out.println("Pesan Tiket Kereta Api:");
                    System.out.println("Daftar Kereta Api tersedia:");
                    for (int i = 1; i < tabel.length; i++) {
                        System.out.println(i + ". " + tabel[i][0] +
                            " - Rp " + tabel[i][1] + " (Diskon " + tabel[i][2] + ")");
                    }
                    System.out.print("\nPilih jenis kereta (1-" + (tabel.length - 1) + "): ");
                    int pilihKereta = input.nextInt();
                    if (pilihKereta >= 1 && pilihKereta < tabel.length) {
                        System.out.print("Jumlah tiket: ");
                        int jumlahTiket = input.nextInt();
                        int harga = Integer.parseInt(tabel[pilihKereta][1]);
                        String diskonStr = tabel[pilihKereta][2].replace(" %", "");
                        double diskon = Double.parseDouble(diskonStr) / 100;
                        double totalHarga = harga * jumlahTiket;
                        double potonganDiskon = totalHarga * diskon;
                        double totalBayar = totalHarga - potonganDiskon;
                        pesanan[jumlahPesanan][0] = tabel[pilihKereta][0];
                        pesanan[jumlahPesanan][1] = String.valueOf(jumlahTiket);
                        pesanan[jumlahPesanan][2] = String.valueOf((int)totalBayar);
                        jumlahPesanan++;
                        System.out.println("\n============= DETAIL PEMESANAN =============");
                        System.out.println("+------------------------------------------+");
                        System.out.printf("| %-20s : %-15s |\n", "Jenis Kereta", tabel[pilihKereta][0]);
                        System.out.printf("| %-20s : Rp %-12s |\n", "Harga Tiket", tabel[pilihKereta][1]);
                        System.out.printf("| %-20s : %-15d |\n", "Jumlah Tiket", jumlahTiket);
                        System.out.printf("| %-20s : Rp %-12d |\n", "Total Harga", (int)totalHarga);
                        System.out.printf("| %-20s : Rp %-12d |\n", "Diskon (" + tabel[pilihKereta][2] + ")", (int)potonganDiskon);
                        System.out.println("+------------------------------------------+");
                        System.out.printf("| %-20s : Rp %-12d |\n", "TOTAL BAYAR", (int)totalBayar);
                        System.out.println("+------------------------------------------+");
                        System.out.println("\nFASILITAS:");
                        System.out.printf("- AC : %s\n", tabel[pilihKereta][3]);
                        System.out.printf("- Colokan : %s\n", tabel[pilihKereta][4]);
                        System.out.println("\n!Pemesanan berhasil!");
                    } else {
                        System.out.println("Pilihan kereta tidak valid!");
                    }
                    break;
                case 5:
                    System.out.println("Daftar Pesanan Tiket Kereta Api:");
                    if (jumlahPesanan == 0) {
                        System.out.println("\nBelum ada pesanan tiket!");
                    } else {
                        System.out.println("+-----+---------------+---------+----------------+");
                        System.out.printf("| %-3s | %-13s | %-7s | %-14s |\n", "No", "Jenis Kereta", "Jumlah", "Total Bayar");
                        System.out.println("+-----+---------------+---------+----------------+");
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.printf("| %-3d | %-13s | %-7s | Rp %-11s |\n",
                                (i+1), pesanan[i][0], pesanan[i][1], pesanan[i][2]);
                        }
                        System.out.println("+-----+---------------+---------+----------------+");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }
}