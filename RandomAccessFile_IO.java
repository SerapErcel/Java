//-----------RASTGELE ERÝÞÝMLÝ DOSYALARDA OKUMA VE YAZMA ÝÞLEMLERÝ-------------
import java.io.*;
public class RandomAccessFile_IO {
	public static void main(String args[]) throws Exception{
		//random.txt dosyasýný okuma ve yazma modunda açtýk
		File f=new File("C:\\kitap\\random.txt");
		RandomAccessFile r=new RandomAccessFile(f,"rw");
		/* RandomAccessFile sýnýfýnýn metodu readByte() ile byte tipinde okunan
		 * veriyi önce veri deðiþkenine atadýk sonra char dönüþümü yaparak ekrana yazdýk
		 */
		byte veri=r.readByte();
		System.out.println((char)veri);
		/* readLine() metodu ile satýr okuyup ekrana yazdýk ancak 
		 * bir karakteri readByte() ile okuduktan sonra imlec ilk karakterin
		 * arkasýna kaydýðý için imleçten sonraki kýsmý ekrana yazdý
		 */
		String satir=r.readLine();
		System.out.println(satir);
		
		r.seek(0);// imleci dosyanýn baþýna kaydýrdýk ve satýrý yeniden yazdýrdýk 
		String satir2=r.readLine();
		System.out.println(satir2);
		
		r.seek(24);//imleci dosyada 24 karakter kaydýrdýk
		//byte tipinde veriler dizisine deneme yazýsýný atadýk
		byte veriler[]="deneme".getBytes();
		r.write(veriler);//verileri imlecin bulunduðu yerden dosyaya yazdýrdýk
		
		//imleci baþa alýp satýrý yeniden yazdýrdýk
		r.seek(0);
		String satir3=r.readLine();
		System.out.println(satir3);
	}

}
