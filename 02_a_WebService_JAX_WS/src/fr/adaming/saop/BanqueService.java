package fr.adaming.saop;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import fr.adaming.model.Compte;

@WebService(serviceName="BanqueWS")
public class BanqueService {

	@WebMethod(operationName="conversionEuroDinar")
	public double conversion(@WebParam(name="montant")double mnt){
		return mnt*3.34;
	}
	
	@WebMethod
	public String disBonjour(){
		return "Bonjour";
	}
	
	@
	WebMethod
	public Compte getCompte(@WebParam(name="code")int code){
	return new Compte (code,"nomane",2000);
	}
	@WebMethod
	public List<Compte> getComptes(){
	List<Compte> cptes=new ArrayList<Compte>();
	cptes.add (new Compte (1,"TOTO",3000));
	cptes.add (new Compte (2,"TITI",7000));
	return cptes;
	}
	

}
