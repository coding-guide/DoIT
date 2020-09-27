package exercise.chap11.object;

class Student {
	private int studentID;
	private String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentID ==student.studentID ) return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}
}//Student class

public class ObjectEquals {
	public static void main(String[] args) {
		Student student1 = new Student(20520, "김선례");
		Student student2 = new Student(20520, "김선례");
		// 질문 : student1 와 student2는 같은 학생인가??
//		System.out.println("student1 와 student2는 같은 학생인가?? "+ student1.equals(student2));
		
		// 질문2 : student1 와 student2의 해시코드값도 같은가???
		System.out.println("student1의 hashCode : "+student1.hashCode());
		System.out.println("student2의 hashCode : "+student2.hashCode());

	}//main
}//main class
