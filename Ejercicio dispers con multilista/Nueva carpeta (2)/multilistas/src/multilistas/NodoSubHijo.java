
package multilistas;

public class NodoSubHijo 
{
    private String info;
    private NodoSubHijo abajo;
    
    public NodoSubHijo()
    {
        abajo = null;
    }
    public NodoSubHijo(String info)
    {
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
    public NodoSubHijo getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoSubHijo abajo)
    {
        this.abajo = abajo;
    }
    
}
