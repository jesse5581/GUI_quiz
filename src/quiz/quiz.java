package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import GUI_window.ListenForButton;
import GUI_window.ListenForOpenItem;
import GUI_window.ListenForText;



public class quiz {
	JFrame thisGUI;
	JLabel label1;
	JMenu fileMenu;
	JMenuItem openMenuItem;
	JButton buttonA;
	JPanel panel;
	JButton buttonB;
	JButton buttonC;
	JButton buttonD;
	
	
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
		ListenForButtonOK lForButtonOK = new ListenForButtonOK();

		
		panel = new JPanel();
		panel.setLayout(null);
		
		
JMenuBar menuBar = new JMenuBar();
		
		fileMenu = new JMenu("About");
		openMenuItem = new JMenuItem("The makers");
		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		JMenuItem printMenuItem = new JMenuItem("The program");
		fileMenu.add(printMenuItem);
		
		
		JMenu editMenu = new JMenu("Pause");
		JMenuItem copyMenuItem = new JMenuItem("Exit");
		editMenu.add(copyMenuItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		thisGUI.add(menuBar);
		thisGUI.setJMenuBar(menuBar);
		
		buttonA  = new JButton("A");
		buttonA.setBounds(150, 300, 200, 50);
		buttonA.addActionListener(lForButtonOK);
		panel.add(buttonA);
		
		buttonB = new JButton("B");
		buttonB.setBounds(450, 300, 200, 50);
		panel.add(buttonB);
		
		buttonC = new JButton("C");
		buttonC.setBounds(150, 400, 200, 50);
		panel.add(buttonC);
		
		buttonD = new JButton("D");
		buttonD.setBounds(450, 400, 200, 50);
		panel.add(buttonD);
		
		
		
		
		
		
		
		label1 = new JLabel();
		label1.setText("Question goes here");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(0,0,800,50);
		label1.setOpaque(true);
		label1.setBackground(Color.orange);
		label1.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		panel.add(label1);
		
		
		

		
		
		thisGUI.add(panel);
		thisGUI.setVisible(true);

		
		
	}
	private class ListenForButtonOK implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("youve selected answer a");
		}
		
	}
	
	
	
}