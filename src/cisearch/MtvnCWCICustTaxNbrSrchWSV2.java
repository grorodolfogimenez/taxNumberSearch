package cisearch;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-09T09:04:30.571-04:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "mtvnCWCICustTaxNbrSrchWSV2", 
                  wsdlLocation = "resources/com/integration/ibs/CICustTaxNbrSrchWSV2.wsdl",
                  targetNamespace = "mtvnCICustTaxNbrSrchWSV2") 
public class MtvnCWCICustTaxNbrSrchWSV2 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("mtvnCICustTaxNbrSrchWSV2", "mtvnCWCICustTaxNbrSrchWSV2");
    public final static QName MtvnCWCICustTaxNbrSrchWSV2Port = new QName("mtvnCICustTaxNbrSrchWSV2", "mtvnCWCICustTaxNbrSrchWSV2Port");
    static {
        URL url = null;
        try {
            url = new URL("com/integration/ibs/CICustTaxNbrSrchWSV2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MtvnCWCICustTaxNbrSrchWSV2.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "CICustTaxNbrSrchWSV2.wsdl");
        }
        WSDL_LOCATION = MtvnCWCICustTaxNbrSrchWSV2.WSDL_LOCATION;
    }

    public MtvnCWCICustTaxNbrSrchWSV2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MtvnCWCICustTaxNbrSrchWSV2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MtvnCWCICustTaxNbrSrchWSV2() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MtvnCWCICustTaxNbrSrchWSV2(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MtvnCWCICustTaxNbrSrchWSV2(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MtvnCWCICustTaxNbrSrchWSV2(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MtvnCWCICustTaxNbrSrchWSV2Interface
     */
    @WebEndpoint(name = "mtvnCWCICustTaxNbrSrchWSV2Port")
    public MtvnCWCICustTaxNbrSrchWSV2Interface getMtvnCWCICustTaxNbrSrchWSV2Port() {
        return super.getPort(MtvnCWCICustTaxNbrSrchWSV2Port, MtvnCWCICustTaxNbrSrchWSV2Interface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MtvnCWCICustTaxNbrSrchWSV2Interface
     */
    @WebEndpoint(name = "mtvnCWCICustTaxNbrSrchWSV2Port")
    public MtvnCWCICustTaxNbrSrchWSV2Interface getMtvnCWCICustTaxNbrSrchWSV2Port(WebServiceFeature... features) {
        return super.getPort(MtvnCWCICustTaxNbrSrchWSV2Port, MtvnCWCICustTaxNbrSrchWSV2Interface.class, features);
    }

}