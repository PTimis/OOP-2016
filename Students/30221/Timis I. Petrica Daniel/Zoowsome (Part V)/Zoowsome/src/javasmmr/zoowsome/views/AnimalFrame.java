package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnimalFrame extends ZooFrame {
	
	private static final long serialVersionUID = 1L;
	JButton btnAquatic;
	JButton btnMammal;
	JButton btnInsect;
	JButton btnReptile;
	JButton btnBird;
	
	public AnimalFrame(String title) {
		super(title);
		
		btnAquatic = new JButton("Aquatic");
		contentPanel.add(btnAquatic);
		
		btnMammal = new JButton("Mammal");
		contentPanel.add(btnMammal);
		
		btnInsect = new JButton("Insect");
		contentPanel.add(btnInsect);
		
		btnReptile = new JButton("Reptile");
		contentPanel.add(btnReptile);
		
		btnBird = new JButton("Bird");
		contentPanel.add(btnBird);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
	
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}

}
