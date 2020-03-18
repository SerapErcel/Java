//-----------try/catch ile 0'a bölme hatasý--------------------------
public class Exception_Handling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		//hata olabilecek try bloðu
		try {
			c=a/b;
			System.out.println("Sonuc: "+c);
		}
		//hata bulunca programý durdurmadan kullanýcýyý uyaracak catch bloðu
		catch(ArithmeticException ae){
			//hata tipini Exception olarak tanýmlarsak bütün hata tiplerini kapsamýþ oluruz
			System.out.println("Bir hata ile karþýlaþýldý:  "+ae.toString());
			/* hata mesajýnýn ilk kýsmý hatanýn tipi ikinci kýsmý ise neden kaynaklandýðýdýr
			 * burada hatanýn tipi ArithmeticException'dýr
			 * hatanýn neden kaynaklandýðý ise ae nesnesinin içerisinde saklýdýr.
			 * ae nesnesini ae.toString()ile ekrana yazdýrarak sebebi öðreniriz.
			 */
		}

	}

}
