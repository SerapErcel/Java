import java.io.*;

public class ByteTabanli_IO {
	public static void main(String args[]) {
		File yol=new File("C:\\kitap\\outputileYazOku.txt");
		try {
			//yazma islemleri
			FileOutputStream yazdir=new FileOutputStream(yol);
			String metin="FileOutputStream ile yazdýrma ve okuma iþlemlerini öðreniyorum.";
			byte veriler[]=metin.getBytes();
			yazdir.write(veriler);
			yazdir.close();//dosya kaptalýdý
			//okuma iþlemleri
			byte okunacak[]=new byte[(int) yol.length()];
			FileInputStream f2=new FileInputStream(yol);
			f2.read(okunacak);//dizi dolduruldu
			String okunan=new String(okunacak);
			System.out.println(okunan);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
