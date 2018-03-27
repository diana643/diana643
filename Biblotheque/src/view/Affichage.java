package view;

import javax.swing.*;
import java.awt.event.*;


public class Affichage extends JFrame {
	
	private void build() {
		setTitle("La Bibiotheque");
		setSize(400,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		setContentPane(buildContentPane());
		
	}
	
	private JPanel buildContentPane() {
		JPanel panel = new JPanel();
		
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Remove");
		
		JLabel l1 = new JLabel("Titre");
		JLabel l2 = new JLabel("Auteur");
		JLabel l3 = new JLabel("Nb pages");
		JLabel l4 = new JLabel("Prix litteraire");
		
		JTextField tf1 = new JTextField("",50);
		JTextField tf2 = new JTextField("",50);
		JTextField tf3 = new JTextField("",10);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Aucun");
		JRadioButton rb2 = new JRadioButton("Goncourt");
		JRadioButton rb3 = new JRadioButton("Medicis");
		JRadioButton rb4 = new JRadioButton("Interallie");
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		
		return panel;
	}
	
}
