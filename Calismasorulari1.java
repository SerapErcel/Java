
public class Calismasorulari1 {
	//metod tan�ml�yoruz
	public static void diziYaz(int dizi[]) {// int tipinde diziyi parametre olarak g�nderiyoruz
		// dizi boyutuna ula��ncaya kadar her bir eleman� ekrana yazd�r�yoruz
		for(int i=0 ; i<dizi.length ; i++) {
			System.out.print(dizi[i]+" ");
		}
	}
	public static void main(String args[]) {
		int dizi[]=new int [10] ; //10 elemanl� bo� dizi olu�turuldu
		
		int sayi=100;
		//dizi elemanlar�n� for d�ng�s�nde sayidan 10 eksilterek ekliyoruz
		for(int i=0 ; i<10 ; i++) {
			dizi[i]=sayi;
			sayi=sayi-10;
		}
		//diziyi parametre olarak verdi�imiz metodu �a��r�yoruz
		diziYaz(dizi);
		
	}

}
