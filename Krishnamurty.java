class A
{
int a;
void setval(int num)
{
a=num;
}
void krishnamurty()
{
int rem,fact,sum=0,i;
int temp=a;
while(a!=0)
{
rem=a%10;
fact=1;
for(i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
a=a/10;
}
if(sum==temp)
{
System.out.println(temp+" is a Krishnamurty number");
}
else
{
System.out.println(temp+" is not a Krishnamurty number");
}
}
public static void main(String[]args)
{
A obj = new A();
obj.setval(145);
obj.krishnamurty();
}
}