// using try-catch block and command line arguments...


class Ehandling1
{

public static void main(String s[])
{

try
{
int x= 10/s.length;
System.out.println(x);
int z[]=new int[s.length];
z[10]=100;

}
catch(ArithmeticException e)
{

System.out.println(e);
System.out.println("beta dekh kae value daal:::: phle math sikh kae aa");


}
catch(ArrayIndexOutOfBoundsException e)
{

System.out.println(e);


}
catch(Exception e)
{
System.out.println(e);

}
System.out.println("Exception handling Successful:::");
}

}