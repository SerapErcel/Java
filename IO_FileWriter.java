import java.io.*;

public class IO_FileWriter {
	public static void main(String args[]) {
		File f=new File("C:\\kitap\\bossayfa.txt");
		try {
			//yazma i�lemleri
			FileWriter yazdir=new FileWriter(f);
			String yazilacak="Bu bir deneme yaz�s�d�r.";
			yazdir.write(yazilacak);
			yazdir.close();//ba�lant� kapat�ld�
			//okuma i�lemleri
			FileReader oku=new FileReader(f);
			char veriler[]=new char[(int) f.length()];
			oku.read(veriler);
			String okunan=new String(veriler);
			System.out.println(okunan);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
