import java.util.Scanner;
import java.lang.Math;

public class Rec_Test{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		double len_x,len_y; 
		
		System.out.print("a점의 x좌표:");
		double x1=input.nextDouble();
		System.out.print("a점의 y좌표:");
		double y1=input.nextDouble();
		System.out.print("b점의 x좌표:");
		double x2=input.nextDouble();
		System.out.print("b점의 y좌표:");
		double y2=input.nextDouble();
		
		if((x1==x2)|(y1==y2)){
			System.out.println("직사각형이 아닙니다.");
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
			
			System.out.printf("직사각형의 둘레: %.1f\n",2*(len_x+len_y));
			System.out.printf("직사각형의 넓이: %.1f\n",(len_x*len_y));
			System.out.printf("대각선의 길이: %.1f\n",Math.sqrt((len_x*len_x)+(len_y*len_y)));
			
			
		}
	
	}
}