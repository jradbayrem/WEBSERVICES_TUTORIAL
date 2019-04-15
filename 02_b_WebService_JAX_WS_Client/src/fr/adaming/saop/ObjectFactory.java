
package fr.adaming.saop;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.adaming.saop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DisBonjourResponse_QNAME = new QName("http://saop.adaming.fr/", "disBonjourResponse");
    private final static QName _ConversionEuroDinarResponse_QNAME = new QName("http://saop.adaming.fr/", "conversionEuroDinarResponse");
    private final static QName _DisBonjour_QNAME = new QName("http://saop.adaming.fr/", "disBonjour");
    private final static QName _ConversionEuroDinar_QNAME = new QName("http://saop.adaming.fr/", "conversionEuroDinar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.adaming.saop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroDinar }
     * 
     */
    public ConversionEuroDinar createConversionEuroDinar() {
        return new ConversionEuroDinar();
    }

    /**
     * Create an instance of {@link ConversionEuroDinarResponse }
     * 
     */
    public ConversionEuroDinarResponse createConversionEuroDinarResponse() {
        return new ConversionEuroDinarResponse();
    }

    /**
     * Create an instance of {@link DisBonjour }
     * 
     */
    public DisBonjour createDisBonjour() {
        return new DisBonjour();
    }

    /**
     * Create an instance of {@link DisBonjourResponse }
     * 
     */
    public DisBonjourResponse createDisBonjourResponse() {
        return new DisBonjourResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisBonjourResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saop.adaming.fr/", name = "disBonjourResponse")
    public JAXBElement<DisBonjourResponse> createDisBonjourResponse(DisBonjourResponse value) {
        return new JAXBElement<DisBonjourResponse>(_DisBonjourResponse_QNAME, DisBonjourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDinarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saop.adaming.fr/", name = "conversionEuroDinarResponse")
    public JAXBElement<ConversionEuroDinarResponse> createConversionEuroDinarResponse(ConversionEuroDinarResponse value) {
        return new JAXBElement<ConversionEuroDinarResponse>(_ConversionEuroDinarResponse_QNAME, ConversionEuroDinarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisBonjour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saop.adaming.fr/", name = "disBonjour")
    public JAXBElement<DisBonjour> createDisBonjour(DisBonjour value) {
        return new JAXBElement<DisBonjour>(_DisBonjour_QNAME, DisBonjour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDinar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saop.adaming.fr/", name = "conversionEuroDinar")
    public JAXBElement<ConversionEuroDinar> createConversionEuroDinar(ConversionEuroDinar value) {
        return new JAXBElement<ConversionEuroDinar>(_ConversionEuroDinar_QNAME, ConversionEuroDinar.class, null, value);
    }

}
