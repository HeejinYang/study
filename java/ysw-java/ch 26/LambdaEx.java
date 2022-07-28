
public class LambdaEx {
	//람다와 익명클래스는 비슷하지만 다르다.
	
	public static void main(String[] args) {
				
		Printable prn = (s)->System.out.println(s);
		
		//prn 의 타입을 보고 Printable을 구현한 인스턴스를 참조한다는것을 알수있다.
		//printable에는 print메소드 하나밖에 없기 때문에 print의 정의만 알면된다.
		//s 의 정체가 무엇인지 표시해주고 몸체와 ->로 구분한다.
		//s 는 String인것도 알수있다.
		
		prn.print("this is from lambda");
		
	}

}

interface Printable {
	void print(String s);
}
