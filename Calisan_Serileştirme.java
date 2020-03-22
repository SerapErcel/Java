import java.io.*;
public class Calisan_Serileþtirme implements Serializable{ //implement iþlemi
	private String ad; //deðiþken tanýmlama
	private String soyad;
	
	public Calisan_Serileþtirme(String ad, String soyad) { //constructur
		this.ad=ad;
		this.soyad=soyad;
	}
	public String getAd() { //getter metodlarý
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
}

