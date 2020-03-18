package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingOrnegi1 {
	public static void main(String [] args) {
		//pencere yapýsýný oluþturuyoruz
		JFrame jf=new JFrame();
		jf.setTitle("ilk pencerem");//baþlýk
		jf.setSize(600, 600);//boyut
		jf.setLocation(300, 100);//ekrandaki konumu
		
		//koteyner yapýsý oluþturarak pencere düzenini saðlýyoruz
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField text1= new JTextField(10);//10 karakterlik metin kutusu
		JButton buton1=new JButton("Gönder");//gönder butonu
		JLabel label1=new JLabel();
		label1.setText("buraya isminizi giriniz.");//metin
		
		//konteyner yapýsýna soldan saða doðru ekleme yapýyoruz
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(buton1);
		
		//butona basýldýðýnda oluþacak olayý ActionListener ile tanýmlýyoruz
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mevcut label1 metnini deðiþtiriyoruz
				label1.setText("merhabalar "+text1.getText()+", programa hoþgeldin");
			}
		});
		
		//buton1'in mevcut rengini alýyoruz
		Color eskiRenk=buton1.getBackground();
		//mouse event(hover) oluþturuyoruz
		buton1.addMouseListener(new MouseAdapter() {
			
			//imlec butonun üzerine geldiðinde rengi deðiþtiriyoruz
			@Override
			public void mouseEntered(MouseEvent e) {
				buton1.setBackground(Color.CYAN);
			}
			
			//imlec butonun dýþýna çýktýðýnda rengi eski renk yapýyorjz
			@Override
			public void mouseExited(MouseEvent e) {
				buton1.setBackground(eskiRenk);
				
			}
			
		});
		
		/* Yeni buton oluþturarak bu butona basýldýðýnda
		 * JOptionPane, showMessageDialog ile uyarý penceresi oluþturup
		 * kullanýcýya uyarý mesajý veriyoruz
		 */
		JButton buton2=new JButton("uyarý");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane panelimiz=new JOptionPane();
				panelimiz.showMessageDialog(null, "merhabalar panele hoþgeldin..");
			}
		});
		
		/* Yeni buton oluþturarak bu butona basýldýðýnda
		 * JOptionPane, showInputDialog ile yeni pencere açýp
		 * kullanýcýdan veri alýyoruz
		 */
		JButton buton3=new JButton("isim");
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullanýcýnýn isim girmesini istiyoruz
				String isim=JOptionPane.showInputDialog("lütfen isminizi giriniz..");
				//veri girildiðinde uyarý mesajý veriyoruz
				JOptionPane.showMessageDialog(null, "hoþgeldin "+isim);
			}
		});
		
		/* yeni buton oluþturarak butonun rengini, buton yazýsýnýn rengini, 
		 * yazýnýn tipini, kalýnlýðýný ve boyutunu deðiþtiriyoruz
		 */
		JButton buton4=new JButton("Renkli buton");
		buton4.setBackground(Color.BLUE);
		buton4.setForeground(Color.GREEN);
		buton4.setFont(new Font("Calibri",Font.BOLD,16));
		
		// yeni buton oluþturarak butona icon ekliyoruz
		JButton buton5=new JButton("OK");
		//sýnýfýmýz(Swing1) icerisine, kaynak dosyasýnda bulunan icon.png dosyasýný çaðýrýyoruz
		Image img1=new ImageIcon(SwingOrnegi1.class.getResource("/icon.png")).getImage();
		//buton5'e img1 dosyasýný ekliyoruz
		buton5.setIcon(new ImageIcon(img1));
		
		
		//penceremize label, resim ekliyoruz
		JLabel ekranresmi=new JLabel();
		//sýnýfýmýz(Swing1) icerisine, kaynak dosyasýnda bulunan indir.jpg dosyasýný çaðýrýyoruz
		Image img2=new ImageIcon(SwingOrnegi1.class.getResource("/indir.jpg")).getImage();
		//penceremize img2 dosyasýný ekliyoruz
		ekranresmi.setIcon(new ImageIcon(img2));
		
		
		//yeni oluþturduðumuz butonlarý sýrasýyla konteyner yapýsýna ekliyoruz
		jf.getContentPane().add(buton2);
		jf.getContentPane().add(buton3);
		jf.getContentPane().add(buton4);
		jf.getContentPane().add(buton5);
		
		//penceremize eklediðimiz resmi konteyner yapýsýna ekliyoruz
		jf.getContentPane().add(ekranresmi);
		
		//pencerenin arkaplan rengini deðiþtiriyoruz
		jf.getContentPane().setBackground(new Color(200,100,150));
		
		
		//penceredeki çarpý(x)'ya basýldýðýnda programýnda sonlandýrýlmasýný saðlýyoruz
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pencerenin boyutunun ayarlanabilirliðini false yani kapalý hale getiriyoruz
		jf.setResizable(false);
		//pencerenin görünürlüðünü açýyoruz. (false olunca pencere görünmez)
		jf.setVisible(true);
		

	}

}
