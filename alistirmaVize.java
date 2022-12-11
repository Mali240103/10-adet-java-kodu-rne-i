import java.util.Scanner;
public class alistirmaVize{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Yapmak istediğiniz işlemi seçiniz(1 kosinüs, \n  2 sinüs, \n  3 radyana cevirme, \n  4 e li ifade, \n 5 logaritma, \n 6 üslü ifade , \n 7 köklü ifadeler)");
		int casesec = input.nextInt();
		switch ( casesec ){
			case 1 : 
				System.out.println("cos deger gir");
				double CosDeger = input.nextDouble();
				//Math.cos(CosDeger);
				System.out.println(Math.cos(CosDeger));
				break;
			case 2 :
				System.out.println("sin deger gir");
				double SinDeger = input.nextDouble();
				//Math.sin(SinDeger);
				System.out.println(Math.sin(SinDeger));
				break;
			case 3 :
				System.out.println("radyanlı");
				double radyanli = input.nextDouble();
				//Math.radians(radyanli);
				System.out.println(Math.toRadians(radyanli));
				break;
			case 4 : 
				System.out.println("e li");
				double elisayi = input.nextDouble();
				//Math.exp(elisayi);
				System.out.println(Math.exp(elisayi));
				break;
			case 5 : 
				System.out.println("logar");
				double logar = input.nextDouble();
				//Math.log(logar);
				System.out.println(Math.log(logar));
				break;
			case 6 :
				System.out.println("uslu");
				double uslu = input.nextDouble();
				//Math.pow(uslu , uslu);
				System.out.println(Math.pow(uslu , uslu));
				break;
			case 7 :
				System.out.println("koklu");
				double koklu = input.nextDouble();
				System.out.println(Math.sqrt(koklu));
				break;
			case 8 :
				System.out.println("yeto kanka sigara molası");
				break;
			default :
				System.out.println("malsın");
		
		}
	}
}