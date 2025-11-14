/*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.ArrayList;
import java.util.Scanner;

public class modul_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean running = true;
        ArrayList<Double> dataList = new ArrayList<>();
        while (running) {
            System.out.println("\nPilihan menu:");
            System.out.println("1. input data");
            System.out.println("2. Lihat data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            pilihan = input.nextInt();
            switch(pilihan) {
                case 1 -> {
                    System.out.println("Anda memilih menu input data");
                    System.out.print("Masukkan data (angka): ");
                    try {
                        double data = input.nextDouble();
                        dataList.add(data);
                        System.out.println("Data " + data + " berhasil ditambahkan!");
                    } catch (Exception e) {
                        System.out.println("Input tidak valid. Masukkan angka yang benar!");
                        input.next();
                    }
                }
                case 2 -> {
                    System.out.println("Anda memilih menu lihat data");
                    if (dataList.isEmpty()) {
                        System.out.println("Belum ada data yang tersimpan.");
                    } else {
                        System.out.println("Data yang tersimpan:");
                        for (int i = 0; i < dataList.size(); i++) {
                            System.out.println((i+1) + ". " + dataList.get(i));
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Anda memilih menu average");
                    if (dataList.isEmpty()) {
                        System.out.println("Belum ada data yang tersimpan.");
                    } else {
                        double sum = 0;
                        for (double value : dataList) {
                            sum += value;
                        }
                        double average = sum / dataList.size();
                        System.out.println("Rata-rata data: " + average);
                    }
                }
                case 4 -> {
                    System.out.println("Anda memilih menu sum");
                    if (dataList.isEmpty()) {
                        System.out.println("Belum ada data yang tersimpan.");
                    } else {
                        double sum = 0;
                        for (double value : dataList) {
                            sum += value;
                        }
                        System.out.println("Total data: " + sum);
                    }
                }
                case 5 -> {
                    System.out.println("Anda memilih menu max");
                    if (dataList.isEmpty()) {
                        System.out.println("Belum ada data yang tersimpan.");
                    } else {
                        double max = dataList.get(0);
                        for (double value : dataList) {
                            if (value > max) {
                                max = value;
                            }
                        }
                        System.out.println("Nilai maksimum: " + max);
                    }
                }
                case 6 -> {
                    System.out.println("Anda memilih menu min");
                    if (dataList.isEmpty()) {
                        System.out.println("Belum ada data yang tersimpan.");
                    } else {
                        double min = dataList.get(0);
                        for (double value : dataList) {
                            if (value < min) {
                                min = value;
                            }
                        }
                        System.out.println("Nilai minimum: " + min);
                    }
                }
                case 0 -> {
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    running = false;
                }
                default -> {
                    System.out.println("Pilihan tidak valid. Program akan berhenti.");
                    running = false;
                }
            }
        }
    }
}