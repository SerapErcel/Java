import java.util.ArrayList;
import java.util.Scanner;

public class Anagram_Kelime {

	public static void main(String[] args) {
		//kullanýcýdan karþýlaþtýrýlacak kelimeleri alýyoruz
		Scanner s= new Scanner(System.in);
		System.out.println("Kelimelerinizi küçük harflerle giriniz!!!\nÝlk kelimeyi giriniz.");
		String kelime1=s.next();
		System.out.println("Ýkinci kelimeyi giriniz.");
		String kelime2=s.next();
		
		//kelimeleri harf harf karþýlaþtýracaðýmýz için ilk kelimeyi karakter dizisine atýyoruz
		char[] karakterDizisi= new char[kelime1.length()];
		karakterDizisi=kelime1.toCharArray();
		//ikinci kelimeyi ise arrayListe dönüþtürüyoruz
		//karþýlaþtýrýlan harfi tekrar kullanmamak için silmemiz gerekir bu nedenle diziye deðil listeye atadýk
		//örneðin uyku-koyu ----> koyu, uyku'daki u,y,k harflerini içermesine raðmen anagram deðildir
		ArrayList<Character> karakterListesi = listeyeDonustur(kelime2);//listeyeDonustur metodu cagirildi
		
		if(kelime1.length()==kelime2.length()) {//uzunluklar farklý ise anagram deðildir
			boolean bulunma=false;
			for(int i=0;i<karakterDizisi.length;i++) {//ilk kelimenin harfleri sýrayla alýnýr
				for(int j=0;j<karakterListesi.size();j++) {
					//karakterDizisinden(kelime1) alýnan harf karakterListesindeki(kelime2) bütün harflerle karþýlaþtýrýlýr
					if(karakterDizisi[i]==karakterListesi.get(j)) {
						System.out.printf("Ortak bir eleman var.-->%s\n",karakterListesi.get(j));
						/*
						 * ortak harf bulununca bulunma deðiþkeni true olarak deðiþtirilir
						 * kelime2'den j. indeksteki harf silinir. kelime2'de aranan harf bulunduðu için 
						 * diðer harflerle karþýlaþtýrmaya gerek olmadýðýndan break ile içteki for döngüsünden çýkýlýr
						 */
						bulunma=true;
						karakterListesi.remove(j);
						break;
					}else//harfler ayný deðilse bulunma deðiþkenine false atanýr
						bulunma=false;
				}
				/*
				 * kelime1'deki harfler kontrol edilirken herhangi bir harfte bulunma deðiþkeni false olursa
				 * diðer harfleri kontrol etmeye gerek yoktur kelimeler anagram deðildir. break ile dýþtaki
				 * for döngüsünden çýkýlýr
				 */
				if(bulunma==false) {
					System.out.println("Kelimeler ANAGRAM DEÐÝLDÝR!");
					break;
				}
			}	
		//bütün karþýlaþtýrmalar yapýldýktan sonra bulunma deðiþkeni true ise kelimeler anagramdýr
		if(bulunma==true)
			System.out.printf("%s ve %s kelimeleri ANAGRAMDIR!",kelime1,kelime2 );
	
		}
	}

	//string tipinde bir kelime parametresi alarak karakter listesi döndürecek bir metod tanýmlýyoruz
	public static ArrayList<Character> listeyeDonustur(String kelime) {
		ArrayList<Character> karakterListesi = new ArrayList<Character>(); 
    	for(int i = 0; i<kelime.length();i++){
    		karakterListesi.add(kelime.charAt(i));//kelime parametresinin harflerini tek tek karakter listesine atýyoruz
    	}
    	return karakterListesi;
	}
}