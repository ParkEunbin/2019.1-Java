import java.util.Scanner;

public class Days_count{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("�� ��:");
		int year = input.nextInt();
		System.out.print("�� ��:");
		int month= input.nextInt();
		if (month==2){
			if((((year%4)==0)&&((year%100)!=0))||((year%400)==0)){
				System.out.printf("%d�� %d���� 29�� ���� �ֽ��ϴ�.",year,month);
			}
			else{
				System.out.printf("%d�� %d���� 28�� ���� �ֽ��ϴ�.",year,month);

			}
		}
		else if((month==4)||(month==6)||(month==9)||(month==11)){
			System.out.printf("%d�� %d���� 30�� ���� �ֽ��ϴ�.",year,month);
		}
		else{
			System.out.printf("%d�� %d���� 31�� ���� �ֽ��ϴ�.",year,month);
		}
	}
}