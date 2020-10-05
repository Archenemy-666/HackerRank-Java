import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        int N = scan.nextInt();
        if(N % 2 != 0)
        {
            System.out.println("Weird");
        }
        if(N % 2 == 0)
        {
            if((N>=6)&&(N<=20))
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Wot Weird");
            }
        }


    }

}
