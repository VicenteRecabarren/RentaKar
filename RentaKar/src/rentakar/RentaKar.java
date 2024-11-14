package rentakar;

public class RentaKar {

    public static void main(String[] args) {
        
        Carga VehCar1 = new Carga(300,101 ,"23-jb-dg", false, 10000, 10);
        Carga VehCar2 = new Carga(400,102 ,"42-ls-lk", true, 15000, 8);
        Carga VehCar3 = new Carga(200,103 ,"63-af-vb", false, 8000, 3);
        
        Pasajero VehPas1 = new Pasajero (50, 201, "bd-84-jk", true, 12000, 5);
        Pasajero VehPas2 = new Pasajero (55, 202, "ck-56-ps", false, 10000, 7);
        Pasajero VehPas3 = new Pasajero (45, 203, "ap-42-cj", true, 11000, 6);
        
        System.out.println(VehCar1.boleta());
        System.out.println(VehCar2.boleta());
        System.out.println(VehCar3.boleta());
        System.out.println(VehPas1.boleta());
        System.out.println(VehPas2.boleta());
        System.out.println(VehPas3.boleta());
        
        RegistroVehiculo reg = new RegistroVehiculo();
        
        reg.agregar(VehPas1);
        reg.agregar(VehPas2);
        reg.agregar(VehPas3);
        reg.agregar(VehCar1);
        reg.agregar(VehCar2);
        reg.agregar(VehCar3);
        
        System.out.println(reg.listar());
        System.out.println(reg.listarXelectrico());
        System.out.println(reg.listarXdias());
    }
    
}
