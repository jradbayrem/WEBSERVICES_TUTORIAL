package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Produces("application/json")
@Entity
@Table(name="countries")
@XmlRootElement
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String countryName;
	long population;

	public Country() {
		super();
	}

	public Country(int i, String countryName, long population) {
		super();
		this.id = i;
		this.countryName = countryName;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}
