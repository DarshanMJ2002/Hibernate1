package hibernate.demo10;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass2 {
	public static void main(String[] args) throws IOException {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee1 employee1=new Employee1();
		employee1.setEname("darshh");
		employee1.setEsal(38000.56);
		
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\USER\\Pictures//scr.png");
		byte[] arr=new byte[fileInputStream.available()];
		fileInputStream.read(arr);
		employee1.setImg(arr);
		
		
//		entityTransaction.begin();
//		entityManager.persist(employee1);
//		entityTransaction.commit();
		
//		update
		Employee1 emp2 = entityManager.find(Employee1.class, 2);
		emp2.setEsal(78000.78);
		entityTransaction.begin();
		entityManager.merge(emp2);
		entityTransaction.commit();
		
		
	}

}
