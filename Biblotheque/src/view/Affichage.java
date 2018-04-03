package view;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;


public class Affichage extends JFrame {
	
	public Affichage() {
		//super();
		build();
	}
	
	private void build() {
		setTitle("La Bibiotheque");
		setSize(450,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		setContentPane(buildContentPane());
		
	}
	
	private JPanel buildContentPane() {
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		
		FlowLayout fl2 = new FlowLayout();
		fl2.setAlignment(FlowLayout.RIGHT);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		JButton b1 = new JButton("Add");  
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Remove");
		
		JLabel l1 = new JLabel("Titre:");
		JLabel l2 = new JLabel("Auteur:");
		JLabel l3 = new JLabel("Nb pages:");
		JLabel l4 = new JLabel("Prix litteraire");
		
		JTextField tf1 = new JTextField("",35);
		JTextField tf2 = new JTextField("",35);
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
		
		p1.add(l1);
		p1.add(tf1);
		
		p2.add(l2);
		p2.add(tf2);
		
		p3.add(l3);
		p3.add(tf3);
		p3.setLayout(fl);
		
		p4.add(l4);
		p4.add(rb1);
		p4.add(rb2);
		p4.add(rb3);
		p4.add(rb4);
		p4.setLayout(fl);
		
		p5.add(b1);
		p5.add(b2);
		p5.add(b3);
		p5.setLayout(fl2);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String titre = tf1.getText();
				String auteur = tf2.getText();
				int pages = Integer.parseInt(tf3.getText());
				
				System.out.println(titre);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			}
		});
		
		return panel;
	}
	
}
