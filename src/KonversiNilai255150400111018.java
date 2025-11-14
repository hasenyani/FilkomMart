import java.util.Scanner;
public class KonversiNilai255150400111018 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double nilai;
        System.out.print("masukkan nilai: ");
        nilai = input.nextDouble();
        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >74.9) {
            System.out.println("B+");
        } else if (nilai >70) {
            System.out.println("B"); 
        } else if (nilai >64.9) {
            System.out.println("C+");
        } else if (nilai >60) {
            System.out.println("C");
        } else if (nilai >54.9) {
            System.out.println("D+");
        } else if (nilai >40) {
            System.out.println("D");
        } else {System.out.println("E");}
        }
}
