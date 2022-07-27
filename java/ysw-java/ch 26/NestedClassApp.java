
public class NestedClassApp {

	public static void main(String[] args) {
		Paper p = new Paper("contents");
		
		
		//mkPrinter()가 무슨 클래스의 인스턴스를 반환하는지 몰라도 되고 Printable을 구현한다는것이 중요하다
		//클래스 정의 숨김?
		//ptr은 Printable에 구현된 메소드만 호출 가능하다
		Printable ptr = p.mkPrinter();
		
		
		ptr.print();

	}

}

interface Printable{
	void print();
}

class Paper{
	private String contents;
	
	public Paper(String s) {
		contents = s;
	}
	
	//멤버클래스 정의
	//private으로 선언되어 Papers클래스 내에서만 이 클래스의 인스턴스 생성 가능하다
	private class Printer implements Printable{
		public void print() {
			System.out.println(contents);
		}
	}
	
	public Printable mkPrinter() {
		return new Printer();
	}
	
}
