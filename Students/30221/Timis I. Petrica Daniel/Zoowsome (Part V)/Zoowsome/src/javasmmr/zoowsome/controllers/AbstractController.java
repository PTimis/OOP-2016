package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.employees.EmployeeAbstractFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AbstractController {

	public ArrayList<Caretaker> caretakerArrayList = new ArrayList<Caretaker>();
	public ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
	public ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
	public EmployeeRepository employeeRepository = new EmployeeRepository();
	public AnimalRepository animalRepository = new AnimalRepository();

	EmployeeAbstractFactory employeeAbstractFactory = new EmployeeAbstractFactory();

	protected ZooFrame frame;

	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton)
			frame.setBackButtonActionListener(new BackButtonListener());
	}

	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}

}
