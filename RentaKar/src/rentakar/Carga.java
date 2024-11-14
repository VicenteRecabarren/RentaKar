package rentakar;

public final class Carga extends Vehiculo {
    private int cantKilos;

    public Carga() {
    }

    public Carga(int cantKilos, int codigo, String patente, boolean esElectrico, double precioDia, int diasArrendado) {
        super(codigo, patente, esElectrico, precioDia, diasArrendado);
        this.cantKilos = cantKilos;
    }

    public int getCantKilos() {
        return cantKilos;
    }

    public void setCantKilos(int cantKilos) {
        this.cantKilos = cantKilos;
    }

    @Override
    public String toString() {
        return super.toString() + "Carga{" + "cantKilos=" + cantKilos + '}';
    }

    
    @Override
    public double subtotal() {
        double subtotal = precioDia * diasArrendado;
        return subtotal;
    }

    @Override
    public double descuento() {
        double descuento = (precioDia * diasArrendado) * iDescontable.DESCUENTO_CARGA;   
        return descuento;
    }

    @Override
    public double impuesto() {
        double impuesto = (precioDia * diasArrendado) * iDescontable.IVA;
        return impuesto;
    }
 
    @Override
    public String boleta() {
        double total = (subtotal() + impuesto()) - descuento();
        String txt = "BOLETA VEHICULO CARGA\n";
        txt += "---------------------\n";
        txt += "Patente: " + patente + "\n";
        txt += "Capacidad Kg.: " + cantKilos + "\n";
        txt += "Precio x dia: " + precioDia + "\n";
        txt += "Dias arrendado: " + diasArrendado + "\n";
        txt += "Descuento: " + descuento() + "\n";
        txt += "IVA: " + impuesto() + "\n";
        txt += "subtotal: " + subtotal() + "\n";
        txt += "Precio Final: " + total + "\n";
        txt += "---------------------\n";
        return txt;
    }
}
