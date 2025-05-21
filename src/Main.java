import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        // Creamos el gestor de entidades a partir de nuestro archivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
        EntityManager em = emf.createEntityManager();

        // Creamos una transacción
        em.getTransaction().begin();

        // Creamos personas y las guardamos en la base de datos
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Luis", 35);

        // Guardamos las personas en la base de datos
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        // Confirmamos la transacción (guardar de verdad en la base de datos)
        em.getTransaction().commit();

        //Cerramos el gestor de entidades
        em.close();
        emf.close();

        // Mostramos que las personas han dio guardadas en la base de datos.
        System.out.println("Personas guardadas en la base de datos:");
    }
}
