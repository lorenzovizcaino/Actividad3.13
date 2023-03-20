package modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class PersonaContacto implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dni", nullable = false)
    private Persona persona;

    public PersonaContacto() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
