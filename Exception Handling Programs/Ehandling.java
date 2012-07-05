// basic programming in try block .....

class Ehandling
{

public static void main(String... s)
{

try
{
int x=10/0;
System.out.println(x);

}
catch(ArithmeticException e)
{
System.out.println(e);
}


System.out.println("Exception Handling Successful :::");

}



}