import java.io.*;
public class Deserialization {
	public static void main(String args[]) {
		FileInputStream f2=null;
		ObjectInputStream o2=null;
		try {
			f2=new FileInputStream("bilgiler.txt");
			o2=new ObjectInputStream(f2);
			Calisan_Serileþtirme isci=(Calisan_Serileþtirme) o2.readObject();//cast iþlemi
			System.out.println("Elde edilen nesne:"+isci.getAd()+" "+isci.getSoyad());
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(o2 !=null)
					o2.close();
				if(f2 !=null)
					f2.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}