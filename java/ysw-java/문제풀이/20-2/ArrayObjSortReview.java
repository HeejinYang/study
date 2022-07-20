//복습
import java.util.Arrays;

public class ArrayObjSortReview {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("asdfq", 12);
		ar[1] = new Person("zxcv", 25);
		ar[2] = new Person("qwe", 4);
		
		for(Person o: ar) {
			System.out.println(o);
		}
		
		System.out.println();
		
		Arrays.sort(ar);
		
		for(Person o: ar) {
			System.out.println(o);
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
		return this.name + " : " + this.age;
	}
	
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		//나이순 정렬
		return age - p.age;
		
		//이름 길이순 정렬
		//return name.length() - p.name.length();
		
		//이름 사전순 정렬
		//return name.compareTo(p.name);
	}
	
}
