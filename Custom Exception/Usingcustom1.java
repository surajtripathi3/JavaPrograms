// using second Custom Exception....


class Usingcustom1
{

int age;
void get(int age)throws AgeException1
{
if(age<18)
{

throw new AgeException1("Invalid Age");

}
else
{

this.age=age;
}

}

public static void main(String... s)
{

Usingcustom1 u=new Usingcustom1();
try{
u.get(10);
}

catch(AgeException1 e)
{
System.out.println(e);
}

}

}