package edunova;

public class E01_UvjetnoGranjanjeIf {

	public static void main(String[] args) {

		int i = 7;
		boolean uvjet = i < 7;
		if (uvjet) {
			System.out.println("ok");
		}

		if (i <= 7) {
			System.out.println("ok 2");
		}

		if (i < 7) {
			System.out.println("ok 3");
		} else {
			System.out.println("ok 4");

		}
		if (i == 7)
			System.out.println("ok 5");

		int j = 0, k = 1;

		if (i > 10 & k == 1) {
			System.out.println("ok 7 ");
		}
		if (i > 10 && k == 1) {
			System.out.println("ok 8 ");

		}

		if (i == 1) {
			System.out.println("nedovoljan");
		} else if (i == 2) {
			System.out.println("dovoljan");
		} else if (i == 3) {
			System.out.println("dobar");
		}

		if (i < 7) {
			int t = 3;
			System.out.println("ok12");
			if (t > 3) {
				System.out.println("ok13");
			}

			int a = 12;

			if (a == 12) {
				System.out.println("da");
			} else {
				System.out.println("ne");
			}

			System.out.println(a == 12 ? "da" : "ne");

		}
	}
}
