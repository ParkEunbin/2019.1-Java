import java.util.Scanner;

public class Profile_Test{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		
		int age =input.nextInt();
		input.nextLine();
		String job=input.nextLine();
		
		System.out.println("제 이름은 "+name+"이고 나이는"+age+"살 이고 직업은 "+job+"입니다.");
	}
}

//이름 나이 직업
//엔터로 입력받을 때 문자열을 뒤에 받기위해서는 엔터를 그냥 받아주도록 한다(입력버퍼)