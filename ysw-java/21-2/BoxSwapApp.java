
public class BoxSwapApp {

	// 메소드 호출시 T결정, 제네릭 메소드
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
	
		//내방식, 굳이 제네릭타입 인스턴스 만들지 않아도 됐었다
		Box<T> emptyBox= new Box<>(); 
		emptyBox.set(box1.get());
		box1.set(box2.get());
		box2.set(emptyBox.get());
		
		//답지 방식		
//		T temp = box1.get();
//        box1.set(box2.get());
//        box2.set(temp);     

		
		
	}
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(11);
		Box<Integer> box2 = new Box<>();
		box2.set(22);
		
		System.out.println(box1.get()+ " & " + box2.get());
		swapBox(box1,box2);
		System.out.println(box1.get()+ " & "+ box2.get());
		

	}

}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}

