import java.util.Scanner;

public class Right_down{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		for(int i=1;i<=num;i++){
			
			for(int j=1;j<i;j++){
				System.out.printf(" ");
			}
			for(int j=num;j>=i;j--){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}