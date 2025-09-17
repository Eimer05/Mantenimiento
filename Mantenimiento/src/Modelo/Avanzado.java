
package Modelo;

public class Avanzado extends Mantenimiento{

    public Avanzado(String nombre, String cedula, String fechaRegistro) {
        super(nombre, cedula, fechaRegistro);
    }
    
    
    @Override
    public String tipoMant() {
        return " Predictivo";
    }

    @Override
    public String detalles() {
        return "Monitoreo constatnte para anticipar fallas en el equipo";
    }

    @Override
    public double precio() {
        return 20;
    }
    
}
