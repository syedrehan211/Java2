Class ForEach  {
Public static void main (string args[ ] ) {
Intnums [ ] = { 1, 2, 3, 4 , 5 , 6,  7, 8, 9, 10 };
Int sum=0;
For(int x : nums ) {
System.out.println(“value is : “+ x);
Sum += x;
}
System.out.println(“summation: “+sum);
}
}
Output:
Value is : 1
Value is : 2
Value is : 3
Value is : 4
Value is : 5
Value is : 6
Value is : 7
Value is : 8
Value is : 9
Value is : 10
Summation : 55
