import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Random_Math{
	public static void main(String [] args){
		Random rd = new Random();
		double a = rd.nextDouble();
		
		System.out.println(a);
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100));
		
		int b= (int)(Math.random()*10);
		System.out.println(b);

	}
}