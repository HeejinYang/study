import java.util.HashSet;
import java.util.Objects;

public class HashCodeEquals {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("14", "abc"));
		set.add(new Person("21", "asd"));
		set.add(new Person("25", "zxc"));
		set.add(new Person("21", "asd"));
		
		System.out.println("인스턴스 수 : "+ set.size());
		
		for (Person person : set) {
			System.out.println(person.toString() + "\t");
		}
	}
	
}

class Person{
	private String name;
	private String age;
	public Person(String name, String age) {
		this.name = name;
		this.age = age;

	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	public int hashCode() {
	return Objects.hash(name, age);
	}
	
	
	@Override 
	public boolean equals(Object obj) {
		Person n = (Person)obj).name;
		Person a = (Person)obj).age;
		
		if(name.equals(n) && age.equals(a)) 
			return true;
		else
			return false;
	}
	
}