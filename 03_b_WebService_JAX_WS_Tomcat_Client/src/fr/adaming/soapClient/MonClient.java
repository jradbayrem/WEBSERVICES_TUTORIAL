package fr.adaming.soapClient;

import fr.adaming.soap.CalWebService;
import fr.adaming.soap.WebServiceTomcat;

public class MonClient {

	public static void main(String[] args) {
		WebServiceTomcat stub = new WebServiceTomcat();

		CalWebService service = stub.getMonWebServicePort();

		System.out.println(service.add(4, 5));
	}

}
