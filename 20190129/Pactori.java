import java.util.Scanner;

public class Pactori{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int end=input.nextInt();
		int total=0;
		for(int i=1;i<=end;i++){
			total=total+i;
		}
		System.out.printf("ÃÑÇÕÀº %d\n",total);
	}
}