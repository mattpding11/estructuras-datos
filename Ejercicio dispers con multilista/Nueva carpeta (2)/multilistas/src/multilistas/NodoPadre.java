package multilistas;

public class NodoPadre 
{
    private int info;
    private NodoPadre sig;
    private NodoHijo abajo;
    private NodoHijo segundo;
    
    public NodoPadre()
    {
        sig = null;
        abajo = null;
        segundo = null;
    }
    public NodoPadre(int info)
    {
        this.info = info;
        this.sig = null;
        this.abajo = null;
        this.segundo = null;
    }
    public int getInfo()
    {
        return info;
    }
    public void setInfo(int info)
    {
        this.info = info;
    }
    public NodoPadre getSig()
    {
        return sig;
    }
    public void setSig(NodoPadre sig)
    {
        this.sig = sig;
    }
    public NodoHijo getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoHijo abajo)
    {
        this.abajo = abajo;
    }
    
    public NodoHijo getSegundo()
    {
        return segundo;
    }
    public void setSegundo(NodoHijo segundo)
    {
        this.segundo = segundo;
    }
    
}
