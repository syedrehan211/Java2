importjava.lang.*;
class Error2
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
intx,y;
try
{
 x=a/(b-c);
}
catch (ArithmeticException e)
{
System.out.println("division by zero");
}
 y=a/(b+c);
System.out.println("y=" +y);
}
}
Output:
C:\javaprg>javac Error2.java
Error2.java:12:x is already defined in main<java.lang.string [ ] >
Intx = a / < b - c >;
Error2.java:12:x is already defined in main<java.lang.string [ ] >
Int y = a / < b + c >;
2 errors 
C:\javaprg>javac Error2.java
C:\javaprg>java Error2
