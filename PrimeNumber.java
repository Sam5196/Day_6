package Sum;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=scanner.nextInt();
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				
			}
		}
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		

	}

}
