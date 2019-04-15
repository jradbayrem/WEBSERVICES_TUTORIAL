package fr.adaming.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface CalWebService {

	@WebMethod public int add(int a,int b);
}