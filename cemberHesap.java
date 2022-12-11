import java.util.Scanner;

public class cemberHesap{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Bu program daire için alan ve çevre hesaplamaktadır. Lütfen alan hesabı için 1, çevre hesabı için 2 tuşlayınız.");
		final double pi = 3.14;
	int secenek = input.nextInt();
		if (secenek == 1){
			System.out.println("Alan hesabını seçtiniz. Lütfen hesaplanmasını istediğiniz daire alanının yarıçapını giriniz.");
			double yaricap = input.nextDouble();
			double alan = yaricap*yaricap*pi;
			System.out.println(yaricap + " yarıçaplı dairenin alanı: " + alan + " dır.");
		}
		else {
			System.out.println("Çevre hesabını girdiniz. Lütfen hesaplanmasını istediğiniz daire çevresinin yarıçapını giriniz");
			double yariCap = input.nextDouble();
			double cevre  = 2*pi*yariCap;
			System.out.println(yariCap + "yarıçaplı dairenin çevresi " + cevre + "dır");
		}
    }
}
