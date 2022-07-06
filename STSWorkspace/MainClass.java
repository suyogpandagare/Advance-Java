package study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.StudentEntity;

public class MainClass {
	
public static void main(String[] args) {
		
		SessionFactory sessionFactory =null;
        StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
             // Create MetadataSources
             MetadataSources sources = new MetadataSources(registry);
             // Create Metadata
             Metadata metadata = sources.getMetadataBuilder().build();
             // Create SessionFactory
             sessionFactory= metadata.getSessionFactoryBuilder().build();
        
             Session session = sessionFactory.openSession();
             
             
             StudentEntity obj = new StudentEntity(2,203,"joe","don");
             
             Transaction tx = session.beginTransaction();
             session.save(obj);
             tx.commit();
             
             
             
             
             
             
             
             
             
      

}
}
