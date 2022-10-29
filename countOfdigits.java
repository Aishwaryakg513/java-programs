import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n;
	    int rev;
	    int count=0;
	    n = sc.nextInt();
	    while(n>0)
	    {
	      rev = n%10;
	      count++;
	      n=n/10;
	    }
	    System.out.println(count);
	}
}