1.b. write a java program to implement shift operators in java.
public class operators { 
    public static void main(String[] args) 
    { 
  
        int a = 5; 
        int b = -10; 
  
         
        System.out.println("a<<2 = "+ (a << 2)); 
  
        System.out.println("b>>2 = "+ (b >> 2)); 
  
        System.out.println("b>>>2 = "+ (b >>> 2)); 
    } 
} 

Output :
a<<2 = 20
b>>2 = -3
b>>>2 = 1073741821
