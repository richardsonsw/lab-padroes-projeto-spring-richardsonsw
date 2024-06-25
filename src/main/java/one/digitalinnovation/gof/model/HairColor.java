package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HairColor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String color;
	
	public HairColor() {}
	public HairColor(String color) {
		super();
		this.color = color;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
