import java.util.Scanner;

public class Test2{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		String name;
		int age;
		float weigh;
		
		name=input.next();
		age=input.nextInt();
		weigh=input.nextFloat();
		
		System.out.printf("\"���� �̸��� \'%s\',\n���̴� %#x,\n	�����Դ� %-10.3f�̴�.\"",name,age,weigh);
	}
}