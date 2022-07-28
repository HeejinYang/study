
public class NestedMemberApp {

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

//	public Printable Printer() {
//		
//		class mkPrinter implements Printable{
//			public void print() {
//				System.out.println(contents);
//			}
//		}
//		
//		return new mkPrinter();
//	}

	public Printable mkPrinter() {
		
		//로컬 클래스
		class Printer implements Printable {
			public void print() {
				System.out.println(contents);
			}
		}

		return new Printer();
	}

}
