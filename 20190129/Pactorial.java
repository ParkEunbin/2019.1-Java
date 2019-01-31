import java.util.Scanner;

public class Pactorial{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int i=1, result=1, ago=0;
		while(true){
			result=result*i;
		if(result<ago){
			System.out.printf("%d에서 오버플로우 발생.\n",i);
			break;
		}
		System.out.printf("팩토리얼 값은:%d\n",result);
		ago=result;
		i++;
	}
}
}
//14미만의 값을 입력해야됨 그이상은 overflow