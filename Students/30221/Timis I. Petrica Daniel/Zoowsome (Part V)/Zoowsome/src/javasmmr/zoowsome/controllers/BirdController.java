package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Ostrich;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Vulture;
import javasmmr.zoowsome.views.BirdFrame;

public class BirdController extends AbstractController {

	public BirdController(BirdFrame birdFrame, boolean hasBackButton) {
		super(birdFrame, hasBackButton);
		birdFrame.setOstrichButtonActionListener(new OstrichButtonActionListener());
		birdFrame.setPenguinButtonActionListener(new PenguinButtonActionListener());
		birdFrame.setVultureButtonActionListener(new VultureButtonActionListener());
	}
		
	private class OstrichButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String ostrichName = JOptionPane.showInputDialog("Enter a name for your ostrich:");
			if (ostrichName == null || ostrichName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No ostrich added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Ostrich ostrich = new Ostrich();
				ostrich.setName(ostrichName);
				animalArrayList.add(ostrich);
				JOptionPane.showMessageDialog(null, "Ostrich added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class PenguinButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String penguinName = JOptionPane.showInputDialog("Enter a name for your penguin:");
			if (penguinName == null || penguinName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No penguin added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Penguin penguin = new Penguin();
				penguin.setName(penguinName);
				animalArrayList.add(penguin);
				JOptionPane.showMessageDialog(null, "Penguin added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class VultureButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String vultureName = JOptionPane.showInputDialog("Enter a name for your vulture:");
			if (vultureName == null || vultureName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No vulture added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Vulture vulture = new Vulture();
				vulture.setName(vultureName);
				animalArrayList.add(vulture);
				JOptionPane.showMessageDialog(null, "Vulture added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
}
