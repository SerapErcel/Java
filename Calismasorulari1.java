
public class Calismasorulari1 {
	//metod tanýmlýyoruz
	public static void diziYaz(int dizi[]) {// int tipinde diziyi parametre olarak gönderiyoruz
		// dizi boyutuna ulaþýncaya kadar her bir elemaný ekrana yazdýrýyoruz
		for(int i=0 ; i<dizi.length ; i++) {
			System.out.print(dizi[i]+" ");
		}
	}
	public static void main(String args[]) {
		int dizi[]=new int [10] ; //10 elemanlý boþ dizi oluþturuldu
		
		int sayi=100;
		//dizi elemanlarýný for döngüsünde sayidan 10 eksilterek ekliyoruz
		for(int i=0 ; i<10 ; i++) {
			dizi[i]=sayi;
			sayi=sayi-10;
		}
		//diziyi parametre olarak verdiðimiz metodu çaðýrýyoruz
		diziYaz(dizi);
		
	}

}
