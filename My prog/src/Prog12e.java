import java.util.Scanner;
public class Prog12e
{
public static void main(String[] args)
	{
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int number = addr.nextInt();
	addr.close();
	int power,m,n;
	for (int i=1;i<=number;i++)
	{
		m=i;
		n=2;
		power =(int) Math.pow(m,n);
		System.out.print(power+" ");
	}
	}
}
