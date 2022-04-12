
p
        
        
        
        ackage matrizdispersa;
import java.util.ArrayList;

class Nodo{

    private int val,f,c;
    public Nodo sig;
    public Nodo(int val,int f, int c){
    
        this.val = val;
        this.f = f;
        this.c = c;
        this.sig = null;
        
    }
    public int getVal(){
    
        return this.val;
    
    }
    public int getF(){
    
        return this.f;
    }
    public int getC(){
    
        return this.c;
        
    }
}
class Dispersa{

    private Nodo Cab,Fin;
    private ArrayList<ArrayList<Integer>> mat = new ArrayList();
    private int cVal;
    private int cFC;
    public Dispersa(int cVal, int cFC){
    
        int i;
        this.cVal = cVal;
        this.cFC = cFC;
        
        for(i=0;i<cFC;i++){
        
            mat.add(new ArrayList<Integer>());
            
            for(int j = 1;j<=cFC;j++){
            
                mat.get(i).add(0);
            
            }
        }
        
       
    
    }
     public void LlenarDispersa(){
        
            int i = 0,f,c;
            while(i<cVal){
            
                f = (int)(Math.random()*cFC);
                c = (int)(Math.random()*cFC);
                
                if(mat.get(f).get(c)==0){
                
                    mat.get(f).set(c, (int)(Math.random()*100+1));
                    i++;
                
                }
            }
        }
    public void printmatriz(){
    
        for(int f=0;f<cFC;f++){
        
            for(int c = 0;c < cFC;c++){
                
                System.out.print(mat.get(f).get(c) + "\t");
                
            }
           System.out.println();
        }
    }
    
    public void crearLista(){
    
        int f, c;
        for(f = 0;f<cFC;f++){
        
            for(c = 0;c<cFC;c++){
                
                if(mat.get(f).get(c)!=0){
                
                    int v = mat.get(f).get(c);
                     Nodo nodo = new Nodo(v,f,c);
                     if(Cab == null){
                     
                         Cab = nodo;
                         Fin = nodo;
                         
                     }
                     else{
                     
                         Fin.sig = nodo;
                         Fin = nodo;
                     }
                }
            }
        }
    
    }
    
    public void MostrarLista(){
    
        if(Cab != null){
        
            Nodo p;
            p = Cab;
            while(p!=null){
            
                System.out.print("[" + p.getVal() + ", " + p.getF()+", "+p.getC()+"]");
                p = p.sig;
            }
        }
    
    }
    
}
public class MatrizDispersa {

    
    public static void main(String[] args) {
        
       Dispersa dis = new Dispersa(8,6);
       dis.LlenarDispersa();
       dis.printmatriz();
       dis.crearLista();
       dis.MostrarLista();
        
    }
    
}
