package exercise.chap14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("b.txt");
			System.out.println(fi);
		} catch (Exception e) {
			System.out.println(e);
//			e.printStackTrace();
		}
	}

}
