import java.util.Scanner;

public class Save_pay{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int month_pay,totalsave;
		month_pay=input.nextInt();
		totalsave=month_pay*12*10;
		
		System.out.println("Total save Money is "+totalsave+" dallor.");
		
	}
}