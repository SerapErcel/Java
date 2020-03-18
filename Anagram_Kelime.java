import java.util.ArrayList;
import java.util.Scanner;

public class Anagram_Kelime {

	public static void main(String[] args) {
		//kullan�c�dan kar��la�t�r�lacak kelimeleri al�yoruz
		Scanner s= new Scanner(System.in);
		System.out.println("Kelimelerinizi k���k harflerle giriniz!!!\n�lk kelimeyi giriniz.");
		String kelime1=s.next();
		System.out.println("�kinci kelimeyi giriniz.");
		String kelime2=s.next();
		
		//kelimeleri harf harf kar��la�t�raca��m�z i�in ilk kelimeyi karakter dizisine at�yoruz
		char[] karakterDizisi= new char[kelime1.length()];
		karakterDizisi=kelime1.toCharArray();
		//ikinci kelimeyi ise arrayListe d�n��t�r�yoruz
		//kar��la�t�r�lan harfi tekrar kullanmamak i�in silmemiz gerekir bu nedenle diziye de�il listeye atad�k
		//�rne�in uyku-koyu ----> koyu, uyku'daki u,y,k harflerini i�ermesine ra�men anagram de�ildir
		ArrayList<Character> karakterListesi = listeyeDonustur(kelime2);//listeyeDonustur metodu cagirildi
		
		if(kelime1.length()==kelime2.length()) {//uzunluklar farkl� ise anagram de�ildir
			boolean bulunma=false;
			for(int i=0;i<karakterDizisi.length;i++) {//ilk kelimenin harfleri s�rayla al�n�r
				for(int j=0;j<karakterListesi.size();j++) {
					//karakterDizisinden(kelime1) al�nan harf karakterListesindeki(kelime2) b�t�n harflerle kar��la�t�r�l�r
					if(karakterDizisi[i]==karakterListesi.get(j)) {
						System.out.printf("Ortak bir eleman var.-->%s\n",karakterListesi.get(j));
						/*
						 * ortak harf bulununca bulunma de�i�keni true olarak de�i�tirilir
						 * kelime2'den j. indeksteki harf silinir. kelime2'de aranan harf bulundu�u i�in 
						 * di�er harflerle kar��la�t�rmaya gerek olmad���ndan break ile i�teki for d�ng�s�nden ��k�l�r
						 */
						bulunma=true;
						karakterListesi.remove(j);
						break;
					}else//harfler ayn� de�ilse bulunma de�i�kenine false atan�r
						bulunma=false;
				}
				/*
				 * kelime1'deki harfler kontrol edilirken herhangi bir harfte bulunma de�i�keni false olursa
				 * di�er harfleri kontrol etmeye gerek yoktur kelimeler anagram de�ildir. break ile d��taki
				 * for d�ng�s�nden ��k�l�r
				 */
				if(bulunma==false) {
					System.out.println("Kelimeler ANAGRAM DE��LD�R!");
					break;
				}
			}	
		//b�t�n kar��la�t�rmalar yap�ld�ktan sonra bulunma de�i�keni true ise kelimeler anagramd�r
		if(bulunma==true)
			System.out.printf("%s ve %s kelimeleri ANAGRAMDIR!",kelime1,kelime2 );
	
		}
	}

	//string tipinde bir kelime parametresi alarak karakter listesi d�nd�recek bir metod tan�ml�yoruz
	public static ArrayList<Character> listeyeDonustur(String kelime) {
		ArrayList<Character> karakterListesi = new ArrayList<Character>(); 
    	for(int i = 0; i<kelime.length();i++){
    		karakterListesi.add(kelime.charAt(i));//kelime parametresinin harflerini tek tek karakter listesine at�yoruz
    	}
    	return karakterListesi;
	}
}