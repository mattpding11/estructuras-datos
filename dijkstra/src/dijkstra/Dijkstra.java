
package dijkstra;
import java.util.*;

public class Dijkstra {

    public int distancia [] = new int [10];
    public int costo[][] = new int[10][10];
    
    public void calc(int n, int s){
    
        int flag [] = new int [n+1];
        int i, minpos = 1,k,c, minimun;
        
        for(i = 1; i<= n; i++){
        
            flag[i] = 0;
            this.distancia[i] = this.costo[s][i];
        
        }
        c=2;
        
        while(c<=n){
        
            minimun = 99;
            
            for(k = 1;k<=n;k++){
            
                if(this.distancia[k] < minimun   && flag[k]!=1){
            
            
                minimun = this.distancia[k];
                minpos = k;
            }
            
            }
            
            flag[minpos] = 1;
            c++;
            for(k=1;k<=n;k++){
            
              if(this.distancia[minpos] + this.costo[minpos][k] < this.distancia[k] && flag[k]!= 1)
              
                
                this.distancia[k] = this.distancia[minpos] + this.costo[minpos][k];
             
            }
        
        }
        
    
    }
    
    public static void main(String[] args) {
        
        int nodos, origen, i, j;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite el Numero de Nodos: ");
        nodos = leer.nextInt();
        Dijkstra d = new Dijkstra();
        System.out.println("Digite los Pesos de la Mstriz de Costo: ");
        for(i = 1;i<=nodos;i++){
        for(j = 1; j<= nodos;j++){
        
            System.out.println("Fila "+i+" Costo "+j+" : ");
            if(d.costo[i][j] == 0)
                d.costo[i][j] = 999;
        
        }
        }
        System.out.print("Digite el vertice de origen: ");
        origen = leer.nextInt();
        
        d.calc(nodos, origen);
        System.out.println("Camino mas Corto desde el Origen\t"+origen+"\t a todos los demas vertices es: \n");
        for(i = 1; i<= nodos;i++){
        
            if(i!=origen)
                System.out.println("Fuente: "+origen+"\t deestino: "+i+"\t costo minimo: "+d.distancia[i]+"\t");
        
        }
        
    }
    
}
