import java.util.Scanner;
import java.lang.Math;

public class Rec_Test{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		double len_x,len_y; 
		
		System.out.print("a���� x��ǥ:");
		double x1=input.nextDouble();
		System.out.print("a���� y��ǥ:");
		double y1=input.nextDouble();
		System.out.print("b���� x��ǥ:");
		double x2=input.nextDouble();
		System.out.print("b���� y��ǥ:");
		double y2=input.nextDouble();
		
		if((x1==x2)|(y1==y2)){
			System.out.println("���簢���� �ƴմϴ�.");
		}
		else{
			if((x1<0)^(x2<0)){
				len_x=(Math.abs(x1))+(Math.abs(x2));
			}
			else{
				len_x=Math.abs(x1-x2);
			}
			
			if((y1<0)^(y2<0)){
				len_y=(Math.abs(y1))+(Math.abs(y2));
			}
			else{
				len_y=Math.abs(y1-y2);
			}
			
			System.out.printf("���簢���� �ѷ�: %.1f\n",2*(len_x+len_y));
			System.out.printf("���簢���� ����: %.1f\n",(len_x*len_y));
			System.out.printf("�밢���� ����: %.1f\n",Math.sqrt((len_x*len_x)+(len_y*len_y)));
			
			
		}
	
	}
}