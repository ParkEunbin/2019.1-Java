import java.util.Scanner;
import java.lang.Math;

public class Num_Game{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int dap=(int)(Math.random()*100+1);
		
		int userinput=input.nextInt();
		if (dap==userinput){
			System.out.println("����");
		}
		else{
			if(dap<userinput){
				System.out.println("�Է��� ������ ���� �۽��ϴ�.");
			}
			else{
				System.out.println("�Է��� ������ ���� Ů�ϴ�.");
			}
		}
		System.out.println(dap);
	}
}



