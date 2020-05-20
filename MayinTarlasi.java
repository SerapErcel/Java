import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Oynamak istediğin tarlanın en ve boy değerlerini sırasıyla gir:");
		int en=s.nextInt();
		int boy=s.nextInt();
		int [][] matris =new int [en][boy];
		int [][] kontrolmatrisi =new int [en][boy];
		int puan=0;
		for(int i=0;i<en;i++) {
			for(int j=0;j<boy;j++) {
				Random r=new Random();
				int sayi=r.nextInt(2);
				matris[i][j]=sayi;
			}
		}
		for(int i=0;i<en;i++) {
			for(int j=0;j<boy;j++) {
				kontrolmatrisi[i][j]=0;
			}
		}
		System.out.println("İşte tarlanın haritası dikkatli ol ve en yuksek puanı topla!");
		for(int i=0;i<en;i++) {
			for(int j=0;j<boy;j++) {
				System.out.print(" "+i+""+j);
			}System.out.println();
		}
		do {
			try {
				System.out.println("Sirasiyla seçtiğin adresin x ve y kordinatlarını gir:");
				int kordinatx=s.nextInt();
				int kordinaty=s.nextInt();
				if(matris[kordinatx][kordinaty]==1) {
					System.out.println("Mayına bastın :( Puanın: "+puan);
					break;
				}
				else if(kontrolmatrisi[kordinatx][kordinaty]==0){
					System.out.println("Harika hayattasın hadi devam edelim..");
					puan=puan+10;
					kontrolmatrisi[kordinatx][kordinaty]=1;
				}
				else {
					System.out.println("Daha önce oraya gitmiştin. ");
				}
			}catch(Exception e) {
				System.out.println("kordinatların tarla içinen olmalı :) yeniden dene\n");
			}
		}while(true);
	}

}
