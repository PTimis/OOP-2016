package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.views.ReptileFrame;

public class ReptileController extends AbstractController {

	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) {
		super(reptileFrame, hasBackButton);
		reptileFrame.setTurtleButtonActionListener(new TurtleButtonActionListener());
		reptileFrame.setSnakeButtonActionListener(new SnakeButtonActionListener());
		reptileFrame.setLizardButtonActionListener(new LizardButtonActionListener());
	}

	private class LizardButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String lizardName = JOptionPane.showInputDialog("Enter a name for your lizard:");
			if (lizardName == null || lizardName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No lizard added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Lizard lizard = new Lizard();
				lizard.setName(lizardName);
				animalArrayList.add(lizard);
				JOptionPane.showMessageDialog(null, "Lizzard added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class SnakeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String snakeName = JOptionPane.showInputDialog("Enter a name for your snake:");
			if (snakeName == null || snakeName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No snake added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Snake snake = new Snake();
				snake.setName(snakeName);
				animalArrayList.add(snake);
				JOptionPane.showMessageDialog(null, "Snake added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class TurtleButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String turtleName = JOptionPane.showInputDialog("Enter a name for your turtle:");
			if (turtleName == null || turtleName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No turtle added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Turtle turtle = new Turtle();
				turtle.setName(turtleName);
				animalArrayList.add(turtle);
				JOptionPane.showMessageDialog(null, "Turtle added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
}
