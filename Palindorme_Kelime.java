import java.util.Scanner;

/*-----------------------PALÝNDORME KELÝME-----------------------------
 * Palindorme; baþtan ve sondan yazýlýþlarý ayný olan metinlerdir. 
 * Örneðin; "KABAK" 
 */
public class Palindorme_Kelime {
	public static void main(String args[]) {
		System.out.println("Bir kelime giriniz");
		Scanner s=new Scanner(System.in);
		String kelime=s.next();
		int uzunluk=kelime.length();
		char[] kelime_dizini=kelime.toCharArray();
		for(int i=0; i<=uzunluk/2 ;i++) {
			if( kelime_dizini[i]!=kelime_dizini[uzunluk-1-i]) {
				System.out.println(kelime+" kelimesi palindorme deðildir.");
				break;
			}
			else{
				System.out.println(kelime.toUpperCase()+" kelimesi palindormedir.");
				//break;
			}
		}
		
	}
}