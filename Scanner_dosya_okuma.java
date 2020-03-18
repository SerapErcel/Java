//----------------------SCANNER SINIFI ÝLE DOSYA OKUMA----------------------------
import java.io.*;
import java.util.*;
public class Scanner_dosya_okuma {
	public static void main(String args[]) {
		//File sýnýfýndan yeni f nesnesi oluþturduk
		File f=new File("C:\\kitap\\scanner.txt");
		try {
			/* Scanner sýnýfýnýn yapýcýsýna parametre olarak f nesnesini verdik 
			 * artýk Scanner sýnýfýndan oluþturduðumuz s nesnesi ile okuma yapabiliriz
			 */
			Scanner s=new Scanner(f);
			while(s.hasNextLine()) {//dosyada okunacak bir þey kalmayana kadar devam et
				//satýr satýr verileri okuyup ekrana yazdýrdýk
				String veri=s.nextLine();
				System.out.println(veri);
			}	
		}catch(FileNotFoundException e){
			System.out.println("Dosyaya baðlanýrken hata oluþtu");
		}
	}

}
