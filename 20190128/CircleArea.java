//원넓이 구하기
import java.util.Scanner;

public class CircleArea{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("반지름:");
		double rad=input.nextDouble();
		final double pi=3.141592;
		
		double area=pi*rad*rad;
		System.out.printf("원의 넓이는 %.2f",area);
	}
}