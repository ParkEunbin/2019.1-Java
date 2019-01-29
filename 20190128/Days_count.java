import java.util.Scanner;

public class Days_count{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("몇 년:");
		int year = input.nextInt();
		System.out.print("몇 월:");
		int month= input.nextInt();
		if (month==2){
			if((((year%4)==0)&&((year%100)!=0))||((year%400)==0)){
				System.out.printf("%d년 %d월은 29일 까지 있습니다.",year,month);
			}
			else{
				System.out.printf("%d년 %d월은 28일 까지 있습니다.",year,month);

			}
		}
		else if((month==4)||(month==6)||(month==9)||(month==11)){
			System.out.printf("%d년 %d월은 30일 까지 있습니다.",year,month);
		}
		else{
			System.out.printf("%d년 %d월은 31일 까지 있습니다.",year,month);
		}
	}
}