package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program učitava dva cijela broja i ispisuje njihovu razliku
public static void main(String[] args) {
	
	byte a = Byte.parseByte(
			JOptionPane.showInputDialog("daj cijeli broj")
			);
	byte b = Byte.parseByte(
			JOptionPane.showInputDialog("daj drugi cijeli broj")
			);
	
	System.out.println(a-b);
}
}
