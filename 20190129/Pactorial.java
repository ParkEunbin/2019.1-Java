import java.util.Scanner;

public class Pactorial{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int i=1, result=1, ago=0;
		while(true){
			result=result*i;
		if(result<ago){
			System.out.printf("%d���� �����÷ο� �߻�.\n",i);
			break;
		}
		System.out.printf("���丮�� ����:%d\n",result);
		ago=result;
		i++;
	}
}
}
//14�̸��� ���� �Է��ؾߵ� ���̻��� overflow