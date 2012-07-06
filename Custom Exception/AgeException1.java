  //Second way to make Custom Exception....

class AgeException1 extends Exception
{
String s;
AgeException1(String s)
{

this.s=s;

}

public String toString()
{
return s;

}

}