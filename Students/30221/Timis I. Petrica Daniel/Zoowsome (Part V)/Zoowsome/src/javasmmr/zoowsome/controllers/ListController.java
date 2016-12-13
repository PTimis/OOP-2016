package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.views.ListFrame;

public class ListController extends AbstractController {
	
	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);
		listFrame.setListAnimalsButtonActionListener(new ListAnimalsButtonActionListener());
		listFrame.setListEmployeeButtonActionListener(new ListEmployeeButtonActionListener());
	}
	
	private class ListEmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String output = "";
			for(Employee employee: employeeArrayList) {
				output += employee.getName() + "\n";
			}
			JOptionPane.showMessageDialog(null, output, "List of Employees", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	private class ListAnimalsButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String output = "";
			for(Animal animal: animalArrayList) {
				output += animal.getName() + "\n";
			}
			JOptionPane.showMessageDialog(null, output, "List of Animals", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
