import java.util.Scanner;

public class Piramid{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
			int num=input.nextInt();
			for (int i=1;i<=num;i++){
				for(int j=i;j<num;j++){
					System.out.printf(" ");
				}
				for(int j=1;j<=(2*i-1);j++){
				System.out.printf("*");
			}
				System.out.printf("\n");
			}
		}
	}
