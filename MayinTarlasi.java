import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Oynamak istedi�in tarlan�n en ve boy de�erlerini s�ras�yla gir:");
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
		System.out.println("��te tarlan�n haritas� dikkatli ol ve en yuksek puan� topla!");
		for(int i=0;i<en;i++) {
			for(int j=0;j<boy;j++) {
				System.out.print(" "+i+""+j);
			}System.out.println();
		}
		do {
			try {
				System.out.println("Se�ti�in adresin kordinatlar�n� gir:");
				int kordinatx=s.nextInt();
				int kordinaty=s.nextInt();
				if(matris[kordinatx][kordinaty]==1) {
					System.out.println("May�na bast�n :( Puan�n: "+puan);
					break;
				}
				else if(kontrolmatrisi[kordinatx][kordinaty]==0){
					System.out.println("Harika hayattas�n hadi devam edelim..");
					puan=puan+10;
					kontrolmatrisi[kordinatx][kordinaty]=1;
				}
				else {
					System.out.println("Daha �nce oraya gitmi�tin. ");
				}
			}catch(Exception e) {
				System.out.println("kordinatlar�n tarla i�inen olmal� :) yeniden dene\n");
			}
		}while(true);
	}

}
