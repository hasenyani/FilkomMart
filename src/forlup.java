import java.util.Scanner;

public class forlup {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int a;
        a = in.nextInt();

        /*
         * *
         * **
         * ***
         * ****
         * *****
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " " );
            
        }

        // while (a > 0) {
        //     System.out.println("Ini Bendera ke " + a);
        //     a--;
        // }

        // do {
        //     System.out.println("Ini bendera");
        //     a--;
        // }while(a > 0);


    }

}
