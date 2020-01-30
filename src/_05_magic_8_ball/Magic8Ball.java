//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;
import javax.swing.JOptionPane;
import java.util.Random;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random ran = new Random();
	ran.nextInt();
	// 3. Print out this variable
	System.out.println(ran);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("ask a question");
	// 5. If the random number is 0
	int num = 0;
			num = ran.nextInt((3 - 1)+1);
	if(num == 0) {
		JOptionPane.showMessageDialog(null, "yes");
	}
		else if(num == 1) {
			JOptionPane.showMessageDialog(null,  "no");
		}
	
	else if(num == 2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	else if(num == 3) {
		JOptionPane.showMessageDialog(null, "maybe");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
}
}
