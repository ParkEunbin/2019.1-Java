//������ ���ϱ�
import java.util.Scanner;

public class CircleArea{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("������:");
		double rad=input.nextDouble();
		final double pi=3.141592;
		
		double area=pi*rad*rad;
		System.out.printf("���� ���̴� %.2f",area);
	}
}