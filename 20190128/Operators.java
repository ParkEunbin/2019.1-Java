import java.util.Scanner;

public class Operators{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		//관계연산자
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//논리연산자
		System.out.println((a==3)&&(b==4));
		System.out.println((a==b)||(b==4));
		System.out.println(!(a==b));
		
		//삼항연산자
		System.out.println("둘중 큰 수 는 "+((a>b)?a:b)+"입니다.");
		
	}
}