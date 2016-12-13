package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReptileFrame extends ZooFrame {
	
	private static final long serialVersionUID = 1L;
	JButton btnSnake;
	JButton btnTurtle;
	JButton btnLizard;
	
	public ReptileFrame(String title) {
		super(title);
		
		btnSnake = new JButton("Snake");
		contentPanel.add(btnSnake);
		
		btnTurtle = new JButton("Cockroach");
		contentPanel.add(btnTurtle);
		
		btnLizard = new JButton("Lizard");
		contentPanel.add(btnLizard);
	}
	
	public void setSnakeButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}
	
	public void setTurtleButtonActionListener(ActionListener a) {
		btnTurtle.addActionListener(a);
	}
	
	public void setLizardButtonActionListener(ActionListener a) {
		btnLizard.addActionListener(a);
	}

}
