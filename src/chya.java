import java.util.Scanner;

public class chya{
    
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
        int volumeA = pa * la * ta;
        int volumeB = pb * lb * tb;
        int volumeC = pc * lc * tc;
        int maxVolume = volumeA;
        String biggest = "A";
        
        if (volumeB > maxVolume) {
            maxVolume = volumeB;
            biggest = "B";
        } else if (volumeB == maxVolume) {
            if (biggest.equals("B") || biggest.equals("C")) {
                biggest = "A"; 
            }
        }
        
        if (volumeC > maxVolume) {
            maxVolume = volumeC;
            biggest = "C";
        } else if (volumeC == maxVolume) {
            if (biggest.equals("B") || biggest.equals("C")) {
                biggest = "A"; 
            } else if (biggest.equals("C")) {
                biggest = "B"; 
            }
        }
        
        int minVolume = volumeA;
        String smallest = "A";
        
        if (volumeB < minVolume) {
            minVolume = volumeB;
            smallest = "B";
        } else if (volumeB == minVolume) {
            smallest = "A";
        }
        
        if (volumeC < minVolume) {
            minVolume = volumeC;
            smallest = "C";
        } else if (volumeC == minVolume) {
            if (smallest.equals("B") || smallest.equals("C")) {
                smallest = "A"; 
            } else if (smallest.equals("C")) {
                smallest = "B"; 
            }
        }
        
        if (volumeA >= volumeB && volumeA >= volumeC) {
            biggest = "A";
        } else if (volumeB >= volumeA && volumeB >= volumeC) {
            if (volumeA == volumeB) {
                biggest = "A"; 
            } else {
                biggest = "B";
            }
        } else {
            if (volumeA == volumeC) {
                biggest = "A"; 
            } else if (volumeB == volumeC) {
                biggest = "B";
            } else {
                biggest = "C";
            }
        }
        
        if (volumeA <= volumeB && volumeA <= volumeC) {
            smallest = "A";
        } else if (volumeB <= volumeA && volumeB <= volumeC) {
            if (volumeA == volumeB) {
                smallest = "A"; 
            } else {
                smallest = "B";
            }
        } else {
            if (volumeA == volumeC) {
                smallest = "A"; 
            } else if (volumeB == volumeC) {
                smallest = "B"; 
            } else {
                smallest = "C";
            }
        }
        
        System.out.println(smallest); 
        System.out.print(smallest);
        
        input.close();
    }
}

