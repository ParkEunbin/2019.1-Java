import java.util.Scanner;

public class Operators{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		//���迬����
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//��������
		System.out.println((a==3)&&(b==4));
		System.out.println((a==b)||(b==4));
		System.out.println(!(a==b));
		
		//���׿�����
		System.out.println("���� ū �� �� "+((a>b)?a:b)+"�Դϴ�.");
		
	}
}