
package Modelo;

public class Basico extends Mantenimiento{

    public Basico(String nombre, String cedula, String fechaRegistro) {
        super( nombre, cedula, fechaRegistro);
    }
    
    

    @Override
    public String tipoMant() {
        return " Preventivo";
    }

    @Override
    public String detalles() {
        return "Limpieza interna y externa del pc";
    }

    @Override
    public double precio() {
        return 8;
    }
    
    
    
}
