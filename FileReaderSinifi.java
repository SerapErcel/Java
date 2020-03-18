import java.io.*;
public class FileReaderSinifi {
	public static void main(String args[]) {
		//File sýnýfýndan dosya yolunu verdiðimiz f nesnesini oluþturduk
		File f=new File("C:\\kitap\\sehirler.txt");
		//FileReader verileri karakter tipinde okuduðu için veriler adýnda karakter dizisi oluþturduk
		char veriler[]=new char[(int) f.length()];
		try {
			//f2 nesnesini oluþturduk ve f'i f2'nin yapýcýsana gönderdik
			FileReader f2=new FileReader(f);
			//f2 read metodu ile verileri okuyup veriler dizisine atadýk
			f2.read(veriler);
			//veriler karakter dizisini okunan adlý String nesnesine atadýk
			//boþ bir dosya okunmaya çalýþýldýðýnda "-1" deðeri döner
			String okunan=new String(veriler);
			//okunan verileri ekrana yazdýrdýk
			System.out.println(okunan);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
}