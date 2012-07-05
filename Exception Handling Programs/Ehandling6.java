// Finally block....Imp. to know..
// Only one condition in which Finally block does not executed....



class Ehandling6
{
static int show()
{

try
{
int x=10/2;
System.out.println(x);
System.exit(0);
return 20;

}
catch(ArithmeticException e)
{

System.out.println(e);
}
finally
{

return 40;

}

}
public static void main(String s[])
{

int x=show();
System.out.println(x);
}
}


