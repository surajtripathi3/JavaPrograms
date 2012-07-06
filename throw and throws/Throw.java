// Using "throw" keyword with Existing Exception Class to print our message...

class Throw
{
int age;
void get(int age)
{
if(age <18)
try
{
throw new ArithmeticException("Invalid Age:");
}
catch(ArithmeticException e)
{
System.out.println(e);

}

}




public static void main(String... s)
{
Throw t= new Throw();
t.get(10);


}
} 