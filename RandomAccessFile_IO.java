//-----------RASTGELE ER���ML� DOSYALARDA OKUMA VE YAZMA ��LEMLER�-------------
import java.io.*;
public class RandomAccessFile_IO {
	public static void main(String args[]) throws Exception{
		//random.txt dosyas�n� okuma ve yazma modunda a�t�k
		File f=new File("C:\\kitap\\random.txt");
		RandomAccessFile r=new RandomAccessFile(f,"rw");
		/* RandomAccessFile s�n�f�n�n metodu readByte() ile byte tipinde okunan
		 * veriyi �nce veri de�i�kenine atad�k sonra char d�n���m� yaparak ekrana yazd�k
		 */
		byte veri=r.readByte();
		System.out.println((char)veri);
		/* readLine() metodu ile sat�r okuyup ekrana yazd�k ancak 
		 * bir karakteri readByte() ile okuduktan sonra imlec ilk karakterin
		 * arkas�na kayd��� i�in imle�ten sonraki k�sm� ekrana yazd�
		 */
		String satir=r.readLine();
		System.out.println(satir);
		
		r.seek(0);// imleci dosyan�n ba��na kayd�rd�k ve sat�r� yeniden yazd�rd�k 
		String satir2=r.readLine();
		System.out.println(satir2);
		
		r.seek(24);//imleci dosyada 24 karakter kayd�rd�k
		//byte tipinde veriler dizisine deneme yaz�s�n� atad�k
		byte veriler[]="deneme".getBytes();
		r.write(veriler);//verileri imlecin bulundu�u yerden dosyaya yazd�rd�k
		
		//imleci ba�a al�p sat�r� yeniden yazd�rd�k
		r.seek(0);
		String satir3=r.readLine();
		System.out.println(satir3);
	}

}
