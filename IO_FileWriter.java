import java.io.*;

public class IO_FileWriter {
	public static void main(String args[]) {
		File f=new File("C:\\kitap\\bossayfa.txt");
		try {
			//yazma iþlemleri
			FileWriter yazdir=new FileWriter(f);
			String yazilacak="Bu bir deneme yazýsýdýr.";
			yazdir.write(yazilacak);
			yazdir.close();//baðlantý kapatýldý
			//okuma iþlemleri
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
