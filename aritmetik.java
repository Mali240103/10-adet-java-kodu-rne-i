//Aritmetik ortalama hesaplayan java kodu
import java.util.Scanner;
public class aritmetik{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("bu program tamsayılar aritmetik ortalama hesabı yapmaktadır. \n \n Lütfen hesabını yapmak istediğiniz sayıları giriniz. Ardından toplama işlemini başlatmak için lütfen 0 sayısını giriniz. Not: 0 sayısını giremdiğiniz takdirde toplama işlemi başlamayacaktır.");
		double sayi0 = input.nextInt();
		double i = 0;
		double toplam = 0;
		while( true ){
			int sayi1 = input.nextInt();
			if (sayi1 == 0){
			break;
			}
				toplam = sayi1 + sayi0;
				sayi0 = toplam;
				i = i + 1;	 
				
		}
		i = i+1;
		toplam = toplam / i;
		//i = i-1;
		System.out.println("Girdiğiniz " + i  + "  sayının toplamı  " + toplam + " dır" );
		
		
	}
}