//수 두개 받아서 합구하는 테이블 짜기
import java.util.Scanner;

public class Test1{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int a,b,total;
		System.out.printf("첫번째 양의 정수:");
		a=input.nextInt();
		System.out.printf("두번째 양의 정수:");
		b=input.nextInt();
		total=a+b;
		System.out.println("number     |decimal    |otcal      |hexadecimal|");
		System.out.printf("number1    |%+11d|%#11o|%#11x|\n",a,a,a);
		System.out.printf("number2    |%+11d|%#11o|%#11x|\n",b,b,b);
		System.out.printf ("sum        |%-+11d|%-#11o|%-#11x|\n",total,total,total);
		
	}
}
