
package producto_recursivo;

import java.util.*;

public class Producto_Recursivo {

    
    public static void main(String[] args) {
       int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el Primer Digito: ");
       a = sc.nextInt();
       System.out.print("Ingrese el Segundo Digito: ");
       b = sc.nextInt();
       System.out.println(a+"*"+b+" = "+mult(a,b));
       
       
       
    }
    
    public static int mult(int a, int b){
    
        if(b==0)
            return 0;
        
        return a + mult(a,b-1);
    }
}
