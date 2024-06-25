package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String profession;
	
	
	
	public Profession() {}
	public Profession(String profession) {
		super();
		this.profession = profession;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	

}
