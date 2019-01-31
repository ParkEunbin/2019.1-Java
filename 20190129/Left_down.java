import java.util.Scanner;

public class Left_down{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		for (int i=num;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}