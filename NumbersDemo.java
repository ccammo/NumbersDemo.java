import javax.swing.JOptionPane;
public class NumbersDemo

{
	public static void main(String Args[])
	{
		final int q = 4; 
		//Number of quarts per gallon
		final double quart;
		String quartString;
            quartString = JOptionPane.showInputDialog("Enter number of quarts to convert to Gallon(s))", "Quarts");
				
			quart = Double.parseDouble(quartString);
				JOptionPane.showMessageDialog(null,"You have " + quart / q + " gallons.");
		
	}
}