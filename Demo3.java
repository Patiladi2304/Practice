import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=s.nextInt();
		System.out.println(num);
		
		
		int rem=0;
		while(num!=0) {
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}

}
