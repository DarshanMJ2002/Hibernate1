package hibernate.demo10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Employee e1=new Employee();
		e1.setEname("darshan");
		e1.setEsal(38000.56);
		
//		t.begin();
//		m.persist(e1);
//		t.commit();
//		
//		update
//		Employee e2=m.find(Employee.class, 1);
//		e2.setEname("megs");
//		t.begin();
//		m.merge(e2);
//		t.commit();
		
//		delete
		
		Employee e2=m.find(Employee.class, 1);
		
		t.begin();
		m.remove(e2);
		t.commit();

		
	}

}
