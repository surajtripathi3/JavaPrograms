// Using first custom exception...

class Usingcustom
{

int age;
void get(int age)throws AgeException
{
if(age<18)
{

throw new AgeException("Invalid Age");

}
else
{

this.age=age;
}

}

public static void main(String... s)
{

Usingcustom u=new Usingcustom();
try{
u.get(10);
}

catch(AgeException e)
{
System.out.println(e);
}

}

}