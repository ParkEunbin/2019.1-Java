import java.lang.Math;

public class Math_Test{
	public static void main(String [] args){
	if(args.length !=1){ 
	System.out.printf("사용법: -10이상 10이하의 임의의 정수를 입력하시오.\n"); 
	
	}
	else{
		int num = Integer.parseInt(args[0]);
		int a=(int)(Math.random()*21)-10;
		if(a==num){
			System.out.println("일치");
		}
		else if(Math.abs(a)==Math.abs(num)){
			System.out.println("절댓값만 일치(부호반대)");
		}
		else{
			System.out.println("불일치");
		}
		System.out.printf("값은 %d", a);
	}
	}
}

// Math.random():랜덤0~0.999999 Math.abs():절댓값 Math.sqrt():루트 Math.pow(a,b):a^b