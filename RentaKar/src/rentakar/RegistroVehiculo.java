package rentakar;

import java.util.ArrayList;

public class RegistroVehiculo {
    private ArrayList<Vehiculo> lista = new ArrayList<>();
    
    public Vehiculo buscar(int num){
        for (Vehiculo vehiculo : lista) {
            if(vehiculo.codigo == num )
                return vehiculo;
        }
        return null;
    }
    
    public boolean agregar(Vehiculo veh){
        if(buscar(veh.codigo) == null)
            return lista.add(veh);
        return false;
    }
    
    public String listar(){
        String txt = "VEHICULOS EN ARRIENDO\n";
        for (Vehiculo vehiculo : lista) {
            txt += vehiculo + "\n";
        }
        return txt;
    }
    
    public String listarXelectrico(){
        String txt = "VEHICULOS ELECTRICOS\n";
        for (Vehiculo vehiculo : lista) {
            if(vehiculo.esElectrico == true)
                txt += vehiculo + "\n";
        }
        return txt;
    }
    
    public String listarXdias(){
        String txt = "VEHICULOS QUE HAN SIDO\n ARRENDADOS MAS DE 7 DIAS\n";
        for(Vehiculo vehiculo : lista){
            if(vehiculo.diasArrendado >= 7)
                txt += vehiculo + "\n";
        }
        return txt;
    }
    
}


