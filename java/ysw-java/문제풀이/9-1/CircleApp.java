
public class CircleApp {

	public static void main(String[] args) {
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();

	}

}

class Circle{
	private Point center;
	int r;
	public Circle(int x, int y, int r) {
		center = new Point(x,y);
		this.r = r;
	}
	
	public void showCircleInfo() {
		System.out.print("center of Circle ");
		center.showPointInfo();
		System.out.println("radius : " + r);
		
	}
}

class Point{
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("point : ("+xPos +", "+ yPos+ ")" );
	}
}
