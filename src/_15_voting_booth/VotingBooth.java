package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog(null, "what is your age?");
		int agenumber = Integer.parseInt(age);
		
			JOptionPane.showInputDialog(null, "What presidential candidate do you want to be in office?");
			if(agenumber <18) {
				JOptionPane.showMessageDialog(null, "DID I ASK CHILD??");
			}
			else {
				JOptionPane.showMessageDialog(null, "YOU HAVE A VALID OPINION OF WHICH PRES(DENT SHOULD IN THE NeXT ELECTION ");
			}
	}

}
