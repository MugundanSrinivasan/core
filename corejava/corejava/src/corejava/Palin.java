package corejava;
import java.util.Scanner;
public class Palin
{
public boolean prime(int n)
{
	int c=0;
	int i;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
	}
	if(c==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
public boolean palin(int n)
{
	int rev=0;
	int temp=n;
	while(temp!=0)
	{
		rev=rev*10+(temp%10);
		temp=temp/10;
	}
	if(rev==n)
	{
		return true;
	}
	else
	{
		return false;
	}
}



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Palin p=new Palin();
		int n;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(n=num;n<=100;n++)
		{
			if (p.palin(n)==true && p.prime(n)==true)
			{
				System.out.println(n);
				break;
			}
			break;
		}
		
	}
	

}
