//컬렉션 프레임워크중 ArrayList 간략하게 공부
//생활코딩 참고


import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		String[] ar = new String[3];
		
		ar[0] = "one";
		ar[1] = "two";
		ar[2] = "three";
		
		
		//제네릭을 쓰지 않은 옛날방식
		//배열처럼 요소개수 쓰지 않아도 된다.
		ArrayList al = new ArrayList();
		
		//add 메소드를 이용해서 대입한다.
		al.add("one");
		al.add("two");
		al.add("three");
		
		
		//add메소드에서 매개변수가 Object였기 때문에 값을 꺼낼때는 형변환을 해줘야한다.
		String value = (String)al.get(0);
		System.out.println(value);
		
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {
			System.out.println((String)al.get(i));
		}
		
		System.out.println();
		
		//제네릭을 이용한 방식, 형변환 안해도 된다.
		ArrayList<String> alg = new ArrayList<String>();
		
		alg.add("four");
		alg.add("five");
		alg.add("six");
		
		for(int i = 0; i<alg.size(); i++) {
			System.out.println(alg.get(i));
		}
	}

}
