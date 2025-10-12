import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        double Luas;
        int LuasSegitiga;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan luas alas");
        int alas = input.nextInt();
        System.out.println("Masukkan tinggi");
        int tinggi = input.nextInt();

        LuasSegitiga = (alas*tinggi/2) ;   
        
        System.out.println("Hasil luas segitiga adalah" + LuasSegitiga);
    }
    
}