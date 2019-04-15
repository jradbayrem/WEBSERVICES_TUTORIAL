package fr.adaming.server;

import javax.xml.ws.Endpoint;

import fr.adaming.saop.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		String uri="http://localhost:8880/";
		
		Endpoint.publish(uri, new BanqueService());
System.out.println(uri);
	}

}
