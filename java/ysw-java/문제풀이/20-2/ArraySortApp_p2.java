import java.util.Arrays;

//이름 길이순으로 배열 정렬하기
public class ArraySortApp_p2 {

	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("apple", 21);
		arr[1] = new Person("watermelon", 15);
		arr[2] = new Person("orange", 30);

		for (Person p : arr) {
			System.out.println(p);
			// toString을 오버라이딩 해놨기때문에 직접 변수에 접근하지 않아도 출력 가능하다!
		}

		Arrays.sort(arr);

		System.out.println();
		for (Person p : arr) {
			System.out.println(p);
		}

	}

}

class Person implements Comparable {
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

	//이름 길이순 오름차순으로 정렬하기
	//이름길이 얻으려면 String클래스의 length()메소드 이용
	@Override
	public int compareTo(Object o) {

		Person p = (Person) o;
		return name.length() - p.name.length();
	}

}