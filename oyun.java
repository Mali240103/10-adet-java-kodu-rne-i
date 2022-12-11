	import java.util.Scanner;
	import java.util.Random;
	import javax.swing.JOptionPane;

public class oyun
{
	public static void main(String [] args)
	{
	 /*kullanıcı adı alıp yazdırmayı dene*/
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
//String user = new String();
		String username= JOptionPane.showInputDialog("Kullanıcı Adını Girin:");
		
			System.out.println("Sayı tahmin oyununa hoşgeldin!!	"	+	 username  	+	"\n Lütfen bir zorluk seviyesi seç \n zorluk 1; 0-100 sayı, \t zorluk 2;  0-500 sayı, \t zorluk 3; 0-1000 sayı. \n 1 \t 2 \t 3");
		byte s1 = input.nextByte();
		
		/*sayi = sayi1;
		sayi1 = sayi2;
		sayi2 = sayi3;
		*/
		
		if(s1 == 1){
			int sayi1 = rnd.nextInt(101);
			System.out.println("1. Zorluk seviyesini seçtin. Tahmin etmen gereken sayı 0-100 arasında.");
			int	tahmin = input.nextInt(); 
				while(sayi1 != tahmin) {
					if (tahmin < 0 || tahmin > 101){
						System.out.println("Biraz daha çaba göster 	"	+	 username  	+	" bu yakın bile değildi.");
					}
					else if(tahmin < sayi1 ) {
						System.out.println(" İPUCU !!! \n Bundan daha büyük bir değer girmen gerek .");} 
					else {System.out.println("İPUCU !!! \n Bundan daha küçük bir değer girmen gerek ");}
					
				tahmin = input.nextInt();}}
				
		else if ( s1 == 2){
				int sayi2 = rnd.nextInt(501);
				
				System.out.println("2. Zorluk seviyesini seçtin. Tahmin etmen gereken sayı 0-500 arasında.");
				
				int	tahmin = input.nextInt();
				
					while(sayi2 != tahmin) {
					   if (tahmin < 0 || tahmin > 501)
						{System.out.println("Biraz daha çaba göster 	"	+	 username  	+	" bu yakın bile değildi.");}
						else if(tahmin < sayi2 ) {System.out.println(" İPUCU !!! \n Bundan daha büyük bir değer girmen gerek .");} 
					else {System.out.println("İPUCU !!! \n Bundan daha küçük bir değer girmen gerek ");}
					
						tahmin = input.nextInt();}
					}	
				else { int sayi3 = rnd.nextInt(1001);
				System.out.println("3. Zorluk seviyesini seçtin. Tahmin etmen gereken sayı 0-1000 arasında.");
				int	tahmin = input.nextInt(); 
			//int	tahmin = input.nextInt(); 
			/*while(sayi1 != tahmin) {
					if (tahmin < 0 || tahmin > 101){
						System.out.println("Biraz daha çaba göster dostum bu yakın bile değildi.");
					}*/
					while(sayi3 != tahmin) {
						if (tahmin < 0 || tahmin > 1001)
						{System.out.println("Biraz daha çaba göster	"	+	 username  	+	" bu yakın bile değildi.");
						}
							else if(tahmin < sayi3 ) {System.out.println(" İPUCU !!! \n Bundan daha büyük bir değer girmen gerek .");} 
							else {System.out.println("İPUCU !!! \n Bundan daha küçük bir değer girmen gerek ");
							}
								tahmin = input.nextInt();
							
					}
			    }
		  
			//int	tahmin = input.nextInt(); 
			/*while(sayi != tahmin) {
					if (tahmin < 0 || tahmin > 1001)
					{System.out.println("Biraz daha çaba göster dostum bu yakın bile değildi.");}
					else {if(tahmin < sayi ) {System.out.println(" İPUCU !!! \n Bundan daha büyük bir değer girmen gerek .");} 
						else {System.out.println("İPUCU !!! \n Bundan daha küçük bir değer girmen gerek ");}
							 tahmin = input.nextInt(); }
			}*/System.out.println("Tebrikler!! Kazandın. \n \n Oynadığın için teşekkürler	"	+	 username  	+	" umarım beğenmişsindir. ");			  

	}
}
	