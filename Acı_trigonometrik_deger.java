//Girilen derece cinsinden a��n�n trigonometrik de�erlerini bulma
import java.util.Scanner;
public class Ac�_trigonometrik_deger {
	public static void main(String args[]) {
		System.out.println("0-180 aras�nda bir a�� giriniz:");
		Scanner s=new Scanner(System.in);
		int aci=s.nextInt();
		int radyan_degeri= (int) Math.toRadians(aci);
		int sin_degeri= (int) Math.sin(radyan_degeri);
		int cos_degeri=(int) Math.cos(radyan_degeri);
		System.out.println("Girilen a��n�n radyan de�eri ="+radyan_degeri);
		System.out.println("sin"+aci+"="+sin_degeri);
		System.out.println("cos"+aci+"="+cos_degeri);
		//System.out.println("tan"+aci+"="+sin_degeri/cos_degeri);
	//	System.out.println("cot"+aci+"="+cos_degeri/sin_degeri);
	}

}