package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListFrame extends ZooFrame {
	
	private static final long serialVersionUID = 1L;
	JButton btnListAnimals;
	JButton btnListEmployees;

	public ListFrame(String title) {
		super(title);
		
		btnListAnimals = new JButton("List animals");
		contentPanel.add(btnListAnimals);
		
		btnListEmployees = new JButton("List employees");
		contentPanel.add(btnListEmployees);
	}
	
	public void setListAnimalsButtonActionListener(ActionListener a) {
		btnListAnimals.addActionListener(a);
	}
	
	public void setListEmployeeButtonActionListener(ActionListener a) {
		btnListEmployees.addActionListener(a);
	}

}
