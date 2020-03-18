//-----------try/catch ile 0'a b�lme hatas�--------------------------
public class Exception_Handling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		//hata olabilecek try blo�u
		try {
			c=a/b;
			System.out.println("Sonuc: "+c);
		}
		//hata bulunca program� durdurmadan kullan�c�y� uyaracak catch blo�u
		catch(ArithmeticException ae){
			//hata tipini Exception olarak tan�mlarsak b�t�n hata tiplerini kapsam�� oluruz
			System.out.println("Bir hata ile kar��la��ld�:  "+ae.toString());
			/* hata mesaj�n�n ilk k�sm� hatan�n tipi ikinci k�sm� ise neden kaynakland���d�r
			 * burada hatan�n tipi ArithmeticException'd�r
			 * hatan�n neden kaynakland��� ise ae nesnesinin i�erisinde sakl�d�r.
			 * ae nesnesini ae.toString()ile ekrana yazd�rarak sebebi ��reniriz.
			 */
		}

	}

}
