// Finally block....Imp. to know..
// Automatically killing Arithmetic Exception...


class Ehandling5
{
static int show()
{

try
{
int x=10/0;
System.out.println(x);
return 20;

}
catch(ArrayIndexOutOfBoundsException e)
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


