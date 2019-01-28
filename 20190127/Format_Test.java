import java.util.Scanner;

public class Format_Test{
	public static void main(String [] args){
		int a = 16;
		
		System.out.printf("%-#10x +%1$d", a, a+100);
		/* -:왼쪽정렬
		#:몇진수 인지 표현
		10:몇자리수 안에 표현할 것인가
		10진수 인경우 +부호는 %뒤에(%+d)*/
	}
}