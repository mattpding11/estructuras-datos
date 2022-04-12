
package potencia_producto;


    class Potencia{
        
        public long elevar(int base, int exponente){
            
            long res =1;
            base =2;
            exponente =  5;
          
            
            for(int i=0;i<exponente;i++){
                
                res*=base;
            }
            return res;
            
            
        }
    
    }
    
    
    public class Potencia_Producto {  
        
    public static void main(String[] args) {
        
        Potencia num = new Potencia();
        System.out.println(num.elevar(2, 03)+"\n");
    System.out.println(num.elevar(2, 9)+"\n");
        
    }
    
    }
