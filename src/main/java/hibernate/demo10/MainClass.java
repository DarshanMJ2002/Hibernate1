package hibernate.demo10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		Hero d=new Hero();
		d.setAge(65);
		d.setName("ramesh");
		d.setPhNo(7123456789l);
		
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
//		t.begin();
//		m.persist(d);
//		t.commit();
		
		Hero h=m.find(Hero.class, 725935813l);
		System.out.println(h.getAge()+" "+h.getName()+" "+h.getPhNo());
	}

}
