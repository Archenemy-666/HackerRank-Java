import java.util.*;

public class loopI
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{	
			int m = n*i;
			System.out.printf("%d x %d = %d%n",n,i,m);
		}
	}
}
		