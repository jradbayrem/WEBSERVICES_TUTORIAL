/**
 * MonServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.adaming.webservice;

public class MonServiceServiceLocator extends org.apache.axis.client.Service implements fr.adaming.webservice.MonServiceService {

    public MonServiceServiceLocator() {
    }


    public MonServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MonServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MonService
    private java.lang.String MonService_address = "http://localhost:8080/01_WebServiceIntro/services/MonService";

    public java.lang.String getMonServiceAddress() {
        return MonService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MonServiceWSDDServiceName = "MonService";

    public java.lang.String getMonServiceWSDDServiceName() {
        return MonServiceWSDDServiceName;
    }

    public void setMonServiceWSDDServiceName(java.lang.String name) {
        MonServiceWSDDServiceName = name;
    }

    public fr.adaming.webservice.MonService getMonService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MonService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMonService(endpoint);
    }

    public fr.adaming.webservice.MonService getMonService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.adaming.webservice.MonServiceSoapBindingStub _stub = new fr.adaming.webservice.MonServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMonServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMonServiceEndpointAddress(java.lang.String address) {
        MonService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.adaming.webservice.MonService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.adaming.webservice.MonServiceSoapBindingStub _stub = new fr.adaming.webservice.MonServiceSoapBindingStub(new java.net.URL(MonService_address), this);
                _stub.setPortName(getMonServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MonService".equals(inputPortName)) {
            return getMonService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.adaming.fr", "MonServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.adaming.fr", "MonService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MonService".equals(portName)) {
            setMonServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
