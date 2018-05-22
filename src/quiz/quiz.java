package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class quiz {
	JFrame thisGUI;
	JLabel label1;
	JMenu fileMenu;
	JMenuItem openMenuItem;
	
	
	public static void main(String[] args) {
		new quiz();
	}
	public quiz(){
		System.out.println("Hello world!");
		thisGUI = new JFrame();
		thisGUI.setTitle("Quiz Challenge");
		thisGUI.setSize(800, 600);
		thisGUI.setResizable(false);
		thisGUI.setLocationRelativeTo(null);
		thisGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
JMenuBar menuBar = new JMenuBar();
		
		fileMenu = new JMenu("About");
		openMenuItem = new JMenuItem("The makers");
		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		JMenuItem printMenuItem = new JMenuItem("The program");
		fileMenu.add(printMenuItem);
		
		
		JMenu editMenu = new JMenu("Edit");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		editMenu.add(copyMenuItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		thisGUI.add(menuBar);
		thisGUI.setJMenuBar(menuBar);
		
		
		

		
		
		
		thisGUI.setVisible(true);

	}
}