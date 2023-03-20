package modelo.services;

import modelo.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class PersonasServicios implements IPersonasServicios{
    @Override
    public Persona AddPersona(Persona persona) {
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();
        Transaction tx=null;
        try(Session session=sessionFactory.openSession()){
            tx=session.beginTransaction();
            session.save(persona);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("Ha ocurrido una exception: " + ex.getMessage());

            if (tx != null) {
                tx.rollback();
            }
            persona=null;
        }
        return persona;
        }

    @Override
    public List<Persona> listarPersonas() {
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();
        Transaction tx=null;
        List<Persona> personas = new ArrayList<>();
        try(Session session=sessionFactory.openSession()){
            tx=session.beginTransaction();
            personas=session.createQuery("SELECT p FROM Persona p ORDER BY p.nombre").list();
            tx.commit();
        }catch (Exception ex) {
            System.out.println("Ha ocurrido una exception: " + ex.getMessage());
            if (tx != null) {
                tx.rollback();
            }

        }
        return personas;
    }
}

