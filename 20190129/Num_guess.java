import java.util.Scanner;

public class Num_guess{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		int jungdap=79,count=1;
		int user;
		
	
		do{
			System.out.print("0~100������ ������ �Է��Ͽ� ���� ���纸����:");
			user=input.nextInt();
			if (jungdap==user){
				System.out.printf("�����Դϴ�.%d�� ���� ���߼̾��!",count);
			}
			else if(jungdap>user){
				System.out.println("������ �� ū ������.");
			}
			else{
				System.out.println("������ �� ���� ������.");
			}
			count++;
		}while(jungdap!=user);
	}
}