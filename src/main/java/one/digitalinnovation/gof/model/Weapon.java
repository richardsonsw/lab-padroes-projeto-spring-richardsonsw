package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String weapon;
	
	
	
	public Weapon() {}
	public Weapon(String weapon) {
		super();
		this.weapon = weapon;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	

}
