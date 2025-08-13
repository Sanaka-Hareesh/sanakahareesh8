class prime
{
public static void main(String args[])
{
/*int num=200,fac=1,count=0;
for(int x=1;x<=num/2;x++)
{
if(num%x==0)
{
System.out.println(x);
continue;
}
}
}
}
*/



int num=10,count=0,x;
for(x=num;x>=1;--x)
{
if(num%x==0)
{
count++;
if(count>=1){

System.out.println(x);
}
}
}

}
}