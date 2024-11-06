package hibernate.demo10;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity

public class Employee1 {
	@Id
	@GeneratedValue
	private int eid;
	@Column(nullable=false)
	private String ename;
	@Column(unique = true)
	private double esal;
	@CreationTimestamp
	private Date objectCreationTime;
	@Lob
	private byte[] img;
	@UpdateTimestamp
	private Date objectUpdatedTime;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Date getObjectCreationTime() {
		return objectCreationTime;
	}
	public void setObjectCreationTime(Date objectCreationTime) {
		this.objectCreationTime = objectCreationTime;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public Date getObjectUpdatedTime() {
		return objectUpdatedTime;
	}
	public void setObjectUpdatedTime(Date objectUpdatedTime) {
		this.objectUpdatedTime = objectUpdatedTime;
	}
	
	

}
