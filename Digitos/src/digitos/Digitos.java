
package digitos;

import java.util.*;

public class Digitos {

    public static void main(String[] args) {
        
    
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el Numero: ");
        n = sc.nextInt();
        System.out.println("Cantida de digitos: "+cant_digitos(n));
        
       
}
        public static int cant_digitos(int n){

            if(n<10)
                return 1;

            return 1+cant_digitos(n/10);

        }
    
}