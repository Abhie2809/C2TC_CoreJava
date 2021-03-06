package technoserve.c2tc.m07.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy= InheritanceType.JOINED)
//@DiscriminatorColumn(name="Student", discriminatorType = DiscriminatorType.STRING)
public class Student implements Serializable {
	@Id
	private int uid;
	@Column(name="name")
	private String name;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	

}
