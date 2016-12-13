package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AquaticFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;
	JButton btnOctopus;
	JButton btnShark;
	JButton btnSeahorse;
	
	public AquaticFrame(String title) {
		super(title);
		
		btnOctopus = new JButton("Octopus");
		contentPanel.add(btnOctopus);
		
		btnShark = new JButton("Shark");
		contentPanel.add(btnShark);
		
		btnSeahorse = new JButton("Seahorse");
		contentPanel.add(btnSeahorse);
	}
	
	public void setOctopusButtonActionListener(ActionListener a) {
		btnOctopus.addActionListener(a);
	}
	
	public void setSharkButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}
	
	public void setSeahorseButtonActionListener(ActionListener a){
		btnSeahorse.addActionListener(a);
	}
	
}
