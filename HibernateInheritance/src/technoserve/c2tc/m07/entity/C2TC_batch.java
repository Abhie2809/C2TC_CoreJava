package technoserve.c2tc.m07.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("C2TC_batch")
public class C2TC_batch extends Student {
	private String tech_trainer;
	private String Softskill_trainer;
	public String getTech_trainer() {
		return tech_trainer;
	}
	public void setTech_trainer(String tech_trainer) {
		this.tech_trainer = tech_trainer;
	}
	public String getSoftskill_trainer() {
		return Softskill_trainer;
	}
	public void setSoftskill_trainer(String softskill_trainer) {
		Softskill_trainer = softskill_trainer;
	}
	

}
