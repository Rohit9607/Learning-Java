package Assignment;
import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=sc.nextInt();
		
		int count=0;
		
		while (num>0){
			num=num/10;
			count++;
		}
		
		System.out.println("Number of digits :"+count);
		
	}

}
