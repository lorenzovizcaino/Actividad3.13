package modelo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable {


    @Id
    protected String dni;
    private String nombre;



    public Persona() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
