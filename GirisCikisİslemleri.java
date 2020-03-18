import java.io.File;
import java.io.IOException;

public class GirisCikisÝslemleri {

	public static void main(String[] args) {
		File f=new File("C:\\kitap\\ornek.txt");
		try {
			f.createNewFile();//yeni dosya oluþturuldu
		}
		catch(IOException e){
			e.printStackTrace();
		}
		f.delete();//dosyayý sil
		System.out.println(f.exists());//dosya var mý?
		f.mkdir();//ornek.txt adýnda bir dosya oluþturdu
		File f2=new File("C:\\kitap\\yeniornek");//yeni nesne
		f.renameTo(f2);//yeni nesne ile dosya adýný deðiþtirdi
	}

}
