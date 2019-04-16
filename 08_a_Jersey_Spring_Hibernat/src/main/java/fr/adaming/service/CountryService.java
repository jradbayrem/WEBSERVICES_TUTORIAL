package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ICountryDao;
import fr.adaming.model.Country;

@Service
@Transactional
public class CountryService implements ICountryService {

	@Autowired
	private ICountryDao countryDao;

	public void setCountryDao(ICountryDao countryDao) {
		this.countryDao = countryDao;
	}

	@Override
	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	@Override
	public Country getCountry(int id) {
		return countryDao.getCountry(id);
	}

	@Override
	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}

	@Override
	public Country updateCountry(Country country) {
		country= countryDao.updateCountry(country);
		return this.getCountry(country.getId());
	}

	@Override
	public void deleteCountry(int id) {
		countryDao.deleteCountry(id);

	}

}
