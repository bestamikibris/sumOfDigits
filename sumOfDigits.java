import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int result = 0, number;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number = inp.nextInt();

        while (number != 0) {
            result = result + number % 10;
            number /= 10;
        }
        
        System.out.println("Girilen Sayının Basamaklar Toplamı: " + result);
    }
}