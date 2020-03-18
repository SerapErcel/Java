import java.io.File;
import java.io.IOException;

public class GirisCikis�slemleri {

	public static void main(String[] args) {
		File f=new File("C:\\kitap\\ornek.txt");
		try {
			f.createNewFile();//yeni dosya olu�turuldu
		}
		catch(IOException e){
			e.printStackTrace();
		}
		f.delete();//dosyay� sil
		System.out.println(f.exists());//dosya var m�?
		f.mkdir();//ornek.txt ad�nda bir dosya olu�turdu
		File f2=new File("C:\\kitap\\yeniornek");//yeni nesne
		f.renameTo(f2);//yeni nesne ile dosya ad�n� de�i�tirdi
	}

}
