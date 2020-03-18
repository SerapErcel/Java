import java.util.Random;//random sýnýfýný kullanabilmek için import ettik
import java.util.Scanner;//kullanýcýdan girdi alabilmek için import ettik
public class SayiTahminOyunu {
	public static void main(String args[]) {
		Random r=new Random();//random sýnýfýndan r adýnda nesne oluþturduk
		int sayi=r.nextInt(10);//0 ile 10 arasýnda bir sayi türettik
		int tahmin_sayisi=0;//kullanýcýnýn kaç tahmin yaptýðýný tutacak bir deðiþken tanýmladýk
		System.out.println("0 ile 10 arasýnda 1. tahmininizi girin:");
		while (true){//doðru tahmini yapana kadar dönecek bir döngü tanýmladýk
			Scanner s=new Scanner(System.in);
			int tahmin=s.nextInt();//Scanner ile kullanýcýdan sayý aldýk
			tahmin_sayisi++;
			if(tahmin==sayi) {
				System.out.println(tahmin_sayisi+". tahminde bildiniz. Sayi:"+tahmin+" >>>TEBRÝKLER<<<");
				break;//doðru tahmin girilince while döngüsünü kýrarak çýktýk
			}
			else if(tahmin<sayi) {//tahmin ve sayiyi karþýlaþtýrýp buyuk ya da kucuk girilmesini istiyoruz
				System.out.println(tahmin_sayisi+1+". tahmininiz yanlýþ! Daha büyük bir sayý giriniz:");
			}
			else {
				System.out.println(tahmin_sayisi+1+". tahmininiz yanlýþ! Daha küçük bir sayý girin:");
			}
		}
	}

}
