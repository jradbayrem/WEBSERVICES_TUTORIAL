package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Country;

public interface ICountryService {

	public List<Country> getAllCountries();
	
	public Country getCountry(int id);
	
	public Country addCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public void deleteCountry(int id);
	
	
}
