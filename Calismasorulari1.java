
public class Calismasorulari1 {
	//metod tanımlıyoruz
	public static void diziYaz(int dizi[]) {// int tipinde diziyi parametre olarak gönderiyoruz
		// dizi boyutuna ulaşıncaya kadar her bir elemanı ekrana yazdırıyoruz
		for(int i=0 ; i<dizi.length ; i++) {
			System.out.print(dizi[i]+" ");
		}
	}
	public static void main(String args[]) {
		int dizi[]=new int [10] ; //10 elemanlı boş dizi oluşturuldu
		
		int sayi=100;
		//dizi elemanlarını for döngüsünde sayidan 10 eksilterek ekliyoruz
		for(int i=0 ; i<10 ; i++) {
			dizi[i]=sayi;
			sayi=sayi-10;
		}
		//diziyi parametre olarak verdiğimiz metodu çağırıyoruz
		diziYaz(dizi);
		
	}

}
