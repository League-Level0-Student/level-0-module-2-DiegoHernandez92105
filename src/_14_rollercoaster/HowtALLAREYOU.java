package _14_rollercoaster;

import javax.swing.JOptionPane;

public class HowtALLAREYOU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog(null, "How tall are you?");
		System.out.println(height);
		int heightnumber = Integer.parseInt(height);
		if(heightnumber > 48) {
			JOptionPane.showMessageDialog(null, "you are too tall to ride the rollercoaster");
		}
		else{
			JOptionPane.showMessageDialog(null, "you are tall enough to ride the rollercoaster");
		}
		
	}

}
