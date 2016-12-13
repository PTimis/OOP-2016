package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;
	JButton btnAnimal;
	JButton btnEmployee;
	
	public AddFrame(String title) {
		super(title);
		
		btnAnimal = new JButton("Animal");
		contentPanel.add(btnAnimal);
		
		btnEmployee = new JButton("Employee");
		contentPanel.add(btnEmployee);
	}
	
	public void setAnimalButtonActionListener(ActionListener a) {
		btnAnimal.addActionListener(a);
	}
	
	public void setEmployeeButtonActionListener(ActionListener a) {
		btnEmployee.addActionListener(a);
	}

}
