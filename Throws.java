//-------------------throws ve try/catch ile hata kontrolü----------------------------
public class Throws{
	public void metod1() throws Exception{
		/* metod isminin yanýna throws ardýndan da oluþabilecek hata tipini yazdýk
		 * yani bir hata oluþursa hatayý bir üst medoda yani bizi çaðýran metoda aktar
		 */
		int dizi[]=new int[] {1,2,3};
		System.out.println("Burasý metod1'dir!");
		System.out.println(dizi[3]);//hata verecek kýsým
	}
	public void metod1Cagir() {
		System.out.println("Burasý metod1'i çaðýrýr!");
		try {
			metod1();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("metod1 çaðýrýldý");
	}
	public static void main(String[] args) {
		Throws t=new Throws();
		t.metod1Cagir();
		System.out.println("metod1Cagir() metodu çaðýrýldý");
	}

}
