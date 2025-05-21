import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
        EntityManager em = emf.createEntityManager();
        System.out.println("Conexión a ObjectDB exitosa");

        em.close();
        emf.close();
    }
}
