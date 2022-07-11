import java.util.Scanner;

public class CarConstructor {
	public static void main(String[] args) {
		
		int carNum=0;
		System.out.println("choose which car do you want and enter please.");
		System.out.println("1.Gasoline Car");
		System.out.println("2.Hybrid Car");
		System.out.println("3.electric Car");
		Scanner sc = new Scanner(System.in);
		carNum = sc.nextInt();
		
		
		//인스턴스 미리 안만들고 조건 만족시에 생성하는 방법 없나?
		//제네릭 이용하면 될것같은데?
		//더 생각해봐야겠다.
		Car gCar;
		HybridCar hCar;
		HybridWaterCar hwCar;
		
		
		if(carNum==1) {
			System.out.println("You chose Gasoline Car.");
			System.out.println("enter the gas amount.");
			gCar=new Car(sc.nextInt());
			
			gCar.getGauge();
		}
		
		if(carNum==2) {
			System.out.println("You chose Gasoline Car.");
			System.out.println("enter the gas amount.");
			hCar=new HybridCar(sc.nextInt(), sc.nextInt());
			
			hCar.getGauge();
		}
		
		if(carNum==3) {
			System.out.println("You chose Gasoline Car.");
			System.out.println("enter the gas amount.");
			hwCar=new HybridWaterCar(sc.nextInt(), sc.nextInt(), sc.nextInt());
			
			hwCar.getGauge();
		}
		
	}

}

class Car{
	protected int gasolineGauge;
	
	public Car(int gasInput) {
		gasolineGauge = gasInput;
	}
	
	public void getGauge() {
		System.out.println(gasolineGauge);;
	}
}

class HybridCar extends Car{
	protected int electricGauge;
	
	public HybridCar(int gasInput, int electricInput) {
		super(gasInput);
		electricGauge = electricInput;
	}
	
	@Override
	public void getGauge() {
		System.out.println(gasolineGauge + " " + electricGauge);
	}
	
	
}

class HybridWaterCar extends HybridCar{
	protected int waterGauge;
	
	public HybridWaterCar(int gasInput, int electricInput, int waterInput) {
		super(gasInput, electricInput);
		waterGauge=waterInput;
	}
	
	@Override
	public void getGauge() {
		System.out.println(gasolineGauge + " "+ electricGauge+ " " + waterGauge);
	}
	
}
