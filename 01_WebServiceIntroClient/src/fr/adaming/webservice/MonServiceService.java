/**
 * MonServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.adaming.webservice;

public interface MonServiceService extends javax.xml.rpc.Service {
    public java.lang.String getMonServiceAddress();

    public fr.adaming.webservice.MonService getMonService() throws javax.xml.rpc.ServiceException;

    public fr.adaming.webservice.MonService getMonService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
