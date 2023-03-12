package Homework3;
import java.util.Scanner;
public class Main {

	         static Scanner scan = new Scanner(System.in);

	        public static boolean isPalindrome(String str) {
	            int i = 0;
	            int j = str.length() - 1;
	            while (i <= j) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    return true;
	                }
	                i++;
	                j--;
	            }
	            return false;
	        }


	        public static void main(String[] args) {

	            String word;
	            System.out.print("Kelimeyi Giriniz: ");
	            word = scan.nextLine();
	            if (isPalindrome(word)) {
	                System.out.println(word + " bir palindrom kelime.");
	            } else {
	                System.out.println(word + " bir palindrom kelime değil!.");
	            }
	        }
	}  