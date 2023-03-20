package modelo.services;

import modelo.Persona;

import java.util.List;

public interface IPersonasServicios {

    public Persona AddPersona(Persona persona);

    List<Persona> listarPersonas();
}
