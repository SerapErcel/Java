import java.util.Random;//random s�n�f�n� kullanabilmek i�in import ettik
import java.util.Scanner;//kullan�c�dan girdi alabilmek i�in import ettik
public class SayiTahminOyunu {
	public static void main(String args[]) {
		Random r=new Random();//random s�n�f�ndan r ad�nda nesne olu�turduk
		int sayi=r.nextInt(10);//0 ile 10 aras�nda bir sayi t�rettik
		int tahmin_sayisi=0;//kullan�c�n�n ka� tahmin yapt���n� tutacak bir de�i�ken tan�mlad�k
		System.out.println("0 ile 10 aras�nda 1. tahmininizi girin:");
		while (true){//do�ru tahmini yapana kadar d�necek bir d�ng� tan�mlad�k
			Scanner s=new Scanner(System.in);
			int tahmin=s.nextInt();//Scanner ile kullan�c�dan say� ald�k
			tahmin_sayisi++;
			if(tahmin==sayi) {
				System.out.println(tahmin_sayisi+". tahminde bildiniz. Sayi:"+tahmin+" >>>TEBR�KLER<<<");
				break;//do�ru tahmin girilince while d�ng�s�n� k�rarak ��kt�k
			}
			else if(tahmin<sayi) {//tahmin ve sayiyi kar��la�t�r�p buyuk ya da kucuk girilmesini istiyoruz
				System.out.println(tahmin_sayisi+1+". tahmininiz yanl��! Daha b�y�k bir say� giriniz:");
			}
			else {
				System.out.println(tahmin_sayisi+1+". tahmininiz yanl��! Daha k���k bir say� girin:");
			}
		}
	}

}
