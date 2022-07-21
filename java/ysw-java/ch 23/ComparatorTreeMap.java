import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class ComparatorTreeMap {
	public static void main(String[] args) {
		// 정렬해서 들어감, 키값은 중복불가, value는 중복 가능
		TreeMap<Integer, String> tree = new TreeMap<>(new AgeComparator());

		tree.put(13, "asdf");
		tree.put(7, "qwer");
		tree.put(36, "zxcv");
		// 자동으로 키를 기준으로 오름차순 정렬.

		// 반복자 이용하기 위한 키값 추출해서 set에 넣기
		Set<Integer> ks = tree.keySet();

		// 반복자이용해서 키를 이용하기
		Iterator<Integer> itr = ks.iterator();

		// 반복자 이용 출력
		while (itr.hasNext()) {
			System.out.print(tree.get((itr.next())) + '\t');
		}

	}

}

//틀림!
//class TreeMapComparator<Integer> implements Comparator<Integer>{
//	public int compare(Integer i1, Integer i2) {
//		return i2.intValue() - i1.intValue();
//	}
//	

//comparator<E>구현하는 클래스는 제네릭 클래스가 아니다!
class AgeComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i2.intValue() - i1.intValue();
	}

}