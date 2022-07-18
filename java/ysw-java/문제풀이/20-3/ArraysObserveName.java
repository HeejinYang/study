import java.util.Arrays;

//이진 탐색 이용, 이진탐색전 정렬 필요함
public class ArraysObserveName {

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
	
	
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person)o;
//		
//		if (this.name.equals(p.name)){
//			return 0;
//		}
//		//return this.age - p.age;
//	}
	
	
	//정렬할때 순서 어떻게해야되는지, 탐색할때는 0이 나오게 어떻게 반환해야하는지 고민했는데
	//그냥 String의 compareTo를 호출하면 되는거였다..
	
	//이름으로 탐색하기
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		return this.name.compareTo(p.name);
	}
}

