import java.util.Scanner;

public class Gcd{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(),b=input.nextInt();
		int x=((a>=b)?a:b);
		int y=((a<b)?a:b);
		int r;
		while(y!=0){
			r=(x%y);
			x=y;
			y=r;
		}
		System.out.printf("최대공약수는 %d",x);
		
	}
}