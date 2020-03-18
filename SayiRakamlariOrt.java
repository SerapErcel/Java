import java.util.Scanner;

public class SayiRakamlariOrt {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("Rakamlarinin ortalamas�n� almak istediginiz sayiyi giriniz: ");
		int sayi=s.nextInt();
		
		int rakam;
		double ortalama;

		if(sayi%2==1) {
			double carpim=1;
			double basamakSayisi=0;
			while(sayi>0) {
				rakam=sayi%10;
				sayi=sayi/10;
				if(rakam!=0) {
					basamakSayisi=basamakSayisi+1;
					carpim=carpim*rakam;
				}
									
			}
			ortalama=Math.pow(carpim,(1.0/basamakSayisi));
			System.out.println("Girdiginiz sayi, tek sayidir. Rakamlar�n�n geometrik ortalamas�: "+ortalama);
		}
		else {
			double toplam=0;
			double basamakSayisi=0;
			while(sayi>0) {
				rakam=sayi%10;
				sayi=sayi/10;
				basamakSayisi++;
				toplam=toplam+rakam;				
			}
			ortalama=toplam/basamakSayisi;
			System.out.println("Girdiginiz sayi, cift sayidir. Rakamlar�n�n aritmetik ortalamas�: "+ortalama);
		}
	}

}
