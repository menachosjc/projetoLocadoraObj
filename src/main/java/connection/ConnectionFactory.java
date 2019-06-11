package connection;



import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;



public class ConnectionFactory {
    public ObjectContainer getConnection() {
    	ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "c:/banco");
    	return db;
    }
  
	
    
}
