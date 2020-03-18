import java.util.Scanner;
/*
 		  *
 		 ***
 		*****
 */
public class yildizlarlaUcgen {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Yukseklik giriniz:");
		int yukseklik=s.nextInt();
		for(int i=1;i<=yukseklik;i++) {
			for(int j=1;j<=(yukseklik-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k=k+1) {
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
}
