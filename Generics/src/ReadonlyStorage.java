import java.util.function.Supplier;

public class ReadonlyStorage<T extends Comparable<? super T>> {
//	extends Supplier<T>>
	
	private T data;

	public ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public boolean isGreater(T x) {
//		T t = new T()
//		x.get();
		return data.compareTo(x) > 0;
	}

	public T getData() {
		return  data;
	}
}