import java.util.Scanner;

public class Calismasorularý2 {
	//metod tanýmlýyoruz
	public static void diziYaz(char dizi[]) {// parametre olarak char tipinde bir dizi alan metod
		//dizinin boyuna ulaþýncaya kadar, dizi elemanlarýný aralarýnda bir boþluk ile ekrana yazacak döngü
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Metni giriniz:");
		//klavyeden metin alýyoruz
		String metin=s.nextLine();
		
		//klavyeden girilen metnin uzunluðunda boþ karakter dizisi oluþturuyoruz
		char dizi[]=new char[metin.length()];
		
		for(int i=0; i<metin.length();i++) {
			/* string deðiþkenin charAt metoduna karakterini almak istediðimiz indexi göndererek
			 * karakter okuyoruz. Okunan karakteri boþ dizinin i. indexine atýyoruz.
			 */
			dizi[i]=metin.charAt(i);
		}
		diziYaz(dizi);
	}

}
