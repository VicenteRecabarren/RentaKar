package rentakar;

public final class Pasajero extends Vehiculo {
    private int cantPasajeros;

    public Pasajero() {
    }

    public Pasajero(int cantPasajeros, int codigo, String patente, boolean esElectrico, double precioDia, int diasArrendado) {
        super(codigo, patente, esElectrico, precioDia, diasArrendado);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + "Pasajero{" + "cantPasajeros=" + cantPasajeros + '}';
    }
    
    @Override
    public double subtotal() {
        double subtotal = precioDia * diasArrendado;
        return subtotal;
    }
    
    @Override
    public double descuento() {
        double descuento = (precioDia * diasArrendado) * iDescontable.DESCUENTO_PASAJEROS;  
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
        String txt = "BOLETA VEHICULO PASAJERO\n";
        txt += "---------------------\n";
        txt += "Patente: " + patente + "\n";
        txt += "Capacidad Pasajeros: " + cantPasajeros + "\n";
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
