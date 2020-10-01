package exercise.chap12.generic2;

// T타입을 파라미터로 갖는 DataBox클래스
// DataBox클래스를 사용할때 실제로 사용하는 타입을 <>안에 명시해준다.
public class DataBox<T> {
	private T data;
	
	public DataBox(T data) {
		this.data = data; 
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
