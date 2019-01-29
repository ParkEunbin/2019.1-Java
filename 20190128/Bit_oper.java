import java.util.Scanner;

public class Bit_oper{
	public static void main(String args[]){
		int a=0x0fff, b=0xfff0;
			//a=0000111111111111,b=1111111111110000(원래 32bit이나 편의상16bit만 나타냄)
		System.out.printf("a: %8x\n",a);
		System.out.printf("b: %8x\n",b);
		System.out.printf("a&b: %8x\n",(a&b));
		System.out.printf("a|b: %8x\n",(a|b));
		System.out.printf("a^b: %8x\n",(a^b));
		System.out.printf("~a: %8x\n",(~a));
		System.out.printf("a<<4: %8x\n",(a<<4));
		System.out.printf("a>>4: %8x\n",(a>>4));
/*a:      fff
b:     fff0
a&b:      ff0
a|b:     ffff
a^b:     f00f
~a: fffff000
a<<4:     fff0
a>>4:       ff*/

		
	}
}