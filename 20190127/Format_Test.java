import java.util.Scanner;

public class Format_Test{
	public static void main(String [] args){
		int a = 16;
		
		System.out.printf("%-#10x +%1$d", a, a+100);
		/* -:��������
		#:������ ���� ǥ��
		10:���ڸ��� �ȿ� ǥ���� ���ΰ�
		10���� �ΰ�� +��ȣ�� %�ڿ�(%+d)*/
	}
}