//----------------------SCANNER SINIFI �LE DOSYA OKUMA----------------------------
import java.io.*;
import java.util.*;
public class Scanner_dosya_okuma {
	public static void main(String args[]) {
		//File s�n�f�ndan yeni f nesnesi olu�turduk
		File f=new File("C:\\kitap\\scanner.txt");
		try {
			/* Scanner s�n�f�n�n yap�c�s�na parametre olarak f nesnesini verdik 
			 * art�k Scanner s�n�f�ndan olu�turdu�umuz s nesnesi ile okuma yapabiliriz
			 */
			Scanner s=new Scanner(f);
			while(s.hasNextLine()) {//dosyada okunacak bir �ey kalmayana kadar devam et
				//sat�r sat�r verileri okuyup ekrana yazd�rd�k
				String veri=s.nextLine();
				System.out.println(veri);
			}	
		}catch(FileNotFoundException e){
			System.out.println("Dosyaya ba�lan�rken hata olu�tu");
		}
	}

}
