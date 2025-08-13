class Armstrong
{
public static void main(String args[])
{
int num,count=0,rev=0,sum=0,temp=num;

num=sc.nextInt();
while(num>0)
{



num/=10;
count++;
System.out.println(count);
}
num=temp;
while(num!=0)
{
 rev=num%10;

sum=sum+(int)Math.pow(rev,count);

num/=10;
}

System.out.println(sum);

if(temp==sum)
{
System.out.println("is armstrong number");
}
else
{
System.out.println("is not arm strong number");
}
}
}