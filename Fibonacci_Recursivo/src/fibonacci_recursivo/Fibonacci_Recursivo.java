
package fibonacci_recursivo;
import java.util.*;

public class Fibonacci_Recursivo {

    
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el valor: ");
        n = sc.nextInt();
        System.out.println("Fibonacci de "+n+" es : "+fib(n));
        
        
    }
   public static int fib(int n){
   
       if(n==0)
           return 0;
       if(n==1)
           return 1;
       return fib(n-1)+fib(n-2);
   }
    
}
