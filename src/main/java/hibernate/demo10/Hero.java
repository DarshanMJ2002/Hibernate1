package hibernate.demo10;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hero {
	@Id
	private long phNo;
	private String name;
	private int age;
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
