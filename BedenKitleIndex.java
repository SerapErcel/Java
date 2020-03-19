import java.util.Scanner;

public class BedenKitleIndex {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Vücut aðýrlýðýnýzý kilogram cinsinden giriniz:");
		int kg=s.nextInt();
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		double boy=s.nextDouble();
		double bki=kg/(Math.pow(boy,2));
		if(bki<=18.50)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Zayýfsýnýz.");
		else if(bki>18.50 && bki<=24.99)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Saðlýklý kilodasýnýz.");
		else if(bki>24.99 && bki<=29.99)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Aþýrý kilolusunuz.");
		else
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Obez sýnýfýndasýnýz.");

	}

}
