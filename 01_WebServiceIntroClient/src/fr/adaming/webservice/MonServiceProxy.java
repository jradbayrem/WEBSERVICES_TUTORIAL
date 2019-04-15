package fr.adaming.webservice;

public class MonServiceProxy implements fr.adaming.webservice.MonService {
  private String _endpoint = null;
  private fr.adaming.webservice.MonService monService = null;
  
  public MonServiceProxy() {
    _initMonServiceProxy();
  }
  
  public MonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMonServiceProxy();
  }
  
  private void _initMonServiceProxy() {
    try {
      monService = (new fr.adaming.webservice.MonServiceServiceLocator()).getMonService();
      if (monService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)monService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)monService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (monService != null)
      ((javax.xml.rpc.Stub)monService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.adaming.webservice.MonService getMonService() {
    if (monService == null)
      _initMonServiceProxy();
    return monService;
  }
  
  public java.lang.String disBonjour(java.lang.String nom) throws java.rmi.RemoteException{
    if (monService == null)
      _initMonServiceProxy();
    return monService.disBonjour(nom);
  }
  
  
}