package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MammalFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;
	JButton btnMonkey;
	JButton btnTiger;
	JButton btnCow;
	
	public MammalFrame(String title) {
		super(title);
		
		btnMonkey = new JButton("Monkey");
		contentPanel.add(btnMonkey);
		
		btnTiger = new JButton("Tiger");
		contentPanel.add(btnTiger);
		
		btnCow = new JButton("Cow");
		contentPanel.add(btnCow);
	}
	
	public void setMonkeyButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
	
	public void setCowButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}
	
}
