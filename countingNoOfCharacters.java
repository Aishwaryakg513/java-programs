//Counting the number of characters in a string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s;
	    s = sc.nextLine();
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if((s.charAt(i))!=' ')
	        {
	            count++;
	        }
	    }
	    System.out.println(count);
	    
	}
}