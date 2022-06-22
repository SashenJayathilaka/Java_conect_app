import javax.swing.JOptionPane;

public class joptionpane
{
	public static void main(String args[])
	{
		String name = JOptionPane.showInputDialog("Hii, what's your name?");
		
		JOptionPane.showMessageDialog(null , "Hello "+ name);
		
	}
	
}
