package connection;

import javax.persistence.*;

public class ConnectionFactoryBKP {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
