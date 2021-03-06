
package jp.co.techmatrix.store.services.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookStore", targetNamespace = "http://impl.services.store.techmatrix.co.jp/", wsdlLocation = "http://Pana-I3340-18:8080/BookStore/Search?wsdl")
public class BookStore
    extends Service
{

    private final static URL BOOKSTORE_WSDL_LOCATION;
    private final static WebServiceException BOOKSTORE_EXCEPTION;
    private final static QName BOOKSTORE_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "BookStore");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://Pana-I3340-18:8080/BookStore/Search?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSTORE_WSDL_LOCATION = url;
        BOOKSTORE_EXCEPTION = e;
    }

    public BookStore() {
        super(__getWsdlLocation(), BOOKSTORE_QNAME);
    }

    public BookStore(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSTORE_QNAME, features);
    }

    public BookStore(URL wsdlLocation) {
        super(wsdlLocation, BOOKSTORE_QNAME);
    }

    public BookStore(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSTORE_QNAME, features);
    }

    public BookStore(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookStore(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Search
     */
    @WebEndpoint(name = "SearchPort")
    public Search getSearchPort() {
        return super.getPort(new QName("http://impl.services.store.techmatrix.co.jp/", "SearchPort"), Search.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Search
     */
    @WebEndpoint(name = "SearchPort")
    public Search getSearchPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.store.techmatrix.co.jp/", "SearchPort"), Search.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSTORE_EXCEPTION!= null) {
            throw BOOKSTORE_EXCEPTION;
        }
        return BOOKSTORE_WSDL_LOCATION;
    }

}
