package Sum;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		num=scanner.nextInt();
		
		for(i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("is Perfect Number ");
		}
		else {
			System.out.println("is not Perfect number");
		}

	}

}
