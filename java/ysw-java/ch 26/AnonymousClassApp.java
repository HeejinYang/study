
public class AnonymousClassApp {
	
	public static void main(String[] args) {
		Paper p = new Paper("asdf");
		Printable prn = p.mkPrinter();
		prn.print();

	}
}


interface Printable {
	void print();
}

class Paper {
	private String contents;

	public Paper(String s) {
		contents = s;
	}


//	public Printable mkPrinter() {
//		
//		//로컬 클래스
//		class Printer implements Printable {
//			public void print() {
//				System.out.println(contents);
//			}
//		}
//
//		return new Printer();
//	}
	
	//익명클래스로 만듦, 클래스의 정의를 더 깊게 숨길수있다.
	public Printable mkPrinter() {
		return new Printable() { 
			//Printable을 구현한 클래스의 몸체가 온다.
			public void print() {
				System.out.println(contents);
			}
		};
}


}