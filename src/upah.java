import java.util.Scanner;
public class upah {
    //Muhammad Zikra Aditya
    //255150407111001

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja;
        double upahPerJam = 5000;
        Double denda = 0.0;
        Double upah_Lembur = 0.0;

        jamKerja = input.nextInt();
        if (jamKerja > 60) {
            upah_Lembur = (jamKerja - 60) * 6000.0;
        } else if (jamKerja < 50) {
            denda = (50 - jamKerja) * 1000.0;
        } else {
            upah_Lembur = 0.0;
            denda = 0.0;
        }

        System.out.println("Jam Kerja\t: " + jamKerja);
        System.out.println("Upah\t= " + upahPerJam * jamKerja);
        System.out.println("lembur\t= " + upah_Lembur);
        System.out.println("Denda\t= "+ denda);
        System.out.println("------------------------");
        System.out.println("Total\t= " + (upahPerJam * jamKerja + upah_Lembur - denda));

    }
}