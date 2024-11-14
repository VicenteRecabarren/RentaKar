package rentakar;

public abstract class Vehiculo implements iDescontable {
    protected int codigo;
    protected String patente;
    protected boolean esElectrico;
    protected double precioDia;
    protected int diasArrendado;

    public Vehiculo() {
    }

    public Vehiculo(int codigo, String patente, boolean esElectrico, double precioDia, int diasArrendado) {
        this.codigo = codigo;
        this.patente = patente;
        this.esElectrico = esElectrico;
        this.precioDia = precioDia;
        this.diasArrendado = diasArrendado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getDiasArrendado() {
        return diasArrendado;
    }

    public void setDiasArrendado(int diasArrendado) {
        this.diasArrendado = diasArrendado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", patente=" + patente + ", esElectrico=" + esElectrico + ", precioDia=" + precioDia + ", diasArrendado=" + diasArrendado + '}';
    } 
}
