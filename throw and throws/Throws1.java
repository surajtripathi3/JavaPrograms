// Using class Throws..

class Throws1
{
public static void main(String... s)
{
Throws t=new Throws();
try
{
double r=t.divide(10,20);
System.out.println(r);
}
catch(ArithmeticException e)
{
System.out.println(e);

}
}
}