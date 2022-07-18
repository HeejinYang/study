import java.util.Arrays;

//이진 탐색 이용, 이진탐색전 정렬 필요함
public class ArrayObserveAge {

	public static void main(String[] args) {
		
		Person[] o = new Person[3];
		int idx = 0;
		
		o[0] = new Person("qwer", 10);
		o[1] = new Person("asdf", 33);
		o[2] = new Person("zxcv", 21);
		
		
		//탐색하기전 정렬해야한다.
		Arrays.sort(o);

		
//		for(int i = 0; i<o.length; i++) {
//			System.out.println(o[i]);
//		}
//		
		
		for(Person p: o) {
			System.out.println(p);
		}
		
		System.out.println();
		
		
		idx = Arrays.binarySearch(o, new Person("qwer", 33));
		
		System.out.println(o[idx]);

	}

}

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	

	//나이에 따라 정렬하고 탐색에도 사용된다. 
	//반환값이 0일때 탐색 성공.
	//이진탐색 전 정렬해야하는데 정렬기준은 탐색할땐 중요하지 않은것같다. 같을때 return 값이 0이기만 하면 탐색은 상관없는것같다.
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		//호출한 녀석이 크면 양수 반환, 인스턴스의 변수중 나이순으로 정렬하기 위한 메소드
		return this.age - p.age;
	}

}

