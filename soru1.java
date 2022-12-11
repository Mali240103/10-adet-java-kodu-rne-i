import java.util.Scanner;
public class soru1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("önce pay,sonra payda değeri giriniz.");
		int pay = input.nextInt();
		int payda = input.nextInt();
		int i = 0;
		//mod işlemnden kalan pay kısmı olmalı, 
		if( pay > payda ){
			while( pay > payda ){
			int a = pay%payda;
			pay = pay-(payda*a);
			i = i + 1;
			//pay = -pay;
			}
			int a = pay%payda;
			System.out.println("bileşik  " + i + " tam" + a + "/" + payda );
		}
		else if( pay == payda )
			System.out.println("tamsayı");
		else 
			System.out.println("basit");
	}
}