import java.util.Scanner;

public class Test1{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int a,b,total;
		System.out.printf("ù��° ���� ����:");
		a=input.nextInt();
		System.out.printf("�ι�° ���� ����:");
		b=input.nextInt();
		total=a+b;
		System.out.println("number     |decimal    |otcal      |hexadecimal|");
		System.out.printf("number1    |%+11d|%#11o|%#11x|\n",a,a,a);
		System.out.printf("number2    |%+11d|%#11o|%#11x|\n",b,b,b);
		System.out.printf ("sum        |%-+11d|%-#11o|%-#11x|\n",total,total,total);
		
	}
}