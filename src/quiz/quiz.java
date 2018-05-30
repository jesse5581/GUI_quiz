package quiz;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;





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
	JMenuItem printMenuItem;
	int currentQuestion = 1;
	JMenuItem restartMenuItem;
	JMenuItem copyMenuItem;
	JMenu editMenu;
	
	
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
		ListenForOpenItem lForOpenItem = new ListenForOpenItem();
		ListenForOpenItem1 lForOpenItem1 = new ListenForOpenItem1();
		ListenForOpenItem2 lForOpenItem2 = new ListenForOpenItem2();
		ListenForOpenItem3 lForOpenItem3 = new ListenForOpenItem3();
		
		JOptionPane.showMessageDialog(thisGUI, "Welcome to the quiz game");
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
JMenuBar menuBar = new JMenuBar();
		
		fileMenu = new JMenu("About");
		openMenuItem = new JMenuItem("The makers");
		openMenuItem.addActionListener(lForOpenItem);
		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		printMenuItem = new JMenuItem("The program");
		printMenuItem.addActionListener(lForOpenItem1);
		fileMenu.add(printMenuItem);
		
		
		editMenu = new JMenu("Pause");
		copyMenuItem = new JMenuItem("Jump to end");
		copyMenuItem.addActionListener(lForOpenItem3);
		editMenu.add(copyMenuItem);
		restartMenuItem = new JMenuItem("Restart");
		restartMenuItem.addActionListener(lForOpenItem2);
		editMenu.add(restartMenuItem);
		
		
		
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
			else if (currentQuestion == 8) {
				currentQuestion = 9;
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
			else if (currentQuestion == 9) {
				currentQuestion = 10;
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
			else if (currentQuestion == 7) {
				currentQuestion = 8;
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
			else if (currentQuestion == 10) {
				JOptionPane.showMessageDialog(thisGUI, "You have completed the quiz please exit");
			}
		}
	}
	private class ListenForOpenItem implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Clicked open menu");
			JOptionPane.showMessageDialog(thisGUI, "This game was designed by Jesse Gordon & Pierce Gregor. Jesse is a junior who has designed similar programs in python. Pierce is a senior who has also designed similar programs in various languages. Both attend Palm Desert High School.");
		}
	}
	private class ListenForOpenItem1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Clicked open menu");
			JOptionPane.showMessageDialog(thisGUI, "This Quiz game was designed by Jesse Gordon & Pierce Gregor for a school project. The game is written in Java and utilizes functions action listeners and variables.");
		}
	}
	private class ListenForOpenItem2 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Clicked open menu");
			currentQuestion = 1;
			getQuestion(currentQuestion);
		}
	}
	private class ListenForOpenItem3 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Clicked open menu");
			currentQuestion = 10;
			getQuestion(currentQuestion);
		}
	}
	public void getQuestion(int x){
		String a = "#1 What is the age of the earth?";
		String b = "#2 How far away is the moon?";
		String c = "#3 what is the largest province in canada?";
		String d = "#4 What is the smallest country in the world?";
		String e = "#5 which planet has the fastest rotational period?";
		String f = "#6 how many dice do you need in order to successfully play Dungeons and Dragons?";
		String g = "#7 what GPU do I have in my computer at my house?";
		String h = "#8 What pc part company is my personal favorite?";
		String i = "#9 What is the longest day of the year?";
		String j = "#10 How many cells are in your body?";
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
		String hA = "Corsair";
		String hB = "Razer";
		String hC = "HyperX";
		String hD = "Cyber Power PC";
		String iA = "June 20";
		String iB = "June 21";
		String iC = "June 22";
		String iD = "June 23";
		String jA = "31 trillion";
		String jB = "33.8 trillion";
		String jC = "557 billion";
		String jD = "37.2 trillion";
		
		
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
		if (x==8) {
			label1.setText(h);
			buttonA.setText(hA);
			buttonB.setText(hB);
			buttonC.setText(hC);				
			buttonD.setText(hD);
		}
		if (x==9) {
			label1.setText(i);
			buttonA.setText(iA);
			buttonB.setText(iB);
			buttonC.setText(iC);				
			buttonD.setText(iD);
		}
		if (x==10) {
			label1.setText(j);
			buttonA.setText(jA);
			buttonB.setText(jB);
			buttonC.setText(jC);				
			buttonD.setText(jD);
		}
	
	
	
	
	}


}