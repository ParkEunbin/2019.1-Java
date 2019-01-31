import java.util.Scanner;
import java.lang.Math;

public class Bit_Test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int abs_num,mot,na=0;
		if (num<0){
		abs_num=Math.abs(num);
		System.out.printf("\"%d은 음수입니다.이 수의 절댓값은 %d이고,\n",num,abs_num);
		}
		else {
		
			abs_num=num;
			System.out.printf("\"%d은 양수입니다.\n",num);}
	
		mot=(abs_num)>>3;
		System.out.printf("\t이를 8로 나눈 몫은 %d이고,\n",mot);
		
		na=(abs_num&7);
		System.out.printf("\t\t나머지는 %d입니다.",na);
		
	}
}