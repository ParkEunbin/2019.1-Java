//��Ʈ�ν�Ƽ�� ����
import java.util.Scanner;

public class Metro_Test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int capital,people,rich;
		System.out.print("���� �Դϱ�?(����:1/�����ƴ�:0)");
		capital=input.nextInt();
		System.out.print("�α�(����:�鸸)");
		people=input.nextInt();
		System.out.print("������ ��(����:�鸸)");
		rich=input.nextInt();
		System.out.println("��Ʈ���������� ����:"+(((capital==1)&(people>=100))|(rich>=50)));
		
	}
}