interface A
{
void msg1();
default void display()
{
System.out.println("Method of A");
}
}
interface B extends A
{
void msg2();
default void display1()
{
System.out.println("Method of B");
}
}
interface C extends A
{
void msg3();
default void display2()
{
System.out.println("Method of C");
}
}
class D implements B,C
{
public void msg1()
{
System.out.println("Overriding method of interface A");
}
public void msg2()
{
System.out.println("Overriding method of interface B");
}
public void msg3()
{
System.out.println("Overriding method of interface C");
}
}
class Demo
{
public static void main(String [] args)
{
D d = new D();
d.msg1();
d.msg2();
d.msg3();
}
}