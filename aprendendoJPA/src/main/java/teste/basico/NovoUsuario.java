package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;


public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicativo");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Leo", "Leo@lanche.com.br");


        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O id gerado foi: " + novoUsuario.getId());


        em.close();
        emf.close();


    }
}
