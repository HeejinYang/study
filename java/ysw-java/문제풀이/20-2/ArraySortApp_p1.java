import java.util.Arrays;

//나이순으로 배열 정렬하기
public class ArraySortApp_p1 {

	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("hj", 21);
		arr[1] = new Person("as", 15);
		arr[2] = new Person("ma", 30);
		
		for(Person p : arr) {
			System.out.println(p);
			//toString을 오버라이딩 해놨기때문에 직접 변수에 접근하지 않아도 출력 가능하다!
		}
		
		Arrays.sort(arr);
		
		System.out.println();
		for(Person p: arr) {
			System.out.println(p);
		}

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
		return name + " " + age; 
	}
	
	
	//기준 바꿔서 나이 내림차순으로 정렬하기
	@Override
	public int compareTo(Object o) {
		
		Person p = (Person)o;
		return p.age - this.age ;
	}
	
	
}
