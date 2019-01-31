import java.util.Scanner;

public class Multi_Test{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		
		if(((num%2)==0)&((num%3)==0)){
			System.out.println("입력한 수는 2와 3의 공배수 입니다.");
		}
		if(((num%2)==0)|((num%3)==0)){
			System.out.println("입력한 수는 2또는 3의 배수 입니다.");
			if(((num%2)!=0)|((num%3)!=0)){
				System.out.println("입력한 수는 2의 배수이거나 3의 배수인데 두 수 모두의 배수는 아닙니다.");
			}
		}
		
	}
}