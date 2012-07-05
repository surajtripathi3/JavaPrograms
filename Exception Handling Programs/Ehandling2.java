// using instanceof Operator in Exception catch block...

class Ehandling2
{

public static void main(String s[])
{

try
{
int x=10/s.length;
System.out.println(x);
int z[]=new int[s.length];
z[10]=100;


}
catch(Exception e)
{
if(e instanceof ArithmeticException)
{
System.out.println("math sikh kae aa:");

}

if(e instanceof ArrayIndexOutOfBoundsException)
{
System.out.println(e);

}



}



System.out.println("Exception Handling Successful::");
}

}