package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	/*@ManyToOne
	private Armor armor;
	@ManyToOne
	private HairColor hairColor;
	@OneToOne
	private HairType hairType;
	@OneToOne
	private Profession profession;
	@ManyToOne
	private Weapon weapon;*/

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	public HairColor getHairColor() {
		return hairColor;
	}
	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}
	public HairType getHairType() {
		return hairType;
	}
	public void setHairType(HairType hairType) {
		this.hairType = hairType;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}*/
		
}