//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;
import javax.swing.JOptionPane;
import java.util.Random;


public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
for(int i = 0; i<10; i++) {
		// 1. Use each value of randomNumber to give the user a random compliment.
	Random ran = new Random();
	ran.nextInt();
	
	int compliment = 0;
	compliment = ran.nextInt((3 - 0)+1);
	if(compliment == 0) {
		JOptionPane.showMessageDialog(null,"SUP");
	}
	else if(compliment == 1) {
		JOptionPane.showMessageDialog(null,"SUP1");
	}
	else if(compliment == 2) {
		JOptionPane.showMessageDialog(null,"SUP2");
	}
	else if(compliment == 3) {
		JOptionPane.showMessageDialog(null,"SUP3");
	}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}