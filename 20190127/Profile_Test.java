import java.util.Scanner;

public class Profile_Test{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		
		int age =input.nextInt();
		input.nextLine();
		String job=input.nextLine();
		
		System.out.println("�� �̸��� "+name+"�̰� ���̴�"+age+"�� �̰� ������ "+job+"�Դϴ�.");
	}
}

//�̸� ���� ����
//���ͷ� �Է¹��� �� ���ڿ��� �ڿ� �ޱ����ؼ��� ���͸� �׳� �޾��ֵ��� �Ѵ�(�Է¹���)