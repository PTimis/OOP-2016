package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Seahorse;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.views.AquaticFrame;

public class AquaticController extends AbstractController {

	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) {
		super(aquaticFrame, hasBackButton);
		aquaticFrame.setOctopusButtonActionListener(new OctopusButtonActionListener());
		aquaticFrame.setSharkButtonActionListener(new SharkButtonActionListener());
		aquaticFrame.setSeahorseButtonActionListener(new SeahorseButtonActionListener());
	}

	private class OctopusButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String octopusName = JOptionPane.showInputDialog("Enter a name for your octopus:");
			if (octopusName == null || octopusName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No octopus added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Octopus octopus = new Octopus();
				octopus.setName(octopusName);
				animalArrayList.add(octopus);
				JOptionPane.showMessageDialog(null, "Octopus added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	private class SharkButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String sharkName = JOptionPane.showInputDialog("Enter a name for your shark:");
			if (sharkName == null || sharkName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No shark added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Shark shark = new Shark();
				shark.setName(sharkName);
				animalArrayList.add(shark);
				JOptionPane.showMessageDialog(null, "Shark added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class SeahorseButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String seahorseName = JOptionPane.showInputDialog("Enter a name for your seahorse:");
			if (seahorseName == null || seahorseName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No seahorse added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Seahorse seahorse = new Seahorse();
				seahorse.setName(seahorseName);
				animalArrayList.add(seahorse);
				JOptionPane.showMessageDialog(null, "Seahorse added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
}
