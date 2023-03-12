package Homework3;

import java.util.Scanner;
import java.util.Random; 
import java.util.Arrays;
public class Main1 {

	   public static void main(String[] args) {
        int gamer = 1;
        int count = 0;
        int[] list = new int[20];
        int[] newList = new int[20];
 
        while(true) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int number = rand.nextInt(1,101);
            int counter = 0;
            int estimate ;
            System.out.println("Rastgele atanan sayi 1 ile 100 arasındadır " );



            do {
                System.out.println("1 ile 100 arasında bir sayı tahmin ediniz : ");
                estimate = scan.nextInt();

                if (estimate > number ) {
                    System.out.println("Too high, try again... ");
                } else if(estimate < number) {
                    System.out.println("Too low, try again... ");
                }
                counter++;

            }

            while(number != estimate);
            System.out.println("Tebrikler doğru tahmin ettiniz ! " + counter + ".Denemede Buldunuz!");
            System.out.println("Oyuna devam etmek istiyor musunuz? : Evet ise 1\nHayır ise 0");
            int decision = scan.nextInt();

            if(decision == 0) {
                System.out.println("Oyundan Çıktınız");
                return;
            } else if(decision == 1) {
                list[count] = counter;
                Arrays.sort(list);
                for(int i = 0; i < list.length; i++) {
                    if(list[i] != 0) {
                        System.out.println(list[i]);
                    }
                }
                System.out.println("Yeni Oyuncu? (evet için 1 - hayır için 0: ");
                int gamerDecision = scan.nextInt();
                if(gamerDecision == 0){
                    continue;
                }
                else if(gamerDecision == 1){
                    gamer++;
                }
                count++;
            }

        }
}
 }
