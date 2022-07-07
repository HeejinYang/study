//문제 20-1
import java.util.Random;
import java.util.Scanner;

public class RandomMake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first number");
		int A = sc.nextInt();

		System.out.println("enter the second number");
		int Z = sc.nextInt();

		int i = 0;

		int big = 0;
		int small = 0;

		if (A < Z) {
			small = A;
			big = Z;
		} else {
			small = Z;
			big = A;
		}

		int num = 0;
		Random rand = new Random();

//내가 한 방식
//		while (i < 5) {
//			num = rand.nextInt(big);
//			if (small <= num) {
//				System.out.println(num);
//				i++;
//			}
//		}
		
//답지방식
		while(i<5) {
			num = small;
			num += rand.nextInt(big-small+1);
			System.out.println(num);
			i++;
		}

	}
}
