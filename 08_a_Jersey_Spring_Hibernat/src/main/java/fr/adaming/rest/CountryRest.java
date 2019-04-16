package fr.adaming.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.adaming.model.Country;
import fr.adaming.service.ICountryService;


@Component
@Path("/ws")
public class CountryRest {

	@Autowired
	ICountryService countryService;
	
	
	
	@GET
	@Path("/countries")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getAllEmployes(){
		return countryService.getAllCountries();
	}

	
	@GET
	@Path("/country/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id) {
		return countryService.getCountry(id);
	}


	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country) {
		return countryService.addCountry(country);
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Country updateCountry(Country country) {
		return countryService.updateCountry(country);

	}

	@DELETE
	@Path("/country/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@PathParam("id") int id) {
		countryService.deleteCountry(id);

	}

	/*
	 	@DELETE
	@Path("/country")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@FormParam("id") int id) {
		countryService.deleteCountry(id);

	}
	 */
	
}
	

