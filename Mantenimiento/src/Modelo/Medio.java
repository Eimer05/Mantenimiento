
package Modelo;

public class Medio extends Mantenimiento{

    public Medio(String nombre, String cedula, String fechaRegistro) {
        super(nombre, cedula, fechaRegistro);
    }
    
    

    @Override
    public String tipoMant() {
        return " Correctivo";
    }

    @Override
    public String detalles() {
        return "Reparacion de algun componente defectuoso";
    }

    @Override
    public double precio() {
        return 15;
    }
    
}
