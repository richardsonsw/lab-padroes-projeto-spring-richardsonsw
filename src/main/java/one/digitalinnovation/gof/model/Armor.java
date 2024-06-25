package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Armor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String armor;
	
	public Armor() {}
	public Armor(String armor) {
		super();
		this.armor = armor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}
	
	

}


enum ArmorEnum {
	BASIC, MEDIUM, PREMIUM
}