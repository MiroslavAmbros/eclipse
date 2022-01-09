package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		float a = Float.parseFloat(
				JOptionPane.showInputDialog("dužina prostorije")
);
		
		float b = Float.parseFloat(
				JOptionPane.showInputDialog("širina prostorije")
				);
		
		
		double c=a*b;
		System.out.println(c);
		
	}
	
	// Program učitava Dužinu i širinu prostoriju
	// Program ispisuje kvadraturu prostorije

}
