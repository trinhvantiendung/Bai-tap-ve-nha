package tuan.tutorial;

public class NextDate {
	public static void main(String[] args) {
		
		try {
			CheckNextDate nextDate = new CheckNextDate(31, 12, 2000);
			nextDate.NextDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
