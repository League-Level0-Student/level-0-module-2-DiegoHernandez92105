package _06_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;
public class Lottery_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		ran.nextInt();
		int num = 0;
		for(int i=0; i<5; i++) {
		num = ran.nextInt((5 - 1)+1);
		if(num == 1) {
			JOptionPane.showMessageDialog(null, num);
		}
		else if(num == 2) {
			JOptionPane.showMessageDialog(null, num);
		}
		else if(num == 3) {
			JOptionPane.showMessageDialog(null, num);
}
		else if(num == 4) {
			JOptionPane.showMessageDialog(null, num);
}
		else if(num == 5) {
			JOptionPane.showMessageDialog(null, num);
}
		}
	}

}
