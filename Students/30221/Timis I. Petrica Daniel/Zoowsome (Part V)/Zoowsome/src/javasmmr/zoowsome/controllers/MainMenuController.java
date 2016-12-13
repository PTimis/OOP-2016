package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {

	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class SaveAndExitActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				employeeRepository.save(employeeArrayList);
				animalRepository.save(animalArrayList);
				JOptionPane.showMessageDialog(null, "Saved!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			} catch (FileNotFoundException exception) {
				exception.printStackTrace();
			} catch (XMLStreamException exception) {
				exception.printStackTrace();
			}
		}
	}
	
	private class ListButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ListController(new ListFrame("List"), true);
		}
	}
	
}
