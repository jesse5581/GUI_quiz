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
import javax.swing.JOptionPane;
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
	int currentQuestion = 1;
	
	
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
		ListenForButtonA lForButtonA = new ListenForButtonA();
		ListenForButtonB lForButtonB = new ListenForButtonB();
		ListenForButtonC lForButtonC = new ListenForButtonC();
		ListenForButtonD lForButtonD = new ListenForButtonD();
		
		JOptionPane.showMessageDialog(thisGUI, "Welcome to the quiz game");
		
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
		buttonA.addActionListener(lForButtonA);
		panel.add(buttonA);
		
		buttonB = new JButton("B");
		buttonB.setBounds(450, 300, 200, 50);
		buttonB.addActionListener(lForButtonB);
		panel.add(buttonB);
		
		buttonC = new JButton("C");
		buttonC.setBounds(150, 400, 200, 50);
		buttonC.addActionListener(lForButtonC);
		panel.add(buttonC);
		
		buttonD = new JButton("D");
		buttonD.setBounds(450, 400, 200, 50);
		buttonD.addActionListener(lForButtonD);
		panel.add(buttonD);
		
		
		
		
		
		
		
		label1 = new JLabel();
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(0,0,800,50);
		label1.setOpaque(true);
		label1.setBackground(Color.orange);
		label1.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		panel.add(label1);
		
		
		
		getQuestion(currentQuestion);
		
		thisGUI.add(panel);
		thisGUI.setVisible(true);

		
		
	}
	private class ListenForButtonA implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("youve selected answer A");
			if (currentQuestion == 4) {
				currentQuestion = 5;
				getQuestion(currentQuestion);
			}
			
		}
		
	}
	private class ListenForButtonB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("youve selected answer B");
			if (currentQuestion == 5) {
				currentQuestion = 6;
				getQuestion(currentQuestion);
			}
		}
	}
	private class ListenForButtonC implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("youve selected answer C");
			if (currentQuestion == 1) {
				currentQuestion = 2;
				getQuestion(currentQuestion);
			}
			else if (currentQuestion == 2) {
				currentQuestion = 3;
				getQuestion(currentQuestion);
			}
		}
	}
	private class ListenForButtonD implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("youve selected answer D");
			if (currentQuestion == 3) {
				currentQuestion = 4;
				getQuestion(currentQuestion);
			}
			else if (currentQuestion == 6) {
				currentQuestion = 7;
				getQuestion(currentQuestion);
			}
		}
	}
	public void getQuestion(int x){
		String a = "What is the age of the earth?";
		String b = "How far away is the moon?";
		String c = "what is the largest province in canada?";
		String d = "What is the smallest country in the world?";
		String e = "which planet has the fastest rotational period?";
		String f = "how many dice do you need in order to successfully play Dungeons and Dragons?";
		String g = "what GPU do I have in my computer at my house?";
		String aA = "6000 Years";
		String aB = "3.3 million years";
		String aC = "4.5 billion years";
		String aD = "The Earth has always existed";
		String bA = "1.1 light years";
		String bB = "0.7 light years ";
		String bC = "about 250000 miles";
		String bD = "nonsense the moon isnt real";
		String cA = "Alberta";
		String cB = "Ontario";
		String cC = "British Columbia";
		String cD = "Nunavut";
		String dA = "Vatican City";
		String dB = "Switzerland";
		String dC = "Iceland";
		String dD = "Peru";
		String eA = "Neptune";
		String eB = "Jupiter";
		String eC = "Mercury";
		String eD = "venus";
		String fA = "4";
		String fB = "6";
		String fC = "2";
		String fD = "7";
		String gA = "1050 ti";
		String gB = "1060 ti";
		String gC = "1070 ti";
		String gD = "1080 ti";
		
		
		if (x==1) {
			label1.setText(a);
			buttonA.setText(aA);
			buttonB.setText(aB);
			buttonC.setText(aC);
			buttonD.setText(aD);
		}
		if (x==2) {
			label1.setText(b);
			buttonA.setText(bA);
			buttonB.setText(bB);
			buttonC.setText(bC);
			buttonD.setText(bD);
		}
		if (x==3) {
			label1.setText(c);
			buttonA.setText(cA);
			buttonB.setText(cB);
			buttonC.setText(cC);
			buttonD.setText(cD);
		}
		if (x==4) {
			label1.setText(d);
			buttonA.setText(dA);
			buttonB.setText(dB);
			buttonC.setText(dC);
			buttonD.setText(dD);
		}
		if (x==5) {
			label1.setText(e);
			buttonA.setText(eA);
			buttonB.setText(eB);
			buttonC.setText(eC);
			buttonD.setText(eD);
		}
		if (x==6) {
			label1.setText(f);
			buttonA.setText(fA);
			buttonB.setText(fB);
			buttonC.setText(fC);				
			buttonD.setText(fD);
		}
		if (x==7) {
			label1.setText(g);
			buttonA.setText(gA);
			buttonB.setText(gB);
			buttonC.setText(gC);				
			buttonD.setText(gD);
		}
	
	
	
	
	}
}