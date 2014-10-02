package tuan.tutorial;

public class CheckNextDate {
	private int Nhuan[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int Thuong[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int day;
	private int month;
	private int year;
	private int nextDay;
	private int nextMonth;
	private int nextYear;

	public CheckNextDate(int day, int month, int year) throws Exception {
		if (day > 31 || day < 0 || month < 0 || month > 12 || year < 0)
			throw new Exception("Du lieu khong hop le");
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void NextDate() {
		if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
			if (day == Nhuan[month]) {
				nextDay = 1;
				nextMonth = month + 1;
			} else {
				nextDay = day + 1;
				nextMonth = month;
			}
			if (day == Nhuan[month] && month == 12) {
				nextMonth = 1;
				nextYear = year + 1;
			} else if(month == 12)
				nextYear = year + 1;
			else{
				nextYear = year;
			}
			System.out.println("The next Day: " + nextDay + "/" + nextMonth
					+ "/" + nextYear);
		} else {
			if (day == Thuong[month]) {
				nextDay = 1;
				nextMonth = month + 1;
			} else {
				nextDay = day + 1;
				nextMonth = month;
			}
			if (day == Thuong[month] && month == 12) {
				nextMonth = 1;
				nextYear = year + 1;
			} else if(year == 12)
				nextYear = year + 1;
			else {
				nextYear = year;
			}
			System.out.println("The next Day: " + nextDay + "/" + nextMonth
					+ "/" + nextYear);
		}
	}

}
