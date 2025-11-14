import java.util.Scanner;
public class tugas2{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("input N: ");
        int n = input.nextInt();

        System.out.println("N: " );

        int angka = 1;
        int counter = 0;

        while (counter < n) {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
                counter++;
            }
            angka++;
        }

        System.out.println();
        input.close();
    }
    
}
