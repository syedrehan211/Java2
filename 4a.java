Class name
{
String name=”swathi”;
Int age = 20;
}
Class Mark extends Name
{
Int m1=30,m2=30,m3=30;
}
Class Student extends Mark
{
Int total;
Void calc(_
{
Total=m1+m2+m3;
}
Void show()
{
System.out.println(“\n NAME: “ +name+”\n AGE:”+age+”\n MARK1=”+m1+”\n MARK2=”+m2+”\n  MARK3=”+m3+”\n TOTAL:”+total);
}
}
Class Multilevelinheritance
{
Public static void main(string args[])
{
Student ob=new student();
Ob.calc();
Ob.show( );
}
}
Output:
NAME: swathi
AGE:20
MARK1=30
MARK2=30
MARK3=30
TOTTAL:90
