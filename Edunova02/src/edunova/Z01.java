package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		
		byte a = Byte.parseByte(
				JOptionPane.showInputDialog("daj cijeli broj")
				);
		byte b = Byte.parseByte(
				JOptionPane.showInputDialog("daj drugi cijeli broj")
				);
		
	int c = a+b;
	if (c%2==0) {
		System.out.println((c == 2 ? "zagreb" : "osijek"));
	}
		
	}

}
