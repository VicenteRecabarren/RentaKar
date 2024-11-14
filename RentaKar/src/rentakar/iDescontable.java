package rentakar;

public interface iDescontable {
    double IVA = 0.19;
    double DESCUENTO_CARGA = 0.03;
    double DESCUENTO_PASAJEROS = 0.07;
   
    double descuento();
    double impuesto();
    double subtotal();
    String boleta();
}
