import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		double num1,num2;
		String oper;
		
		System.out.print("두 수 입력:");
		num1=input.nextDouble();
		num2=input.nextDouble();
		
		System.out.print("연산자:");
		oper=input.next();
		double result;
		switch(oper){
			case "+":
				result = num1+num2;
				if(result%1==0)	System.out.println((int)result);
				else System.out.printf("%.2f",result);
				break;
			case "-":
				result = num1-num2;
				if(result%1==0)	System.out.println((int)result);
				else System.out.printf("%.2f",result);				
				break;
			case "*":
				result = num1*num2;
				if(result%1==0)	System.out.println((int)result);
				else System.out.printf("%.2f",result);
				break;
			case "%":
				result = num1%num2;
				if(result%1==0)	System.out.println((int)result);
				else System.out.printf("%.2f",result);
				break;
			case "/":
				result = num1/num2;
				if(result%1==0)	System.out.println((int)result);
				else System.out.printf("%.2f",result);
				break;
		}
	}
}