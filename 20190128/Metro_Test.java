//메트로시티의 조건
import java.util.Scanner;

public class Metro_Test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int capital,people,rich;
		System.out.print("수도 입니까?(수도:1/수도아님:0)");
		capital=input.nextInt();
		System.out.print("인구(단위:백만)");
		people=input.nextInt();
		System.out.print("부자의 수(단위:백만)");
		rich=input.nextInt();
		System.out.println("메트로폴리스의 여부:"+(((capital==1)&(people>=100))|(rich>=50)));
		
	}
}