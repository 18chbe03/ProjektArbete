package view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import database.DaoType;
import database.PointDAO;
import trackPoint.TrackPoint;

public class ActivityClockGUI extends JFrame {

	DaoType<TrackPoint> pointDao = (DaoType<TrackPoint>) new PointDAO();

	private ArrayList<TrackPoint> tp = (ArrayList<TrackPoint>) pointDao.getAll();

	public ActivityClockGUI() {

		JFrame frame = new JFrame("Projektarbete ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setBackground(Color.white);
		frame.setVisible(true);
		frame.add(HeadPanel());
	}

	private JPanel HeadPanel() {

		JPanel headPanel = new JPanel(new BorderLayout());
		headPanel.add(NorthPanel(headPanel), BorderLayout.NORTH);
		headPanel.add(SouthPanel(headPanel), BorderLayout.SOUTH);
		headPanel.setBackground(Color.white);
		return headPanel;
	}

	private JPanel NorthPanel(JPanel headPanel) {

		JPanel northPanel = new JPanel(new GridLayout(3, 1));
		JButton northButton1 = new JButton("Get all statistics");
		JButton northButton2 = new JButton("Show activitys");
		northPanel.add(northButton2);
		northButton2.addActionListener(e -> {
			activitys();
		});
		northPanel.add(northButton1);
		northButton1.addActionListener(e -> {
			Statistics();
		});
		return northPanel;

	}

	private JPanel Statistics() { /* Skriver ut all Statistik, använder getAll() metoden i PointDAO */

		TrackPoint tp1 = new TrackPoint();

		JFrame frameStat = new JFrame("All statistics");
		JPanel statistics = new JPanel();
		frameStat.setSize(400, 300);
		frameStat.setBackground(Color.black);
		frameStat.setVisible(true);
		frameStat.add(statistics);
		JTextArea text = new JTextArea();
		for (TrackPoint p : tp) {

			text.append(p.toString() + "\n");

		}
		statistics.add(text);

		return statistics;
	}
	
	private JPanel activitys() {
		
		TrackPoint tp2 = new TrackPoint(); 
		
		JFrame frameActive = new JFrame("Activitys");
		JPanel activity = new JPanel(); 
		frameActive.setSize(400,300);
		frameActive.setBackground(Color.black);
		frameActive.setVisible(true);
		frameActive.add(activity);
		
		return activity;
	}

	private JPanel SouthPanel(JPanel headPanel) {

		JPanel southPanel = new JPanel(new GridLayout(3, 1));
		return southPanel;

	}

	
	

}
