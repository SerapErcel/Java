import java.util.Scanner;

public class sayiyiYaziyaCevir {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Yaziya d�n��t�rmek istedi�iniz 4 basamakl� say�y� giriniz:");
			int sayi=s.nextInt();
			if(sayi>999 && sayi<10000) {
				int binler,yuzler,onlar,birler;
				birler=sayi%10;
				sayi=sayi/10;
				onlar=sayi%10;
				sayi=sayi/10;
				yuzler=sayi%10;
				sayi=sayi/10;
				binler=sayi%10;
				String yazi="";
				String[] array1= {"","","iki","uc","d�rt","be�","alt�","yedi","sekiz","dokuz"};
				String[] array2= {"","on","yirmi","otuz","k�rk","elli","altm��","yetmi�","seksen","doksan"};
				if(yuzler!=0) 
					yazi+=array1[binler]+" "+"bin "+array1[yuzler]+" "+"y�z "+array2[onlar]+" "+array1[birler];
				else
					yazi+=array1[binler]+" "+"bin "+array2[onlar]+" "+array1[birler];
				if(birler==1)
					yazi+="bir";
				System.out.println("Sayiniz: "+yazi);
				break;
			}
			else
				System.out.println("L�tfen 4 basamakl� bir sayi giriniz:");
		}while(true);
	}

}
