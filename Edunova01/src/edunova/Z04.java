package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	//Program učitava od korisnika cijeli broj. 
	//Program ispisuje true ako je učitani broj paran 
	//ili false ako je učitani broj neparan.
public static void main(String[] args) {
	
	
	int a = Integer.parseInt(
			JOptionPane.showInputDialog("unesi broj")
			);
	
	boolean b =  a%2 == 0;
	System.out.print(b);
}
}
