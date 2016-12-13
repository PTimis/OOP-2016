package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.views.MammalFrame;

public class MammalController extends AbstractController {

	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) {
		super(mammalFrame, hasBackButton);
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
	}
	
	private class MonkeyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String monkeyName = JOptionPane.showInputDialog("Enter a name for your monkey:");
			if (monkeyName == null || monkeyName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No monkey added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Monkey monkey = new Monkey();
				monkey.setName(monkeyName);
				animalArrayList.add(monkey);
				JOptionPane.showMessageDialog(null, "Monkey added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class CowButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cowName = JOptionPane.showInputDialog("Enter a name for your cow:");
			if (cowName == null || cowName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No cow added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Cow cow = new Cow();
				cow.setName(cowName);
				animalArrayList.add(cow);
				JOptionPane.showMessageDialog(null, "Cow added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class TigerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String tigerName = JOptionPane.showInputDialog("Enter a name for your tiger:");
			if (tigerName == null || tigerName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No tiger added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Tiger tiger = new Tiger();
				tiger.setName(tigerName);
				animalArrayList.add(tiger);
				JOptionPane.showMessageDialog(null, "Tiger added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
}
