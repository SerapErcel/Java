import java.util.Scanner;

public class Calismasorular�2 {
	//metod tan�ml�yoruz
	public static void diziYaz(char dizi[]) {// parametre olarak char tipinde bir dizi alan metod
		//dizinin boyuna ula��ncaya kadar, dizi elemanlar�n� aralar�nda bir bo�luk ile ekrana yazacak d�ng�
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Metni giriniz:");
		//klavyeden metin al�yoruz
		String metin=s.nextLine();
		
		//klavyeden girilen metnin uzunlu�unda bo� karakter dizisi olu�turuyoruz
		char dizi[]=new char[metin.length()];
		
		for(int i=0; i<metin.length();i++) {
			/* string de�i�kenin charAt metoduna karakterini almak istedi�imiz indexi g�ndererek
			 * karakter okuyoruz. Okunan karakteri bo� dizinin i. indexine at�yoruz.
			 */
			dizi[i]=metin.charAt(i);
		}
		diziYaz(dizi);
	}

}
