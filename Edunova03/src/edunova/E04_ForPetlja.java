package edunova;

public class E04_ForPetlja {
	
	public static void main(String[] args) {
		
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		System.out.print("Osijek,");
		
		System.out.println();
		
		for(int i=0;i<10;i=i+1) {
			System.out.print("Osijek,");
		}
		
		for (int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		for(int i=0;i<10;i=i+1) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i*j+ "");
			}
			System.out.println();
			
		
		}
		
		for (int i=1;i<10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
			}
		
		for (int i=0;i<10;i++) {
			if(i==2) {
				break;}
			}
		vanjska:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				break vanjska;
			}
			
			for(;;) {
				System.out.println(Math.random());
			}
			
			
		
		}
		int suma=0;
		for (int i=1;i<100;i++) {
			suma+=i;
		}
		System.out.println(suma);
		}
		
	}


