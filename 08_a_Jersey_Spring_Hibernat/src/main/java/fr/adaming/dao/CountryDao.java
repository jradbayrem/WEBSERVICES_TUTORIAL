package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Country;

@Repository
public class CountryDao implements ICountryDao {

	@Autowired
	private SessionFactory sf;
	
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Country> getAllCountries() {
		String req="FROM Country";
		Session s=sf.getCurrentSession();
		Query query=s.createQuery(req);
		return query.list();
	}

	@Override
	public Country getCountry(int id) {
		String req="FROM Country c WHERE c.id=:id_c";
		Session s=sf.getCurrentSession();
		Query query=s.createQuery(req);
		query.setParameter("id_c", id);
		return (Country) query.uniqueResult();
	}

	@Override
	public Country addCountry(Country country) {
		Session s=sf.getCurrentSession();
		s.save(country);
		return country;
	}

	@Override
	public Country updateCountry(Country country) {
		Session s=sf.getCurrentSession();
		s.saveOrUpdate(country);
		return country;
	}

	@Override
	public void deleteCountry(int id) {
		Session s=sf.getCurrentSession();
		Country c=(Country) s.get(Country.class, id);
		s.delete(c);

	}

}
