package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BirdFrame extends ZooFrame {
	
	private static final long serialVersionUID = 1L;
	JButton btnOstrich;
	JButton btnPenguin;
	JButton btnVulture;
	
	public BirdFrame(String title) {
		super(title);
		
		btnOstrich = new JButton("Ostrich");
		contentPanel.add(btnOstrich);
		
		btnPenguin = new JButton("Penguin");
		contentPanel.add(btnPenguin);
		
		btnVulture = new JButton("Vulture");
		contentPanel.add(btnVulture);
	}
	
	public void setOstrichButtonActionListener(ActionListener a) {
		btnOstrich.addActionListener(a);
	}
	
	public void setPenguinButtonActionListener(ActionListener a) {
		btnPenguin.addActionListener(a);
	}
	
	public void setVultureButtonActionListener(ActionListener a) {
		btnVulture.addActionListener(a);
	}

}
