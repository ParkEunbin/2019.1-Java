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
		
		System.out.printf("\"나의 이름은 \'%s\',\n나이는 %#x,\n	몸무게는 %-10.3f이다.\"",name,age,weigh);
	}
}