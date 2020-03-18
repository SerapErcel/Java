//----------JAVADA TARÝH ÝÞLEMÝ-------------
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_SimpleDate {
	public static void main (String args[]) throws ParseException {
		Date simdikiZaman= new Date();// o anýn tarihi ve saati (kodun çalýþtýðý bilgisayarýn saati)
		System.out.println(simdikiZaman.toString());
		//Date deðiþkenini kullanýcýnýn anlayabileceði bir formatta yazdýrmak için SimpleDateFormat kullanýlýr
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");// yýl/ay/gün 
        System.out.println(df.format(simdikiZaman));
	}

}
