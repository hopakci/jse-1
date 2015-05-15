package cmm04.arwy;

public class GugudanVO {
	public static void calc() {
		int dan = 2;
		int i = 1;

		for (i = 1; i <= 10; i++) {
			System.out.println(" ");
			for (dan = 2; dan <= 6; dan++) {
				System.out.print(i + "*" + dan + "=" + i * dan + "\t"); // ctrl+shift+f
			}
		}
		System.out.println(" ");
		for (i = 2; i <= 10; i++) {
			System.out.println(" ");
			for (dan = 6; dan <= 10; dan++) {
				System.out.print(i + "*" + dan + "=" + i * dan + "\t"); // ctrl+shift+f
				}
		 }
	}

}
