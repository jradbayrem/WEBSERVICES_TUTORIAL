package fr.adaming.soap;

import javax.jws.WebService;


@WebService(endpointInterface="fr.adaming.soap.CalWebService",
portName="MonWebServicePort",
serviceName="WebServiceTomcat")
public class CalWebServiceImpl implements CalWebService {

	

	@Override
	 public int add(int a,int b) {
		return a+b; 
	}  
		  
}
