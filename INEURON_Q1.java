
class Spaces
{
	void code()
	{
		for(int j=0;j<1;j++)
		{
			System.out.print("  ");
		}
	}
}
public class INEURON_Q1 {

	public static void main(String[] args) 
	{
		int i,j,n=19;
		Spaces obj=new Spaces(); 
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0 || (i==n/2 && j<=n/2) || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if((j==0 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j!=n-1) || (i==n/2 && j!=n-1) || (i==j && i>n/2)  || (j==n-1 && i<=n/2 && i!=0 && i!=n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if((i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			obj.code();
			for(j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
