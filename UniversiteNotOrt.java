//-------------------------------JOptionPane ile UN�VERS�TE NOT ORTALAMA---------------------------
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UniversiteNotOrt {
	public static void main(String args[]) {
		int vize1;
		int final1;
		
		String svize1=JOptionPane.showInputDialog("l�tfen vize notunuzu giriniz: ");
		vize1=Integer.parseInt(svize1);
		
		while(vize1<0 || vize1>100) {
			svize1=JOptionPane.showInputDialog(null,"l�tfen vize notunuzu giriniz: ","V�ZE1",JOptionPane.WARNING_MESSAGE);
			vize1=Integer.parseInt(svize1);
		}
		
		String sfinal=JOptionPane.showInputDialog("l�tfen final notunuzu giriniz: ");
		final1=Integer.parseInt(svize1);
		
		while(vize1<0 || vize1>100) {
			sfinal=JOptionPane.showInputDialog(null,"l�tfen final notunuzu giriniz: ","F�NAL",JOptionPane.WARNING_MESSAGE);
			final1=Integer.parseInt(sfinal);
		}
		
		double result=vize1*0.4+final1*0.6;
		String mesaj="";
		
		if(result>=50) {
			mesaj+="TEBR�KLER.Dersi ge�tiniz.";
		}
		else {
			mesaj+="KALDINIZ.Ortalaman�z 50'nin alt�nda.";
		}
		ImageIcon iconcan=new ImageIcon("C:\\Users\\Ercel\\Desktop\\PHOTO\\wp\\icon.png");
		JOptionPane.showMessageDialog(null,mesaj,"sonuc aciklama",JOptionPane.INFORMATION_MESSAGE,iconcan);
		
	}

}
