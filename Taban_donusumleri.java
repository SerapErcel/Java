import java.util.Scanner;

public class Taban_donusumleri {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("10'luk tabanda bir sayi giriniz..");
		int sayi=s.nextInt();
		String sonuc="";
		int kalan;
		if(sayi%2==1) {
			while(sayi>0) {
				kalan=sayi%2;
				sayi=sayi/2;
				sonuc=kalan+sonuc;
			}
			System.out.println("Girdiginiz sayi tektir. 2'lik tabanda yazilisi: "+sonuc);
		}
		else {
			while(sayi>0) {
				kalan=sayi%8;
				sayi=sayi/8;
				sonuc=kalan+sonuc;
			}
			System.out.println("Girdiginiz sayi cifttir. 8'lik tabanda yazilisi: "+sonuc);

		}
	}

}
