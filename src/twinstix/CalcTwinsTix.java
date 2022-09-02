package twinstix;
import javax.swing.JOptionPane;

public class CalcTwinsTix {
	public static void main(String[] args) {
		String amount;
		amount = JOptionPane.showInputDialog(null, "How Many Twins Tickets?");
		final int TICKET = 75;
		final int PROCESS = 20;
		final double TAX = 1.07;
		int amountnumber = Integer.parseInt(amount);
		double cost = TICKET*amountnumber + PROCESS;
		double withtax = cost * TAX;
		
		JOptionPane.showMessageDialog(null, "Your tickets cost $" + withtax);
	
	}

}
