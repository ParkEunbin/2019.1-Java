import java.util.Scanner;

public class Counter_Test{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("일억 미만의 정수 입력:");
		int num=input.nextInt();
		int a;
		
		a=num/10000;
		if (a==0){}
		else if (a==1){System.out.print("만");}
		else{System.out.printf("%d만",a);}
		
		num=num%10000;
		a=num/1000;
		if (a==0){}
		else if (a==1){System.out.print("천");}
		else{System.out.printf("%d만",a);}
		
		num=num%1000;
		a=num/100;
		if (a==0){}
		else if (a==1){System.out.print("백");}
		else{System.out.printf("%d백",a);}
		
		num=num%100;
		a=num/10;
		if (a==0){}
		else if (a==1){System.out.print("십");}
		else{System.out.printf("%d십",a);}
		
		num=num%10;
		if (num==0){}
		else{System.out.printf("%d",num);}
		
		
	}
}