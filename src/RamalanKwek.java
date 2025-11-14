import java.util.Scanner;

public class RamalanKwek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hari = input.nextInt();
        
        String ramalan = "";
        
        
        if (hari % 3 == 0 && hari % 7 == 0) {
            ramalan = "Kwek bareng crush";
        } else if (hari % 7 == 0) {
            ramalan = "Crush sendiri";
        } else if (hari % 3 == 0) {
            ramalan = "Kwek sendiri";
        } else {
           System.out.println(hari);
        }   
        
        System.out.println(ramalan);
        
        input.close();
    }
}