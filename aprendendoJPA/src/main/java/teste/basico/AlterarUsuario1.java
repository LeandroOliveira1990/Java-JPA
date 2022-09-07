package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class AlterarUsuario1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicativo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,8);
        usuario.setNome("Leonardo");
        usuario.setEmail("leonardo@lanche.com.br");
        em.merge(usuario);

        em.getTransaction().commit();


        emf.close();
        em.close();
    }
}
