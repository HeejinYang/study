import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


public class HashEqualsAppReview {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("asdf", 13));
		set.add(new Person("asdf", 40));
		set.add(new Person("zxcv", 22));
		set.add(new Person("qwer", 9));
		set.add(new Person("asdf", 40));
		
		//set은 리스트처럼 반복자 이용 안해도 전체 출력 가능
		System.out.println(set);
		System.out.println("size of instance : " + set.size());
	}

}

class Person{
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
	
	
	//해쉬셋의 인스턴스 중복 여부 hashCode와 equals를 이용한다, equals오버라이딩해서 기준 설정가능
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object o) {
		Person p = (Person)o;
		
		//이름이랑 나이 둘다 같을때 인스턴스 같다고 판단
		if((name == p.name) && (age == p.age))
			return true;
		else
			return false;
	}
	
}
