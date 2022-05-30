import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term,a=0,b=1,c,i;
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter term");
		  term=scan.nextInt();
		  
		  for(i=1;i<=term;i++)
		  {
			  System.out.println(" "+ a);
			  c=a+b;
			  a=b;
			  b=c;
		  }
		  

	}

}
