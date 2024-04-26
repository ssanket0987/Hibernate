package ultility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

	
	
		public static EntityManager getConnect()
		{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
			EntityManager em = factory.createEntityManager();
			return em;
		}
}
