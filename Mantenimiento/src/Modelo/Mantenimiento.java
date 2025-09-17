
package Modelo;

public abstract class Mantenimiento {
    protected int id;
    protected String nombre;
    protected String cedula;
    protected String fechaRegistro;

    public Mantenimiento(String nombre, String cedula, String fechaRegistro) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaRegistro = fechaRegistro;
    }
    public Mantenimiento(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    public abstract String tipoMant();
    public abstract String detalles();
    public abstract double precio();
    
    
    
}
