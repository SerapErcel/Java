import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SesliHarfleriSil {
	public static void main(String args[]) {
		//Kullanicidan metni aliyoruz
		Scanner scan=new Scanner(System.in);
		System.out.println("Metni giriniz: ");
		String s=scan.nextLine();
		
		//metni atayacagimiz listeyi olusturuyoruz
		List<Character> arrList = new ArrayList<Character>();
		
		//Sesli harfler listesi olusturuyoruz ve horfleri listeye ekliyoruz.
		List<Character> sesliList = new ArrayList<Character>();
		sesliList.add('a');
		sesliList.add('e');
		sesliList.add('ý');
		sesliList.add('i');
		sesliList.add('o');
		sesliList.add('ö');
		sesliList.add('u');
		sesliList.add('ü');
		sesliList.add('A');
		sesliList.add('E');
		sesliList.add('I');
		sesliList.add('Ý');
		sesliList.add('O');
		sesliList.add('Ö');
		sesliList.add('U');
		sesliList.add('Ü');
		
		//Kullanicidan alinan metni arrayListe aktariyoruz
		for(int i=0;i<s.length();i++) {
			arrList.add(s.charAt(i));
		}
		
		//arrList icinden bütün sesliListi siliyoruz
		arrList.removeAll(sesliList);
		//arrList forEach metodu ile ekrana yazýyoruz
		arrList.forEach((n) -> System.out.println(n));
		
		
	}

}
