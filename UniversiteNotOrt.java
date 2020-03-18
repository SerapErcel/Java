//-------------------------------JOptionPane ile UNÝVERSÝTE NOT ORTALAMA---------------------------
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UniversiteNotOrt {
	public static void main(String args[]) {
		int vize1,vize2;
		int final1;
		
		String svize1=JOptionPane.showInputDialog("lütfen 1.vize notunuzu giriniz: ");
		vize1=Integer.parseInt(svize1);
		
		while(vize1<0 || vize1>100) {
			svize1=JOptionPane.showInputDialog(null,"lütfen 1.vize notunuzu giriniz: ","VÝZE1",JOptionPane.WARNING_MESSAGE);
			vize1=Integer.parseInt(svize1);
		}
		
		String svize2=JOptionPane.showInputDialog("lütfen 2.vize notunuzu giriniz: ");
		vize2=Integer.parseInt(svize2);
		
		while(vize2<0 || vize2>100) {
			svize2=JOptionPane.showInputDialog(null,"lütfen 2.vize notunuzu giriniz: ","VÝZE2",JOptionPane.WARNING_MESSAGE);
			vize2=Integer.parseInt(svize2);
		}
		
		String sfinal=JOptionPane.showInputDialog("lütfen final notunuzu giriniz: ");
		final1=Integer.parseInt(svize1);
		
		while(vize1<0 || vize1>100) {
			sfinal=JOptionPane.showInputDialog(null,"lütfen final notunuzu giriniz: ","FÝNAL",JOptionPane.WARNING_MESSAGE);
			final1=Integer.parseInt(sfinal);
		}
		
		double result=vize1*0.2+vize2*0.2+final1*0.6;
		String mesaj="";
		
		if(result>50) {
			mesaj+="TEBRÝKLER.Dersi geçtiniz.";
		}
		else {
			mesaj+="KALDINIZ.Ortalamanýz 50'nin altýnda.";
		}
		ImageIcon iconcan=new ImageIcon("C:\\Users\\Ercel\\Desktop\\PHOTO\\wp\\icon.png");
		JOptionPane.showMessageDialog(null,mesaj,"sonuc aciklama",JOptionPane.INFORMATION_MESSAGE,iconcan);
		
	}

}
