
package multilistas;


public class NodoSonPaciente {
    
      private String info;
      private NodoSonPaciente abajo;
      private NodoSonPaciente sig;
    
    public NodoSonPaciente(){
    
        abajo = null;
        sig = null;
    }
    
    public NodoSonPaciente(String info){
    
    this.info = info;
    this.abajo = null;
    
    }
   public void setInfo(String info)
    {
        this.info = info;
    }
    
     public String getInfo()
    {
        return info;
    }
    public NodoSonPaciente getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoSonPaciente abajo)
    {
        this.abajo = abajo;
    }
}
