import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.println("Give the size of the array: ");
	    n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    System.out.println("Second largest element is " + arr[n-2]);
	}
}
