class arm
{
public static void main(String args[])
{
int num=153,count=0,rev=0,temp=num,sum=0;
while(num>0)
{
count++;
num/=10;
}
int num1=temp;
while(num1>0)
{
int rem=num1%10;
rev=rev*10+rem;
sum=sum+(int)Math.pow(rem,count);

num1/=10;
}
System.out.println(sum);
if(temp==sum)
System.out.println("Armstrong nuber");
else
System.out.println("not Armstrong number");
}
}


/*greatest common factor:
int num=10,num1=15,count=0;
for(int i=1;i<=num&&i<=num1;i++)
{
count++;
if(num%i==0&&num1%i==0)
System.out.println(i);
}
System.out.println(count);
}
}

int num=5,sum=0;
for(int i=1;i<=num;i++)
{
sum=sum+i;
}
System.out.println(sum);

}
}*/











