import java.util.Scanner;

public class CiftTekRakamToplami {
	public static void main(String args[] ){
		Scanner s=new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz: ");
		int sayi=s.nextInt();
		int rakam;
		int tekTop = 0;
		int ciftTop=0;
		int basamak=0;
		while(sayi>0) {
			rakam=sayi%10;
			sayi=sayi/10;
			basamak++;
			if(rakam%2==1) 
				tekTop+=rakam;
			else
				ciftTop+=rakam;
		}
		int genelToplam=tekTop+ciftTop;
		int fark=tekTop-ciftTop;
		System.out.println("Girilen sayinin basamak sayisi: "+basamak+" genel toplamý: "+genelToplam);
		System.out.println("Tek rakamlar ile çift rakamlarýn toplamýnýn mutlak farký: "+Math.abs(fark));
	}

}
