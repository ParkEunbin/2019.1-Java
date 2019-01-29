import java.util.Scanner;
import java.lang.Math;

public class Num_Game{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int dap=(int)(Math.random()*100+1);
		
		int userinput=input.nextInt();
		if (dap==userinput){
			System.out.println("성공");
		}
		else{
			if(dap<userinput){
				System.out.println("입력한 값보다 답이 작습니다.");
			}
			else{
				System.out.println("입력한 값보다 답이 큽니다.");
			}
		}
		System.out.println(dap);
	}
}



