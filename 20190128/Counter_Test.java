import java.util.Scanner;

public class Counter_Test{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("�Ͼ� �̸��� ���� �Է�:");
		int num=input.nextInt();
		int a;
		
		a=num/10000;
		if (a==0){}
		else if (a==1){System.out.print("��");}
		else{System.out.printf("%d��",a);}
		
		num=num%10000;
		a=num/1000;
		if (a==0){}
		else if (a==1){System.out.print("õ");}
		else{System.out.printf("%d��",a);}
		
		num=num%1000;
		a=num/100;
		if (a==0){}
		else if (a==1){System.out.print("��");}
		else{System.out.printf("%d��",a);}
		
		num=num%100;
		a=num/10;
		if (a==0){}
		else if (a==1){System.out.print("��");}
		else{System.out.printf("%d��",a);}
		
		num=num%10;
		if (num==0){}
		else{System.out.printf("%d",num);}
		
		
	}
}