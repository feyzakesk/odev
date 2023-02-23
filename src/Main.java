import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, a = -1, sub= 0;

        Scanner input = new Scanner(System.in);

        System.out.print("LÜtfen bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 0 ; i <= sayi ; i++){

            if (i % 3 == 0 && i % 4 == 0){
                sub += i;
                a ++;
                System.out.println("Seçtiğiniz sayıya kadar 3'e ve 4'e aynı anda bölünen sayılar : " +i);
            }
        }
        System.out.println("Bu sayıların toplamı : " + sub);
        System.out.println("Kaç adet sayı var : " +a);
        System.out.println("Ortalamanız : " + sub/a);
    }
}