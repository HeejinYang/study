//가변인자선언 vargs -> 배열이다.
public class VargsApp {
	public static void main(String[] args) {
		Cvargs.showAll(new String[]{"box"});
		Cvargs.showAll("box", "Toy");
	}
		

	

}

class Cvargs{
	
	//가변 인자 선언 : 전달되는 인자의 수에 제한이 없다.
	//배열을 만들어서 전달되는 인자들을 배열에 담는다.
	public static void showAll(String...vargs){
		//length는 메소드가 아니다! 배열의 변수임
		System.out.println("Length: " + vargs.length);
		for(String s : vargs) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}
