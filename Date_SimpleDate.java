//----------JAVADA TAR�H ��LEM�-------------
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_SimpleDate {
	public static void main (String args[]) throws ParseException {
		Date simdikiZaman= new Date();// o an�n tarihi ve saati (kodun �al��t��� bilgisayar�n saati)
		System.out.println(simdikiZaman.toString());
		//Date de�i�kenini kullan�c�n�n anlayabilece�i bir formatta yazd�rmak i�in SimpleDateFormat kullan�l�r
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");// y�l/ay/g�n 
        System.out.println(df.format(simdikiZaman));
	}

}
