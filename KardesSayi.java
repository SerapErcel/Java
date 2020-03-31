import java.util.Arrays;
import java.util.Scanner;

public class KardesSayi {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int sayi=s.nextInt();
		int sayiyedek=sayi;
		int basamak=0;
		String [] rakamlar=new String[3];
		while(sayiyedek>0) {
			rakamlar[basamak]=String.valueOf(sayiyedek%10);
			sayiyedek=sayiyedek/10;
			basamak++;
		}
		int [] kardesler =new int [basamak];
		switch(basamak) {
		case 1:
			kardesler[0]=sayi;
			break;
		case 2:
			kardesler[0]=sayi;
			kardesler[1]=Integer.valueOf(rakamlar[0]+rakamlar[1]);
			break;
		case 3:
			kardesler[0]=sayi;
			kardesler[1]=Integer.valueOf(rakamlar[0]+rakamlar[1]+rakamlar[2]);
			kardesler[2]=Integer.valueOf(rakamlar[1]+rakamlar[0]+rakamlar[2]);
			break;
		default:
			System.out.println("Geçersiz iþlem!");
			break;
		}
		Arrays.sort(kardesler);
		System.out.println("Sayiniz:"+sayi+" En büyük kardeþ sayisi: "+kardesler[basamak-1]);
		for(int i: kardesler)
			System.out.println(i);
	}

}
