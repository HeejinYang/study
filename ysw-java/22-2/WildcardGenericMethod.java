
public class WildcardGenericMethod {

	public static <T> boolean compBox(Box<? extends T> box, T con) {
		T tem;
		tem = box.get();
//		if(tem.equals(con)) {
//			return true;
//		}
//		return false;

		// 더 간단한 방법
		return tem.equals(con);

	}

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<String> box2 = new Box<>();
		box2.set("Poly");

		if (compBox(box1, 25)) {
			System.out.println("상자 안에 25 저장");
		}
		if (compBox(box2, "Moly")) {
			System.out.println("상자 안에 Moly 저장");
		}

		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}

//class Box<T> {
//	private T ob;
//
//	public void set(T o) {
//		ob = o;
//	}
//
//	public T get() {
//		return ob;
//	}
//}
