package aplicacao;

import javax.persistence.*;

public class JPA {
    
    public static EntityManagerFactory emf;
    
    public static EntityManager getEM() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(
                    "ProdutosJPAPU");
        }
        
        return emf.createEntityManager();
    }
    
}
