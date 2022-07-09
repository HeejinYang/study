
public class WildcardDemo {

	//와일드 카드를 이용한 메소드, 와일드카드의 상한제한, 하한제한 이용
	public static void addBox(Box<? extends Integer> box1, Box<? extends Integer> box2, Box<? super Integer> result) {
		result.set(box1.get()+box2.get());
	}
	
	
	// extends Number로 해서 틀렸다. 아직 왜안되는지 정확하게 모르겠다..
//	public static void addBox(Box<? extends Number> box1, Box<? extends Number> box2, Box<? super Integer> result) {
//		result.set(box1.get()+box2.get());
//	}
	
	
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<Integer> box2 = new Box<>();
		box2.set(37);
		
		Box<Integer> result = new Box<>();
		result.set(0);
		
		addBox(box1, box2, result);
		System.out.println(result.get());
		

	}

}

class Box<T>{
	private T ob;
	public void set(T o){
		ob = o;
	}
	public T get() {
		return ob;
	}
	
//이거는 T에 String 올때 쓴다.
//	@Override
//	public String toString() {
//		return ob.toString();
//	}
}


