import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetChange {
	
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		
		for (Integer i : tr) {
			System.out.println(i);
		}

	}

}

//정렬 기준 바꾸기 Comparator<T> 이용
class IntegerComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
	
}