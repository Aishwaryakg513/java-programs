import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		int count;
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		    count=1;
		    for(int j=i+1;j<a.length;j++)
		    {
		        if(a[i]==a[j])
		        {
		            count++;
		            a[j]='0';
		        }
		    }
		    if(a[i]!='0'&& count>1)
		    {
		        System.out.println(a[i]);
		    }
		 }
	}
}