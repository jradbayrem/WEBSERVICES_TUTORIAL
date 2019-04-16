package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Country;

public interface ICountryDao {

public List<Country> getAllCountries();
	
	public Country getCountry(int id);
	
	public Country addCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public void deleteCountry(int id);
}
