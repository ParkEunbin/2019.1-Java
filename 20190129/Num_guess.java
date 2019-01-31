import java.util.Scanner;

public class Num_guess{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		int jungdap=79,count=1;
		int user;
		
	
		do{
			System.out.print("0~100까지의 정수를 입력하여 답을 맞춰보세요:");
			user=input.nextInt();
			if (jungdap==user){
				System.out.printf("정답입니다.%d번 만에 맞추셨어요!",count);
			}
			else if(jungdap>user){
				System.out.println("정답은 더 큰 수에요.");
			}
			else{
				System.out.println("정답은 더 작은 수에요.");
			}
			count++;
		}while(jungdap!=user);
	}
}