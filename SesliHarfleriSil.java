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
		sesliList.add('�');
		sesliList.add('i');
		sesliList.add('o');
		sesliList.add('�');
		sesliList.add('u');
		sesliList.add('�');
		sesliList.add('A');
		sesliList.add('E');
		sesliList.add('I');
		sesliList.add('�');
		sesliList.add('O');
		sesliList.add('�');
		sesliList.add('U');
		sesliList.add('�');
		
		//Kullanicidan alinan metni arrayListe aktariyoruz
		for(int i=0;i<s.length();i++) {
			arrList.add(s.charAt(i));
		}
		
		//arrList icinden b�t�n sesliListi siliyoruz
		arrList.removeAll(sesliList);
		//arrList forEach metodu ile ekrana yaz�yoruz
		arrList.forEach((n) -> System.out.println(n));
		
		
	}

}
