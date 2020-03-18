//-------------------throws ve try/catch ile hata kontrol�----------------------------
public class Throws{
	public void metod1() throws Exception{
		/* metod isminin yan�na throws ard�ndan da olu�abilecek hata tipini yazd�k
		 * yani bir hata olu�ursa hatay� bir �st medoda yani bizi �a��ran metoda aktar
		 */
		int dizi[]=new int[] {1,2,3};
		System.out.println("Buras� metod1'dir!");
		System.out.println(dizi[3]);//hata verecek k�s�m
	}
	public void metod1Cagir() {
		System.out.println("Buras� metod1'i �a��r�r!");
		try {
			metod1();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("metod1 �a��r�ld�");
	}
	public static void main(String[] args) {
		Throws t=new Throws();
		t.metod1Cagir();
		System.out.println("metod1Cagir() metodu �a��r�ld�");
	}

}
