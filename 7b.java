class BreakandContinue
{
public static void main(String args[])
    {
 //Illustrating break statement (execution stops when value of i becomes to 4.)
System.out.println("Break Statement\n....................");

for(inti=1;i<=5;i++)
        {
if(i==4) break;
System.out.println(i);
        }
 // Illustrating continue statement (execution skipped when value of i becomes to 1.)
System.out.println("Continue Statement\n....................");

for(inti=1;i<=5;i++)
        {
if(i==1) continue;
System.out.println(i);
        }	
    }
}
Output:
Break statement 
…………………………………
1
2
3
Continue statement
……………………….
2
3
4
5
Process finished
