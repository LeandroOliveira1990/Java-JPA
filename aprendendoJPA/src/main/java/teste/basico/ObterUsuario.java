package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicativo");
        EntityManager em = emf.createEntityManager();

        Usuario usuario =em.find(Usuario.class,7L);

        System.out.println(usuario.getNome());


        emf.close();
        em.close();
    }
}
