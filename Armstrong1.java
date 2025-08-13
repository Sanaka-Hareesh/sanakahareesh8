class Armstrong1
{
	public static void main(String args[])
	{
	int a=153,count=0,b=a,rem=0;
	while(a!=0)
	 {
	count++;
	a/=10;
	 }
		a=b;
		while(b>0)
		{
		int avg=b%10;
		rem=rem+(int)Math.pow(avg,count);
		b/=10;
		}
			if(rem==a)
			{
			System.out.println(a +" is Armstrong number");
			}
			else
			{
			System.out.println(a+" notamstrong number");
			}
	}
}