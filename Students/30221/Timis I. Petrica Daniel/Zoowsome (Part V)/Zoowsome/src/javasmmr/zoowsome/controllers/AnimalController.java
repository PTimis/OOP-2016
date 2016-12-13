package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class AnimalController extends AbstractController {

	public AnimalController(AnimalFrame animalFrame, boolean hasBackButton) {
		super(animalFrame, hasBackButton);
		animalFrame.setAquaticButtonActionListener(new AquaticButtonActionListener());
		animalFrame.setBirdButtonActionListener(new BirdButtonActionListener());
		animalFrame.setMammalButtonActionListener(new MammalButtonActionListener());
		animalFrame.setInsectButtonActionListener(new InsectButtonActionListener());
		animalFrame.setReptileButtonActionListener(new ReptileButtonActionListener());
	}

	private class MammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new MammalFrame("Mammal"), true);
		}
	}

	private class AquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}

	private class BirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new BirdController(new BirdFrame("Bird"), true);
		}
	}

	private class InsectButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new InsectController(new InsectFrame("Insect"), true);
		}
	}

	private class ReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new ReptileFrame("Reptile"), true);
		}
	}

}
