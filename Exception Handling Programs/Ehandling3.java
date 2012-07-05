// Nested try-catch blocks...
// Imp. = to do different task on different Exceptions...

class Ehandling3
{

public static void main(String s[])
{

try
{

try
{
int x=10/s.length;
System.out.println(x);

}
catch(ArithmeticException e)
{

System.out.println(e);

}

try
{
int z[]=new int[s.length];
for(int i=0;i<=s.length;i++)
{
z[i]=10;

}}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
catch(Exception e)
{
System.out.println(e);

}

System.out.println("Exception Handling Successful::");
}


}


