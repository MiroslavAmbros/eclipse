package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	//Susjed kopa septičku jamu. Traži tebe da mu osiguraš odvoz zemlje.
	//Napiši program koji za unesene podatke izračunava koliko
	//kubika zemlje treba odvesti.

public static void main(String[] args) {
	
	float a = Float.parseFloat(
			JOptionPane.showInputDialog("dužina prostorije")
);
	
	float b = Float.parseFloat(
			JOptionPane.showInputDialog("širina prostorije")
			);
	float c= Float.parseFloat(JOptionPane.showInputDialog("dubina")
			);
	
	
	double d=a*b*c;
	System.out.println(d);
}
}
