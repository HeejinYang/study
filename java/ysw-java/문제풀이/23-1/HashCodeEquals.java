import java.util.HashSet;
import java.util.Objects;

public class HashCodeEquals {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("hj",14));
		set.add(new Person("mj",21));
		set.add(new Person("yd",15));
		set.add(new Person("mj",21));
		
		System.out.println("instance amount "+ set.size());
		System.out.println();
		
		for (Person person : set) {
			System.out.println(person.toString() + "\t");
		}
	}
	
}

class Person{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;

	}
	
	@Override
	public String toString() {
		return name + " " + "age: " + age;
	}
	
	@Override
	public int hashCode() {
	return Objects.hash(name, age);
	}
	
	@Override 
	public boolean equals(Object obj) {
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;
		
		if(name.equals(n) && (age==a)) 
			return true;
		else
			return false;
	}
	
}