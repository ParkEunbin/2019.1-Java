import java.util.Scanner;
import java.lang.Math;

public class Bit_Test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int abs_num,mot,na=0;
		if (num<0){
		abs_num=Math.abs(num);
		System.out.printf("\"%d�� �����Դϴ�.�� ���� ������ %d�̰�,\n",num,abs_num);
		}
		else {
		
			abs_num=num;
			System.out.printf("\"%d�� ����Դϴ�.\n",num);}
	
		mot=(abs_num)>>3;
		System.out.printf("\t�̸� 8�� ���� ���� %d�̰�,\n",mot);
		
		na=(abs_num&7);
		System.out.printf("\t\t�������� %d�Դϴ�.",na);
		
	}
}