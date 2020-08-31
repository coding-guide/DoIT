package exercise.chap05.mydate;

import java.util.Calendar;

public class MyDate {
	// year, month, day?�� ?��?��?��?���??��(==멤버�??��)?��?��.
	// ?��?��?��?�� �??��?�� 초기?���? ?��주�? ?��?���? 기본값으�? 초기?�� ?��?��. int?��?? 0, boolean?��?? false
	private int year, month, day;
	boolean isValid;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
		if (year >= 1900 && year <= 9999) {
			isValid = true;
		} else {
			isValid = false;
		}
	}// setYear

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
		if (month >= 1 && month <= 12) {
			isValid = true;
		} else {
			isValid = false;
		}
	}// setMonth

	public int getDay() {

		return day;
	}

	public void setDay(int day) {
		// 메서?��?��?�� month�? ?��?��?���? ?��?��?���?�? ?��?��?��?���??��?�� month�? ?��미함
		this.day = day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 1 && day <= 31) {
				isValid = true;
			} else {
				isValid = false;
			}
			break;
		case 2:
			if (day > 1 && day <= 28) {
				isValid = true;
			} else {
				isValid = false;
			}
			break;
		default:
			if (day > 1 && day <= 30) {
				isValid = true;
			} else {
				isValid = false;
			}
		}
	}// setDay

	public MyDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		isValid = true;

	}// ?��?��?��?��?��?��

	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}// ?��?��?�� ?��버로?��

	public void isValidate() {
		if (isValid) {
			System.out.println("?��?��?�� ?��짜입?��?��");
		} else {
			System.out.println("?��?��?���? ?��?? ?��짜입?��?��");
		}
	}

	@Override
	public String toString() {
		if (isValid) {
			return "MyDate [" + year + "?�� " + month + "?�� " + day + "?��]";
		} else {
			return "MyDate [" + year + "?�� " + month + "?�� " + day + "?��]" + "�? ?��?��?���? ?��?? ?��짜입?��?��.";
		}

	}
}
