/*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.Scanner;

public class koperhilang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
        int uangKwek = input.nextInt();
        int hargaNasiGoreng = input.nextInt();
        int hargaAyamGeprek = input.nextInt();
        int hargaMieYamin = input.nextInt();
        int hargaAyamKatsu = input.nextInt();
        
        String[] namaMakanan = {"Nasi Goreng", "Ayam Geprek", "Mie Yamin", "Ayam Katsu"};
        int[] hargaMakanan = {hargaNasiGoreng, hargaAyamGeprek, hargaMieYamin, hargaAyamKatsu};
        
        
        String makananTerpilih = "";
        int hargaTermahal = 0;
        boolean bisaBeli = false;
        
        for (int i = 0; i < namaMakanan.length; i++) {
            if (hargaMakanan[i] <= uangKwek && hargaMakanan[i] > hargaTermahal) {
                hargaTermahal = hargaMakanan[i];
                makananTerpilih = namaMakanan[i];
                bisaBeli = true;
            }
        }
        
        // Output hasil
        if (bisaBeli) {
            System.out.println("Kwek memilih " + makananTerpilih);
        } else {
            System.out.println("Kwek puasa hari ini");
        }
        
        input.close();
    }
}

            
        
    
    

