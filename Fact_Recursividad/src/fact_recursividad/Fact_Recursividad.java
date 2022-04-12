
package fact_recursividad;
import java.util.*;

public class Fact_Recursividad {

    
   
    public static void main(String[] args) {
       
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el Numero: ");
        n = sc.nextInt();
        System.out.println(n+"! = "+factorial(n));
    }
    public static int factorial(int n){
            
        if(n == 0)
            return 1;
            
        return n*factorial(n-1);    
        
        
          
    
    }
}

