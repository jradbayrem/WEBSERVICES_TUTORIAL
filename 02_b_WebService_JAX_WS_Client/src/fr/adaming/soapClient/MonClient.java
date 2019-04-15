package fr.adaming.soapClient;

import fr.adaming.saop.BanqueService;
import fr.adaming.saop.BanqueWS;

public class MonClient {
	
	
	public static void main(String[] args){
		BanqueWS stub=new BanqueWS();
		
		BanqueService banqueService=stub.getBanqueServicePort();
		
		System.out.println(banqueService.conversionEuroDinar(20000));
		
		System.out.println(banqueService.disBonjour());
	}
	
}
