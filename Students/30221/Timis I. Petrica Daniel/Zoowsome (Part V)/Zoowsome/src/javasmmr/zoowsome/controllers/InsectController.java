package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.views.InsectFrame;

public class InsectController extends AbstractController {

	public InsectController(InsectFrame insectFrame, boolean hasBackButton) {
		super(insectFrame, hasBackButton);
		insectFrame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
		insectFrame.setCockroachButtonActionListener(new CockroachButtonActionListener());
		insectFrame.setSpiderButtonActionListener(new SpiderButtonActionListener());
	}

	private class ButterflyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String butterflyName = JOptionPane.showInputDialog("Enter a name for your butterfly:");
			if (butterflyName == null || butterflyName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No butterfly added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Butterfly butterfly = new Butterfly();
				butterfly.setName(butterflyName);
				animalArrayList.add(butterfly);
				JOptionPane.showMessageDialog(null, "Butterfly added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	private class CockroachButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cockroachName = JOptionPane.showInputDialog("Enter a name for your cockroach:");
			if (cockroachName == null || cockroachName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No cockroach added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Cockroach cockroach = new Cockroach();
				cockroach.setName(cockroachName);
				animalArrayList.add(cockroach);
				JOptionPane.showMessageDialog(null, "Cockroach added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	private class SpiderButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String spiderName = JOptionPane.showInputDialog("Enter a name for your spider:");
			if (spiderName == null || spiderName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No spider added!", "Operation failed!", JOptionPane.ERROR_MESSAGE);
			} else {
				Spider spider = new Spider();
				spider.setName(spiderName);
				animalArrayList.add(spider);
				JOptionPane.showMessageDialog(null, "Spider added!", "Operation succeded!", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

}
