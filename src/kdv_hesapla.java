
import java.util.Scanner;


public class kdv_hesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Kdv'si hesaplanacak sayiyi giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Kdv' siz fiyat: " + sayi);
        boolean kdv = sayi > 1000;
        double kdvli = kdv ? sayi +  (sayi*0.08) : sayi + (sayi*0.18);
        System.out.println("Kdv'li fiyat: " + kdvli);
        double kdv_tutari= kdvli - sayi;
        System.out.println("Kdv tutari: " + kdv_tutari);


    }
}
