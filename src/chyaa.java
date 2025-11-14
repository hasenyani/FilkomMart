import java.util.Scanner;

public class chyaa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pa = input.nextInt();
        int la = input.nextInt(); 
        int ta = input.nextInt();
        
        int pb = input.nextInt();
        int lb = input.nextInt();
        int tb = input.nextInt();
        
        int pc = input.nextInt();
        int lc = input.nextInt();
        int tc = input.nextInt();
        
        long volumeA = (long) pa * la * ta;
        long volumeB = (long) pb * lb * tb;
        long volumeC = (long) pc * lc * tc;
        
        long maxVolume = Math.max(volumeA, Math.max(volumeB, volumeC));
        long minVolume = Math.min(volumeA, Math.min(volumeB, volumeC));
        

        char biggest = ' ';
        if (volumeA == maxVolume) {
            biggest = 'A';
        } else if (volumeB == maxVolume) {
            biggest = 'B';
        } else {
            biggest = 'C';
        }
        
        char smallest = ' ';
        if (volumeA == minVolume) {
            smallest = 'A';
        } else if (volumeB == minVolume) {
            smallest = 'B';
        } else {
            smallest = 'C';
        }
        
        
        if (volumeA == volumeB && volumeA == maxVolume) {
            biggest = 'A';  
        } else if (volumeB == volumeC && volumeB == maxVolume) {
            biggest = 'B';  
        } else if (volumeA == volumeC && volumeA == maxVolume) {
            biggest = 'A';  
        }
        
        if (volumeA == volumeB && volumeA == minVolume) {
            smallest = 'A'; 
        } else if (volumeB == volumeC && volumeB == minVolume) {
            smallest = 'B'; 
        } else if (volumeA == volumeC && volumeA == minVolume) {
            smallest = 'A';  
        }
        
        System.out.println(biggest + "" + smallest);
        
        input.close();
    }
}
