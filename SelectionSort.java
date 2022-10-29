import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    int smallest = i;
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[smallest]>a[j])
		        {
		            smallest = j;
		        }
		    }
		    int temp = a[smallest];
		    a[smallest]=a[i];
		    a[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i] + " ");
		}
	}
}