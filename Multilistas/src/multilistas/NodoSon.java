
package multilistas;

public class NodoSon {
    
    private String info;
    private NodoSon sig;
    private NodoSon abajo;
    private NodoSonPaciente abajo2;
   
    
    public NodoSon(){
        
        abajo = null;
        abajo2 = null;
        sig = null;
    }
    
    public NodoSon(String info){
    
    this.info = info;
    this.abajo = null;
    this.abajo2 = null;
    
    }
   public void setInfo(String info)
    {
        this.info = info;
    }
   
    public NodoSon getsSig(){
     
         return sig;
     }
    
      public void setSig(NodoSon sig){
     
         this.sig = sig;
     }
      
     public String getInfo()
    {
        return info;
    }
    public NodoSon getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoSon abajo)
    {
        this.abajo = abajo;
    }
    public NodoSonPaciente getAbajo2()
    {
        return abajo2;
    }
    public void setAbajo2(NodoSonPaciente abajo2)
    {
        this.abajo2 =  abajo2;
    
    }
    
}

