import java.io.*;
public class Calisan_Serile�tirme implements Serializable{ //implement i�lemi
	private String ad; //de�i�ken tan�mlama
	private String soyad;
	
	public Calisan_Serile�tirme(String ad, String soyad) { //constructur
		this.ad=ad;
		this.soyad=soyad;
	}
	public String getAd() { //getter metodlar�
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
}

