import java.lang.Math;

public class Math_Test{
	public static void main(String [] args){
	if(args.length !=1){ 
	System.out.printf("����: -10�̻� 10������ ������ ������ �Է��Ͻÿ�.\n"); 
	
	}
	else{
		int num = Integer.parseInt(args[0]);
		int a=(int)(Math.random()*21)-10;
		if(a==num){
			System.out.println("��ġ");
		}
		else if(Math.abs(a)==Math.abs(num)){
			System.out.println("���񰪸� ��ġ(��ȣ�ݴ�)");
		}
		else{
			System.out.println("����ġ");
		}
		System.out.printf("���� %d", a);
	}
	}
}

// Math.random():����0~0.999999 Math.abs():���� Math.sqrt():��Ʈ Math.pow(a,b):a^b