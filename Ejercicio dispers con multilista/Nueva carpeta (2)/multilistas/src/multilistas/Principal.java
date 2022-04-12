package multilistas;
import java.util.Scanner;


public class Principal 
{
    
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
       System.out.println("------------------------");
       System.out.print("Digite cantidad de vértices: ");
       int cant = leer.nextInt();
       System.out.println("------------------------");
       
       Multilistas multilista = new Multilistas();
       multilista.mat_Ady(cant);
       int c=0;
       int Cont=0;
       int Cantidad=cant  ;
       while(Cont < Cantidad )
       {   Cont+=1;
           multilista.agregarNodoPadre(Cont);
           System.out.println("------------------------");
           System.out.println("Ingresó vertice " + Cont);
           
           do
           {
               System.out.print("Digite vértice de adyacencia: ");
               c= leer.nextInt();
               if (c!=-1)
                   
                   multilista.agregarNodoHijo(Cont, c);
                    multilista.llenarMat(Cont, c);
           }
           while(c !=-1);
        }
//     
       
      System.out.println("------------------------");
      System.out.println("MULTILISTA");
       System.out.println("------------------------");
       multilista.mostrarMultiLista();
       System.out.println("------------------------");
      System.out.println("MATRIZ DE ADYACENCIA");
       System.out.println("------------------------");
       multilista.mostrar();
       System.out.println("------------------------");
        for(int i =1; i<=cant; i++)  
        {
            multilista.verticesAdy(i);
        }
                
        System.out.println("Very easy");
    }
    
}
