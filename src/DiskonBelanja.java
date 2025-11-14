 import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double hargaPerBaju = input.nextDouble();
        int jumlahBaju = input.nextInt();
        double totalHarga = hargaPerBaju * jumlahBaju;
        double totalBiaya = 0.00;
        
        if (totalHarga >= 100) {
            double diskon = totalHarga * 0.25;
            totalBiaya = totalHarga - diskon;
            System.out.printf("%.2f %n", totalBiaya);
        } else {
            totalBiaya = totalHarga;
            System.out.printf("%.2f %n", totalHarga);
        }
        input.close();
    }
}
