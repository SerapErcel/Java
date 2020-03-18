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
		//pencere yap�s�n� olu�turuyoruz
		JFrame jf=new JFrame();
		jf.setTitle("ilk pencerem");//ba�l�k
		jf.setSize(600, 600);//boyut
		jf.setLocation(300, 100);//ekrandaki konumu
		
		//koteyner yap�s� olu�turarak pencere d�zenini sa�l�yoruz
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField text1= new JTextField(10);//10 karakterlik metin kutusu
		JButton buton1=new JButton("G�nder");//g�nder butonu
		JLabel label1=new JLabel();
		label1.setText("buraya isminizi giriniz.");//metin
		
		//konteyner yap�s�na soldan sa�a do�ru ekleme yap�yoruz
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(buton1);
		
		//butona bas�ld���nda olu�acak olay� ActionListener ile tan�ml�yoruz
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mevcut label1 metnini de�i�tiriyoruz
				label1.setText("merhabalar "+text1.getText()+", programa ho�geldin");
			}
		});
		
		//buton1'in mevcut rengini al�yoruz
		Color eskiRenk=buton1.getBackground();
		//mouse event(hover) olu�turuyoruz
		buton1.addMouseListener(new MouseAdapter() {
			
			//imlec butonun �zerine geldi�inde rengi de�i�tiriyoruz
			@Override
			public void mouseEntered(MouseEvent e) {
				buton1.setBackground(Color.CYAN);
			}
			
			//imlec butonun d���na ��kt���nda rengi eski renk yap�yorjz
			@Override
			public void mouseExited(MouseEvent e) {
				buton1.setBackground(eskiRenk);
				
			}
			
		});
		
		/* Yeni buton olu�turarak bu butona bas�ld���nda
		 * JOptionPane, showMessageDialog ile uyar� penceresi olu�turup
		 * kullan�c�ya uyar� mesaj� veriyoruz
		 */
		JButton buton2=new JButton("uyar�");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane panelimiz=new JOptionPane();
				panelimiz.showMessageDialog(null, "merhabalar panele ho�geldin..");
			}
		});
		
		/* Yeni buton olu�turarak bu butona bas�ld���nda
		 * JOptionPane, showInputDialog ile yeni pencere a��p
		 * kullan�c�dan veri al�yoruz
		 */
		JButton buton3=new JButton("isim");
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullan�c�n�n isim girmesini istiyoruz
				String isim=JOptionPane.showInputDialog("l�tfen isminizi giriniz..");
				//veri girildi�inde uyar� mesaj� veriyoruz
				JOptionPane.showMessageDialog(null, "ho�geldin "+isim);
			}
		});
		
		/* yeni buton olu�turarak butonun rengini, buton yaz�s�n�n rengini, 
		 * yaz�n�n tipini, kal�nl���n� ve boyutunu de�i�tiriyoruz
		 */
		JButton buton4=new JButton("Renkli buton");
		buton4.setBackground(Color.BLUE);
		buton4.setForeground(Color.GREEN);
		buton4.setFont(new Font("Calibri",Font.BOLD,16));
		
		// yeni buton olu�turarak butona icon ekliyoruz
		JButton buton5=new JButton("OK");
		//s�n�f�m�z(Swing1) icerisine, kaynak dosyas�nda bulunan icon.png dosyas�n� �a��r�yoruz
		Image img1=new ImageIcon(SwingOrnegi1.class.getResource("/icon.png")).getImage();
		//buton5'e img1 dosyas�n� ekliyoruz
		buton5.setIcon(new ImageIcon(img1));
		
		
		//penceremize label, resim ekliyoruz
		JLabel ekranresmi=new JLabel();
		//s�n�f�m�z(Swing1) icerisine, kaynak dosyas�nda bulunan indir.jpg dosyas�n� �a��r�yoruz
		Image img2=new ImageIcon(SwingOrnegi1.class.getResource("/indir.jpg")).getImage();
		//penceremize img2 dosyas�n� ekliyoruz
		ekranresmi.setIcon(new ImageIcon(img2));
		
		
		//yeni olu�turdu�umuz butonlar� s�ras�yla konteyner yap�s�na ekliyoruz
		jf.getContentPane().add(buton2);
		jf.getContentPane().add(buton3);
		jf.getContentPane().add(buton4);
		jf.getContentPane().add(buton5);
		
		//penceremize ekledi�imiz resmi konteyner yap�s�na ekliyoruz
		jf.getContentPane().add(ekranresmi);
		
		//pencerenin arkaplan rengini de�i�tiriyoruz
		jf.getContentPane().setBackground(new Color(200,100,150));
		
		
		//penceredeki �arp�(x)'ya bas�ld���nda program�nda sonland�r�lmas�n� sa�l�yoruz
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pencerenin boyutunun ayarlanabilirli�ini false yani kapal� hale getiriyoruz
		jf.setResizable(false);
		//pencerenin g�r�n�rl���n� a��yoruz. (false olunca pencere g�r�nmez)
		jf.setVisible(true);
		

	}

}
