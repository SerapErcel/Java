import java.util.Random;
public class zar_atma {
	public static void main(String args[]) {
		System.out.println("bilgisayar ve kullan�c� ad�na 3 defa zar atar b�y�k olan� atan kazan�r");
		for(int i=0;i<3;i++) {
			Random r =new Random();
			int bilgisayar=r.nextInt(5)+1;
			int kullan�c�=r.nextInt(5)+1;
			if (kullan�c�>bilgisayar) {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullan�c�+"  <<<KAZANDINIZ>>>");
			}else if(kullan�c�<bilgisayar) {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullan�c�+"  <<<KAYBETT�N�Z>>>");
			}else {
				System.out.println("bilgisayar:"+bilgisayar+" X siz:"+kullan�c�+"  <<<BERABERE>>>");
			}
			
		}
	}

}
