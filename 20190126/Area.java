import java.util.Scanner;

public class Area{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		double pi=3.14;
		double area;
		int rad= input.nextInt();
		area=pi*pi*rad;
		System.out.println("This circle's area is "+area);
	}
}