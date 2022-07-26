
public class EnumApp {

	public static void main(String[] args) {
		Person p = new Person("asdf", "man");
		
		System.out.println(p);
	}

}

class Person {
	private String name;
	private Gender gen;

	// enum을 Enum으로 써서 에러났다..
	// Enum Gender{
	// MALE, FEMALE
	// }

	enum Gender {
		MALE, FEMALE
	}

	public Person(String n, String g) {
		name = n;
		if (g.equals("man")) {
			gen = Gender.MALE;
		} else
			gen = Gender.FEMALE;

	}

	@Override
	public String toString() {
		if (gen == Gender.MALE)
			return "Hi Mrs " + name;
		else
			return "Hi Ms " + name;

	}

}