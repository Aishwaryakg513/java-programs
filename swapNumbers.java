import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("The numbers are " + a + " " + b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("Swapped numbers " + a + " " + b);
	}
}
