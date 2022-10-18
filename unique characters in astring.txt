import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();
		String s;
		s = sc.nextLine();
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		    set.add(a[i]);
		}
		System.out.println(set);
	}
}
