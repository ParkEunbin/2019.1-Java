import java.util.Scanner;

public class Yaksu{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.printf("%d의 약수는 ",num);

		for (int i=1;i<=num;i++){
			if((num%i)==0){
				System.out.printf("%d ",i);
			}
		}
	}
}