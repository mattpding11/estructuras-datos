
package multilistas;

public class NodoFather {
    
    private String info;
    private NodoFather sig;
    private NodoSon abajo;
    private NodoSonPaciente abajo2;
    
    public NodoFather(){
    
        sig = null;
        abajo = null;
        
    }
     public NodoFather(String info){
    
         this.info = info;
         this.sig = null;
         this.abajo = null;
        
    }
     public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info = info;
    }
    public NodoFather getSig()
    {
        return sig;
    }
    public void setSig(NodoFather sig)
    {
        this.sig = sig;
    }
    public NodoSon getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoSon abajo)
    {
        this.abajo = abajo;
    }
    public NodoSonPaciente getAAbajo()
    {
        return abajo2;
    }
    public void setAbajo(NodoSonPaciente aabajo)
    {
        this.abajo2 = abajo2;
    }
}
