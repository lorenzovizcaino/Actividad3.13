package modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name = "personaId")
public class Alumno extends Persona implements Serializable {
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="persona")
    private Persona personaContacto;

    public Alumno() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getPersona() {
        return personaContacto;
    }

    public void setPersona(Persona personaContacto) {
        this.personaContacto = personaContacto;
    }


    @Override
    public String toString() {
        return "Alumno{" +super.toString()+
                "email='" + email + '\'' +
                '}';
    }
}
