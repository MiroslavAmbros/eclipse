package edunova;

import javax.swing.JOptionPane;

public class E02_uvjetnoGranjanjeSwitch {

	public static void main(String[] args) {

int ocjena=2;

switch(ocjena) {
case 1:System.out.println("nedovoljan");
break;
case 2: System.out.println("dovoljan");
break;
case 3: System.out.println("dobar");
break;
case 4: System.out.println("vrlodobar");
break;
case 5: System.out.println("odican");
break;
}

int ulaz= Integer.parseInt(JOptionPane.showInputDialog("odaberi akciju \n1 zbrajanje \n2 djelenje"));

switch (ulaz) {
case 1:
	int b1=2;
	int b2=3;
			System.out.println(b1+b2);
	break;
case 2:
}
	}
}
