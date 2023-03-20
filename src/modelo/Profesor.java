package modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn (name = "personaId")
public class Profesor extends Persona implements Serializable {
    private LocalDate fecha_contratacion;

    public Profesor() {
    }

    public LocalDate getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(LocalDate fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    @Override
    public String toString() {
        return "Profesor{" +super.toString()+
                "fecha_contratacion=" + fecha_contratacion +
                '}';
    }
}
