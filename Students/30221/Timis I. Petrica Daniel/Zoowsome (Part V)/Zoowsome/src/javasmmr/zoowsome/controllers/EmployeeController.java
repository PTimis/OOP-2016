package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.animals.Constants;
import javasmmr.zoowsome.services.factories.employees.EmployeeFactory;
import javasmmr.zoowsome.views.EmployeeFrame;

public class EmployeeController extends AbstractController {

	public EmployeeController(EmployeeFrame employeeFrame, boolean hasBackButton) {
		super(employeeFrame, hasBackButton);
		employeeFrame.setCaretakerButtonActionListener(new CaretakerButtonActionListener());
	}

	private class CaretakerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			String caretakerName = JOptionPane.showInputDialog("Enter a name for your caretaker:");

			if (caretakerName == null || caretakerName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No caretaker added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					EmployeeFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
					Employee auxEmployee = employeeFactory.getEmployee(Constants.Employees.CARETAKER);

					auxEmployee.setName(caretakerName);

					caretakerArrayList.add((Caretaker) auxEmployee);
					employeeArrayList.add(auxEmployee);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Caretaker added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}

		}
	}

}
