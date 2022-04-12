
package vector_datomayor;
import java.util.*;



public class Vector_DatoMayor {

    public static void main(String[] args){
    
    int i,n,t;
    int may = -99999;
    int men = 99999;
    float prom = 0;
    Random ram = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("Cual es el tamaño del vector : ");
    t = sc.nextInt();
    int vec[] = new int[t];
    
    for(i = 0;i<vec.length;i++){
        n = ram.nextInt(9);
        vec[i] = n;
    }
    
    System.out.println();System.out.println("--------- Vector ----------"); System.out.println();
      
    for(i = 0;i<vec.length;i++){
        char c = ' ',c1=',';
        if(i==0){
            c = '[';
        }
        if(i == vec.length-1){
            
            c1 = ']';
        }
        
    System.out.print(c);
    System.out.print(vec[i]);
    System.out.print(c1);
    
 }
        
    System.out.println();System.out.println();
    System.out.println("El digito mayor es: "+mayor(vec,may));
    System.out.println();
    System.out.println("El digito menor es: "+menor(vec,men));
    System.out.println();
    System.out.println("El promedio es: "+promedio(vec,prom));
   
 
    
}
    
   public static int mayor(int vec[], int may){
          
             for(int i = 0;i<vec.length;i++){
            if(vec[i]>may){
                
               may = vec[i];
               
                }
            
            }
             return may;
           
        }
   
   public static int menor(int vec[], int men){
       
       
       for(int i = 0;i<vec.length;i++){
       
           if(vec[i]<men){
           
               men = vec[i];
           
           }
       }
   
   return men;
   
   }
   
   public static float promedio(int vec[],float prom){
   
       float suma = 0;
       for(int i = 0;i<vec.length;i++){
           suma += vec[i];
       }
   
       prom = suma/vec.length;
       return prom; 
   }
    
}