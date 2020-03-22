import java.io.*;
public class Deserialization {
	public static void main(String args[]) {
		FileInputStream f2=null;
		ObjectInputStream o2=null;
		try {
			f2=new FileInputStream("bilgiler.txt");
			o2=new ObjectInputStream(f2);
			Calisan_Serile�tirme isci=(Calisan_Serile�tirme) o2.readObject();//cast i�lemi
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