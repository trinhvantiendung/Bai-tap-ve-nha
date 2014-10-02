package Triagle_main;

public class CheckTriagle {
	public static void main(String[] args) {
		try {
			Triagle triagle = new Triagle(3, 5, 3);
			int i = triagle.CheckTriagle();
			if (i == -1)
				System.out.println("NotATriagle");
			else if (i == 0)
				System.out.println("Scalene");
			else if (i == 1)
				System.out.println("Lsosceles");
			else
				System.out.println("Equilateral");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
