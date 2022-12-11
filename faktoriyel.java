//Faktöriyel hesabı programı	
import java.util.Scanner;

public class faktoriyel{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen faktöriyelinin hesaplanmasını istediğiniz bir sayı giriniz.");
		int sayi = input.nextInt();
		int sayi2 = 1;
		int carpim = 1;
		while (sayi != 1){
			carpim = carpim * sayi;
			sayi2 = sayi2 + 1;
			sayi = sayi - 1;
		}
		System.out.println(sayi2 + "   sayısının faktöriyeli    " + carpim + "   dir");
	}
}