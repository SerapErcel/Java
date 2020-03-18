import java.util.Random;
public class zar_atma {
	public static void main(String args[]) {
		System.out.println("bilgisayar ve kullanýcý adýna 3 defa zar atar büyük olaný atan kazanýr");
		for(int i=0;i<3;i++) {
			Random r =new Random();
			int bilgisayar=r.nextInt(5)+1;
			int kullanýcý=r.nextInt(5)+1;
			if (kullanýcý>bilgisayar) {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullanýcý+"  <<<KAZANDINIZ>>>");
			}else if(kullanýcý<bilgisayar) {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullanýcý+"  <<<KAYBETTÝNÝZ>>>");
			}else {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullanýcý+"  <<<BERABERE>>>");
			}
			
		}
	}

}
