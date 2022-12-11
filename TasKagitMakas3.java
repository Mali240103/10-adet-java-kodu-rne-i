import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class TasKagitMakas3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		String username = JOptionPane.showInputDialog("Taş Kağıt Makas oyununa hoşgeldin!! \t Başlamadan önce lütfen kullanıcı adınızı  girin:");
		int a = 111111;
		while (a != 0){
		System.out.println("Hoşgeldin  " + username + "  hamleni yap! \n Taş(0) Kağıt(1) makas(2)");
		int playermove = input.nextInt();
		int pcmove = rnd.nextInt(3);
		//System.out.println(pcmove);
		
		switch (pcmove){
			case 0: 
			if (playermove == 0)
				System.out.println("bilgisayar taş  " + username + "  de taş oyun berabere!!");
			else if (playermove == 1)
					System.out.println("bilgisayar taş " + username + "  kağıt  " + username + " kazandı!!");
			else 
				System.out.println("bilgisayar taş  " + username + " makas, bilgisayar kazandı!!");
			break;
			
			case 1:
			if (playermove == 0)
				System.out.println("bilgisayar kağıt  " + username + "  taş, bilgisayar kazandı!!");
			else if (playermove == 1)
					System.out.println("bilgisayar kağıt  " + username + "  de kağıt oyun berabere!!");
			else 
				System.out.println("bilgisayar kağıt  " + username + "  makas " + username + " kazandı!!");
			break;
			
			case 2:
			if (playermove == 0)
				System.out.println("bilgisayar makas  , " + username + "  taş, " + username + "  kazandı!!");
			else if (playermove == 1)
					System.out.println("bilgisayar makas , " + username + "  kağıt, bilgisayar kazandı!!");
			else 
				System.out.println("bilgisayar makas , " + username + "  makas, oyun berabere!!");
			break;
			default:
			System.out.println("we have lost dancing");
		
		}
		System.out.println(" \n \n ");
		}	
	}
}