import java.util.Scanner;

public class BedenKitleIndex {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("V�cut a��rl���n�z� kilogram cinsinden giriniz:");
		int kg=s.nextInt();
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		double boy=s.nextDouble();
		double bki=kg/(Math.pow(boy,2));
		if(bki<=18.50)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Zay�fs�n�z.");
		else if(bki>18.50 && bki<=24.99)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Sa�l�kl� kilodas�n�z.");
		else if(bki>24.99 && bki<=29.99)
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" A��r� kilolusunuz.");
		else
			System.out.println("Beden kitle indeksiniz: "+(int)bki+" Obez s�n�f�ndas�n�z.");

	}

}
