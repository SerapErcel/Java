import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization{
	public static void main(String args[]) {
		Calisan_Serileþtirme isci=new Calisan_Serileþtirme("Serap","Erçel");
		ObjectOutputStream o1=null;
		FileOutputStream f1=null;
		try {
			f1 =new FileOutputStream("bilgiler.txt");//dosya yolu verildi
			o1=new ObjectOutputStream(f1);
			o1.writeObject(isci);//isci nesnesi dosyaya yazdýrýldý
		}catch(IOException i) {
			i.printStackTrace();
		}finally {
			try {
				if (o1!=null)
					o1.close();
				if(f1!=null)
					f1.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}