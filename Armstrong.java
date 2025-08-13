class Armstrong
{
	public static void main(String args[])
	{
	int num=153,count=0,temp=num,sum=0;
	while(num>0)
	 {
	   count++;
	   num/=10;
	 }
		num=temp;
		while(num!=0)
		{
		int rem=num%10;
		sum=sum+(int)Math.pow(rem,count);
		num/=10;
		}
			if(sum==temp)
			{
			System.out.println(sum+" is amstrong");
			}
			else
			{
			System.out.println(temp+" is notamstrong");
			}


			}
	
}