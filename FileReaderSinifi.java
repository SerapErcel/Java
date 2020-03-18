import java.io.*;
public class FileReaderSinifi {
	public static void main(String args[]) {
		//File s�n�f�ndan dosya yolunu verdi�imiz f nesnesini olu�turduk
		File f=new File("C:\\kitap\\sehirler.txt");
		//FileReader verileri karakter tipinde okudu�u i�in veriler ad�nda karakter dizisi olu�turduk
		char veriler[]=new char[(int) f.length()];
		try {
			//f2 nesnesini olu�turduk ve f'i f2'nin yap�c�sana g�nderdik
			FileReader f2=new FileReader(f);
			//f2 read metodu ile verileri okuyup veriler dizisine atad�k
			f2.read(veriler);
			//veriler karakter dizisini okunan adl� String nesnesine atad�k
			//bo� bir dosya okunmaya �al���ld���nda "-1" de�eri d�ner
			String okunan=new String(veriler);
			//okunan verileri ekrana yazd�rd�k
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