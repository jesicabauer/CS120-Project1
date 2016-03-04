
package project1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.*;
import java.security.*;


public class Fish {
 

	protected String name; 
	
	protected void setName(String newName) {
		File FishNames= new File("FishNames.txt");
		String [] FN = new String[84];
		 
		try{
			Scanner in = new Scanner(FishNames);
			 
			for(int i=0; i<FN.length; i++){
			FN[i]=in.next();
			}
			in.close();
		 
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		 
		SecureRandom myRandom= new SecureRandom();
		int Fish = myRandom.nextInt(83);
		 
		newName = FN[Fish];
		 
		String fishname=JOptionPane.showInputDialog("Your fish is named "+newName+". Would you like to change it?");
		String fn= fishname.toLowerCase();
		 
		switch(fn){
			case "yes":
			newName= JOptionPane.showInputDialog("What is your fish named?");
			break;
			 
			default:
			newName= FN[Fish];
		}
		 
		name = newName; 
	}
	 
	protected String getName() {
		return name; 
	}
 
 

}
