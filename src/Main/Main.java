package Main;

import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;
import modelo.services.IPersonasServicios;
import modelo.services.PersonasServicios;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static IPersonasServicios iPersonasServicios;
    public static void main(String[] args) {
        iPersonasServicios=new PersonasServicios();

        Profesor p1=new Profesor();
        p1.setDni("56342567A");
        p1.setNombre("Alvaro Fernandez");
        p1.setFecha_contratacion(LocalDate.of(2020,10,21));
        iPersonasServicios.AddPersona(p1);

        Alumno a1=new Alumno();
        a1.setDni("56892567S");
        a1.setNombre("Luis Garcia");
        a1.setEmail("luisgarcia@gmail.com");
        //a1.setPersona(p1);
        iPersonasServicios.AddPersona(a1);
        //CUANDO SE INTENTA CREAR UNA MISMA PERSONA COMO PROFESOR Y COMO ALUMNO
        //ERROR: Infracci�n de la restricci�n PRIMARY KEY 'PK__Persona__D87608A6A4569BA4'.
        // No se puede insertar una clave duplicada en el objeto 'dbo.Persona'.
        // El valor de la clave duplicada es (56342567A).

        List<Persona> personas=iPersonasServicios.listarPersonas();
        for (Persona p:personas) {
            System.out.println(p);
        }
    }
}
