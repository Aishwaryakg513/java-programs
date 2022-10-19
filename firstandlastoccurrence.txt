import java.util.*;
public class Main
{
    public static void FirstandLastOccurrence(int a[],int x)
    {
        int first=-1, last=-1;
        for(int i=0;i<a.length;i++)
        {
            if(x!=a[i])
             continue;
            if(first == -1)
             first=i;
            last=i;
        }
        if(first!=-1)
        {
            System.out.println("First occurrence: "+first);
            System.out.println("Last occurrence: "+last);
        }
        else{
            System.out.println("elemenst nto found");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int x;
		x=sc.nextInt();
		FirstandLastOccurrence(a,x);
	}
}