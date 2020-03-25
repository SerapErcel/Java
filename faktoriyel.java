import java.util.Scanner;

public class faktoriyel {
	public static int faktoriyelbul(int sayi) {
		int sonuc=1;
		while(sayi>1) {
			sonuc=sonuc*sayi;
			sayi--;
		}
		return sonuc;
	}
	public static void  main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("faktoriyelini bulmak istediðiniz sayiyi giriniz:");
		int sayi=s.nextInt();
		System.out.println("sonuc: "+faktoriyelbul(sayi));
	}

}
