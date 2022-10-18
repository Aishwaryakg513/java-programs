import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    set.add(a[i]);
		}
		System.out.print(set);
		
		
	}
}