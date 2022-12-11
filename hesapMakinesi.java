//Basit Hesap Makinesi
import java.util.Scanner;
public class hesapMakinesi{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int sayi3 = 1;
		int sayi0 = 0;
		while (true){
			System.out.println("Basit Hesap Makinesi \n \n lütfen yapmak istediğiniz işlemi yazınız \n \n (toplama,cikarma,carpma,bolme)");
			String islem = input.nextLine();
			//islem.toLowercase();
			if(islem.equalsIgnoreCase("toplama")){
				int toplam = 0;
				//int sayi0 = 0;
				while( true ){
					//int sayi0 = 0;
					System.out.println("Sayı giriniz (bitirmek ve çıkmak için 0 giriniz)");
					int sayi1 = input.nextInt();
					if (sayi1 == 0){
					break;
					}
				 toplam = sayi1 + sayi0;
				 sayi0 = toplam;	 
				
				}
				System.out.println("Girdiğiniz sayıların toplamı: " + toplam  + " dır");
				
			}
			else if(islem.equalsIgnoreCase("cikarma")) {
				int sayi2 = 0;
				while( true ){
					//int sayi0 = 0;
					int sayi1 = input.nextInt();
						if (sayi1 == 0){
						break;
						}
					int cikti = sayi1 - sayi2;
					sayi2 = cikti;	 
					System.out.println("Girdiğiniz sayıların cıktısı: " + cikti + " dır" );
					
						
				}
				
			}
			else if (islem.equalsIgnoreCase("carpma")){
				//int sayi3 = 1;
				while( true ){
					//int sayi0 = 1;
					int sayi1 = input.nextInt();
						if (sayi1 == 0){
						break;
						}
					int carpim = sayi1 * sayi3;
					sayi3 = carpim;	 
					System.out.println("Girdiğiniz sayıların carpimi: " + carpim + " dır" );
				}
				
			}
			else {
				double sayi4 = 1;
				while( true ){
					System.out.println("önce bölen sonra bölünen giriniz");
					double sayi1 = input.nextInt();
						if (sayi1 == 0){
						break;
						}
					double bolum = sayi1 / sayi4;
					sayi4 = bolum;	 
					System.out.println("Girdiğiniz sayıların bolumu: " + bolum + " dır" );
				}	
			}
		}	
	}		
}
