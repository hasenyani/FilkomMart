import java.util.Scanner;
public class praktek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        
        int hasil = 0;
        
        if (angka > 0) {
            int temp = angka;
            hasil = 1; 
            
            while (temp > 1) {
                if (temp % 2 != 0) {
                    hasil = 0; 
                    break;
                }
                temp = temp / 2;
            }
        }
        
        if (hasil == 1) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }
    }
}