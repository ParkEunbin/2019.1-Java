import java.util.Scanner;

public class Multi_Test{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		
		if(((num%2)==0)&((num%3)==0)){
			System.out.println("�Է��� ���� 2�� 3�� ����� �Դϴ�.");
		}
		if(((num%2)==0)|((num%3)==0)){
			System.out.println("�Է��� ���� 2�Ǵ� 3�� ��� �Դϴ�.");
			if(((num%2)!=0)|((num%3)!=0)){
				System.out.println("�Է��� ���� 2�� ����̰ų� 3�� ����ε� �� �� ����� ����� �ƴմϴ�.");
			}
		}
		
	}
}