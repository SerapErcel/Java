import java.io.*;

public class BufferedWriterReader {
	public static void main(String args[]) {
		File f=new File("C:\\kitap\\buffer.txt");
		try {
			//yazma
			FileWriter fw =new FileWriter(f,false);
			BufferedWriter yaz=new BufferedWriter(fw);
			yaz.write("Bu bir deneme yazisidir");
			yaz.flush();
			//okuma
			FileReader fr=new FileReader(f);
			BufferedReader oku=new BufferedReader(fr);
			String satir=oku.readLine();
			while(satir!=null) {
				System.out.println(satir);
				satir=oku.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
