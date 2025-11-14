import java.util.Scanner;
public class bialangangenap {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int[][] arr2 = new int[n][n];
        
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
                }
            }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr2[j][n-1-i] = arr[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
         
    

    }
    
}
