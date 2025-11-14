import java.util.Scanner;
public class array {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] a = {5,10,15};
        int[] b = {10,20,30};
        int[] hasil = new int[3];

        for (int i = 0; i<3; i++){
            hasil[i] = a[i] + b[i];
     }
        System.out.println("Array A:");
        for (int i = 0; i < 3; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        
        System.out.println("\nArray B:");
        for (int i = 0; i < 3; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
        
        System.out.println("\nHasil A + B:");
        for (int i = 0; i < 3; i++) {
            System.out.println("hasil[" + i + "] = " + a[i] + " + " + b[i] + " = " + hasil[i]);
        }
        
        System.out.print("\nArray A: [");
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]);
            if (i < 2) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("Array B: [");
        for (int i = 0; i < 3; i++) {
            System.out.print(b[i]);
            if (i < 2) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("A + B  : [");
        for (int i = 0; i < 3; i++) {
            System.out.print(hasil[i]);
            if (i < 2) System.out.print(", ");
        }
        System.out.println("]");
    }
}
