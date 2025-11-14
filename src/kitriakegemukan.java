import java.util.Scanner;
public class kitriakegemukan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();
        
        double bmi = berat / (tinggi * tinggi);
        System.out.printf("BMI Anda: %.2f\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Status: Kekurangan berat badan");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Status: Normal (ideal)");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Status: Kelebihan berat badan");
        } else {
            System.out.println("Status: Obesitas");
        }
        
        input.close();
    }
}