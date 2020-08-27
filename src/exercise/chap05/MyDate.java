package exercise.chap05;

import java.util.Calendar;

public class MyDate {
	// year, month, day는 인스턴스변수(==멤버변수)이다.
	// 인스턴스 변수는 초기화를 해주지 않으면 기본값으로 초기화 된다. int형은 0, boolean형은 false
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
		// 메서드안에 month를 선언하지 않았으므로 인스턴스변수인 month를 의미함
		this.day = day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day>1 && day<=31) {
				isValid = true;
			}else {
				isValid = false;
			}
			break;
		case 2:
			if(day>1 && day<=28) {
				isValid = true;
			}else {
				isValid = false;
			}
			break;
		default:
			if(day>1 && day<=30) {
				isValid = true;
			}else {
				isValid = false;
			}
		}
	}// setDay

	public MyDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		isValid = true;

	}// 디폴트생성자

	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}// 생성자 오버로드

	public void isValidate() {
		if (isValid) {
			System.out.println("유효한 날짜입니다");
		} else {
			System.out.println("유효하지 않은 날짜입니다");
		}
	}

	@Override
	public String toString() {
		if (isValid) {
			return "MyDate [" + year + "년 " + month + "월 " + day + "일]";
		} else {
			return "MyDate [" + year + "년 " + month + "월 " + day + "일]"+"로 유효하지 않은 날짜입니다.";
		}

	}
}
