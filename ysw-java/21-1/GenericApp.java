
public class GenericApp {

	public static void main(String[] args) {
		Box<String,Integer > boxSample = new Box<>();
		boxSample.set("heejin", 123);
		//System.out.println(box1.getLeft()+ " and " +box1.getRight() + " in the box");
		
		
		//boxSample.showBox();
		//System.out.println(boxSample);
		
		
		Box<Box<String, Integer>, Box<String,Integer>> bigBox = new Box<>();
		Box<String, Integer> box1 = new Box<>();
		box1.set("box 1",123);
		Box<String, Integer> box2 = new Box<>();
		box2.set("box 2", 456);
		bigBox.set(box1, box2);
		
		//bigBox.getLeft().showBox();
		//bigBox.getRight().showBox();
		 
		System.out.println(bigBox);
		
		
	
		

	}

}
//아 왼쪽 오른쪽 자료형 다른걸로 만드니까 타입 매개변수가 두개이다. 자료형같은거였으면 애초에 멤버 변수만 다른거 만들고 매개변수화 자료형은 한개로 만들었을듯.

class Box<L,R>{
	private L left; //문자
	private R right; //숫자 나중에 넣어야겠다
	
	
	public void setLeft(L left) {
		this.left = left;
	}
	public void setRight(R right) {
		this.right = right;
	}
	
	
	
	//한꺼번에 대입해주기
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	
	public L getLeft() {
		return this.left;
	}
	
	public R getRight() {
		return this.right;
	}
	
	public void showBox() {
		System.out.println(this.left+ " and " +this.right + " in the box");
	}
	
	//toString 이용해서 println에서 바로 인스턴스 대입해서 호출하기
	@Override
	public String toString() {
		return this.left+ " and " +this.right + "\n";
	}
	//신기한게 right은 int인데 자동으로 문자열로 바꿔주나봄
	
}
