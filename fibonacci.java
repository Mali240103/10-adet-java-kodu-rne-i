	import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	System.out.println(" \n Bu program Fibonacci dizisinin elemanlarını göstermektedir. \n \n Lütfen görmek istediğiniz dizi elemanlarının sayısını (en az 1, en fazla 92 olacak şekilde) girin.");
		Long a = input.nextLong();
		if(a >= 93)
		{	System.out.println("Girdiğiniz karakter 93'den büyük olamaz! Lütfen görmek istediğiniz dizi elemanlarının sayısını (en az 1, en fazla 92 olacak şekilde) girin.");
	    Long l = input.nextLong();
		System.out.print("1.1");
		{long z = 1, b = 1, t = 0 ; 
		
		for(int i = 2 ; i < l ; i = i+1 ){
			
			t = z + b ;
			z = b ;
			b = t ;
			System.out.print(","+t );
		}
		System.out.println("");
		}
		}
		else
		{
		if(a == 1 )
		{
		System.out.println("1");	
		}
		else
		{
		if(a == 2 )
		{
		System.out.println("1 , 1");	
		}
		else
		{
		if(a < 1 )
		{
		System.out.println("Girdiğiniz karakter 1'den küçük olamaz! Lütfen görmek istediğiniz dizi elemanlarının sayısını (en az 1, en fazla 92 olacak şekilde) girin.");
	    Long u = input.nextLong();
		System.out.print("1.1");
		{long z = 1, b = 1, t = 0 ; 
		
		for(int i = 2 ; i < u ; i = i+1 ){
			
			t = z + b ;
			z = b ;
			b = t ;
			System.out.print(","+t );
		}
		System.out.println("");
		}
		}
		else
		{
		System.out.print("1,1");
	{
		long z = 1, b = 1, t = 0;
			for(int i = 2 ; i < a ; i = i+1 )
			{
				t = z + b ;
				z = b;
				b = t ;
				System.out.print(","+ t);
			}
			System.out.println("");
		}	
		}
		}	
		}
		}
		}
		}
