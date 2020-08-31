package exercise.chap05.mydate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		System.out.println(date1);
		MyDate date2 = new MyDate(03, 9, 2020);
		System.out.println(date2);
		date2.setDay(50);
		date2.isValidate();
		date2.setMonth(30);
		date2.setYear(22020);
		System.out.println(date2);
	}

}
