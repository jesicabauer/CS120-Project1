package project1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MoveTest extends JFrame {

		private static final long serialVersionUID = 1L;
		private JLabel myFish01 = new JLabel();
		private JLabel myFish02 = new JLabel();
		private JLabel myFish03 = new JLabel();
		private boolean isBackwards = false; 
		private boolean isRunning = true; 
		Color myColor = Color.decode("#63D1F4"); 
	
	public MoveTest() { // constructor

		setSize(575,400);
		Container myContentPane = getContentPane();
	    myContentPane.setLayout(null);
	    myContentPane.setBackground(myColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon myFish1 = new ImageIcon("orange-g.png");
		ImageIcon myFish2 = new ImageIcon("gold-a-1.png"); 
		ImageIcon myFish3 = new ImageIcon("red-b-1.png");
		ImageIcon myFish11 = new ImageIcon("orange-g-1.png");
		ImageIcon myFish22 = new ImageIcon("gold-a.png"); 
		ImageIcon myFish33 = new ImageIcon("red-b.png");
		
		myFish01.setLocation(300,0);
		myFish02.setLocation(250,100);
		myFish03.setLocation(200,200);
		
		myFish01.setSize(100,100);
		myFish02.setSize(100,100);
		myFish03.setSize(100,100);
		
		add(myFish01);
		add(myFish02);
		add(myFish03);

		setVisible(true);
		
		do {
			for (int i = 0; i < 1000 && !isBackwards; i++){
				
				myFish01.setIcon(myFish1);
				myFish02.setIcon(myFish2);
				myFish03.setIcon(myFish3);
				
				if (myFish01.getX() <= 460 && myFish02.getX() >= 0 && myFish03.getX() <= 460) {
				myFish01.setLocation(myFish01.getX()+ 4, myFish01.getY()); 
				myFish02.setLocation(myFish02.getX()- 3, myFish02.getY()); 
				myFish03.setLocation(myFish03.getX()+ 2, myFish03.getY()); 
				} else isBackwards = true;
				try {
					Thread.sleep(50);
		    	} catch (InterruptedException e) {
		    		e.printStackTrace();
		    	}
			}
			
			for (int i = 0; i < 1000 && isBackwards; i++){
				
				myFish01.setIcon(myFish11);
				myFish02.setIcon(myFish22);
				myFish03.setIcon(myFish33);
				
				if (myFish01.getX() >= 3 && myFish02.getX() <= 460 && myFish03.getX() >= 3) {
				myFish01.setLocation(myFish01.getX()-4,myFish01.getY());
				myFish02.setLocation(myFish02.getX()+3,myFish02.getY());
				myFish03.setLocation(myFish03.getX()-2,myFish03.getY());
				} else isBackwards = false; 
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace(); 
				}
			} 
		} while(isRunning);
		
		
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MoveTest test = new MoveTest(); 
		
	} 

}
