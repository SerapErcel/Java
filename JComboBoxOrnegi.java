import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class JComboBoxOrnegi extends JFrame implements ItemListener{
	JLabel etiket;
	JLabel etiket1;
	JComboBox combo;
	//uygulama ba�lat�l�yor
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxOrnegi cerceve=new JComboBoxOrnegi();
					cerceve.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//bile�enler yap�land�r�l�yor
	public JComboBoxOrnegi() {
		super("JComboBox �rne�i");
		java.awt.Container con=getContentPane();
		setLayout(new GridLayout());
		//container nesnesi olu�turup yerle�im tipimizi belirledik
		
		combo=new JComboBox();
		combo.addItem("elaz��");
		combo.addItem("k�rklareli");
		combo.addItem("tekirdak");
		con.add(combo);
		combo.addItemListener(this);
		/* JComboBox bile�enimizi olu�turduk
		 * i�ine verileri ekledik ve ItemListener olay�n� ekledik
		 */
		
		etiket =new JLabel("secilen eleman");
		con.add(etiket);
		etiket1=new JLabel("eleman�n indis de�eri");
		con.add(etiket1);
		setSize(600,100);
		setVisible(true);
		//JLabel bile�enimizi tan�mlad�k ve boyutunu ayarlad�k
		
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String komboIcerik;
		int indis;
		komboIcerik=(String) combo.getSelectedItem();
		indis=combo.getSelectedIndex();
		
		etiket.setText(komboIcerik);
		etiket1.setText(String.valueOf(indis));
	}
	

}
