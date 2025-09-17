package Vista;

import Controlador.MantenimientoDAO;
import Modelo.Avanzado;
import Modelo.Basico;
import Modelo.Medio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la fecha de registro: ");
        String fechaRegistro = sc.nextLine();
        System.out.print("Ingresar numero de cedula: ");
        String cedula = sc.nextLine();

        System.out.println("1. Mantenimietno Basico");
        System.out.println("2. Mantenimietno Medio");
        System.out.println("3. Mantenimietno Avanzado");
        System.out.print("Ingrese el tipo de mantenimiento que desea: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                MostrarDatos(opcion, nombre, cedula, fechaRegistro);
                break;
            case 2:
                MostrarDatos(opcion, nombre, cedula, fechaRegistro);
                break;
            case 3:
                MostrarDatos(opcion, nombre, cedula, fechaRegistro);
                break;
            default:
                System.err.println("Pilas mi cholo...");
                break;
        }

        /*
        Basico b = new Basico(1, "27/12/2024", "1950064588", "Eimer Armijos");
        b.tipoMant();
        b.detalles();
        b.precio();

        Medio m = new Medio(2, "21/01/2025", "100475169", "Mercy Paucar");
        m.tipoMant();
        m.detalles();
        m.precio();

        Avanzado a = new Avanzado(3, "04/08/2025", "11092404", "Jose Balcazar");
        a.tipoMant();
        a.detalles();
        a.precio();*/
    }

    public static void MostrarDatos(int opcion, String nombre, String cedula, String fechaRegistro) {
        switch (opcion) {
            case 1:
                Basico b = new Basico(nombre, cedula, fechaRegistro);
                b.tipoMant();
                b.detalles();
                b.precio();
                MantenimientoDAO mdao = new MantenimientoDAO();
                mdao.registrarMantenimiento(b);
                System.out.println("================");
                System.out.println("ID: " + b.getId());
                System.out.println("Cliente: " + b.getNombre());
                System.out.println("Cedula: " + b.getCedula());
                System.out.println("Tipo de Mantenimiento: " + b.tipoMant());
                System.out.println("Fecha de Registro: " + b.getFechaRegistro());
                System.out.println("Detalles de Mantenimiento: " + b.detalles());
                System.out.println("Costo de mantenimiento: $" + b.precio());
                System.out.println("================");

                break;
            case 2:
                Medio m = new Medio(nombre, cedula, fechaRegistro);
                m.tipoMant();
                m.detalles();
                m.precio();
                System.out.println("================");
                System.out.println("ID: " + m.getId());
                System.out.println("Cliente: " + m.getNombre());
                System.out.println("Cedula: " + m.getCedula());
                System.out.println("Tipo de Mantenimiento: " + m.tipoMant());
                System.out.println("Fecha de Registro: " + m.getFechaRegistro());
                System.out.println("Detalles de Mantenimiento: " + m.detalles());
                System.out.println("Costo de mantenimiento: $" + m.precio());
                System.out.println("================");
                break;
            case 3:
                Avanzado a = new Avanzado(nombre, cedula, fechaRegistro);
                a.tipoMant();
                a.detalles();
                a.precio();
                System.out.println("================");
                System.out.println("ID: " + a.getId());
                System.out.println("Cliente: " + a.getNombre());
                System.out.println("Cedula: " + a.getCedula());
                System.out.println("Tipo de Mantenimiento: " + a.tipoMant());
                System.out.println("Fecha de Registro: " + a.getFechaRegistro());
                System.out.println("Detalles de Mantenimiento: " + a.detalles());
                System.out.println("Costo de mantenimiento: $" + a.precio());
                System.out.println("================");
                break;
            default:
                System.err.println("Error: Ingresa un numero valido.");
                break;
        }

    }

}
