import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortApp {

	public static void main(String[] args) {
		List<ECar> carList = new ArrayList<>();
		carList.add(new ECar("firstCar", 40, 10));
		carList.add(new ECar("secondCar", 50, 20));
		carList.add(new ECar("thirdCar", 10,40));
		
		//add안에 인스턴스 넣어야되는데 생성자처럼 만드려해서 오류났다
		//carList.add("thirdCar", 40,40);
		
		System.out.println(carList);
		
		Collections.sort(carList);
		
		//가스양 기준 정렬하기
		System.out.println(carList);
	}

}

class Car implements Comparable<Car>{
	protected String carName;
	protected int gas;
	
	
	public Car(String name, int gas) {
		this.gas = gas;
		this.carName = name;
	}
	
	@Override
	public String toString() {
		return carName + ", left gas amount : " + gas + "\n";
	}
	
	//가스 양 기준 오름차순으로 정렬
	@Override
	public int compareTo(Car c) {
		return this.gas - c.gas;
	}
	
}


//Car를 상속하기 때문에 Comparable<Car>를 간접 구현한다.
//따라서 Collections의 sort메소드 호출 가능
//	sort메소드
//	public static <T extends Comparable<? super T>> sort(List<T> list);
class ECar extends Car{
	private int elec;
	
	public ECar(String name, int gas, int elec) {
		super(name,gas);
		this.elec = elec;
	}
	
	@Override
	public String toString() {
		return carName + ", left gas amount : " + gas + " left elec aount : " + elec + "\n";
	}
	
	
}


