import java.util.Scanner;
/*
 *  16 nýn 5 modu alinacak olsun
 *  16%5=1
 *  16-5=11
 *  11-5=6
 *  6-5=1
 *  
 */
public class recursiveMod {
	public static int modAl(int sayi1, int sayi2) {
		while(sayi1>sayi2) {
			sayi1=sayi1-sayi2;
			return modAl(sayi1,sayi2);
		}
		return sayi1;
		
		
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1. sayiyi giriniz.");
		int sayi1=scan.nextInt();
		System.out.println("2. sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println(modAl(sayi1,sayi2));
		
	}

}
