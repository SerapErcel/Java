import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class JComboBoxOrnegi extends JFrame implements ItemListener{
	JLabel etiket;
	JLabel etiket1;
	JComboBox combo;
	//uygulama baþlatýlýyor
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
	//bileþenler yapýlandýrýlýyor
	public JComboBoxOrnegi() {
		super("JComboBox Örneði");
		java.awt.Container con=getContentPane();
		setLayout(new GridLayout());
		//container nesnesi oluþturup yerleþim tipimizi belirledik
		
		combo=new JComboBox();
		combo.addItem("elazýð");
		combo.addItem("kýrklareli");
		combo.addItem("tekirdak");
		con.add(combo);
		combo.addItemListener(this);
		/* JComboBox bileþenimizi oluþturduk
		 * içine verileri ekledik ve ItemListener olayýný ekledik
		 */
		
		etiket =new JLabel("secilen eleman");
		con.add(etiket);
		etiket1=new JLabel("elemanýn indis deðeri");
		con.add(etiket1);
		setSize(600,100);
		setVisible(true);
		//JLabel bileþenimizi tanýmladýk ve boyutunu ayarladýk
		
		
		
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
