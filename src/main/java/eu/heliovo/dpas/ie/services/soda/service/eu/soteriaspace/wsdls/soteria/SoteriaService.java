
package eu.heliovo.dpas.ie.services.soda.service.eu.soteriaspace.wsdls.soteria;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "soteriaService", targetNamespace = "http://soteriaspace.eu/wsdls/soteria", wsdlLocation = "http://soteria.oma.be:8080/JavaServer-war/soteriaService?wsdl")
public class SoteriaService
    extends Service
{

    private final static URL SOTERIASERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(eu.heliovo.dpas.ie.services.soda.service.eu.soteriaspace.wsdls.soteria.SoteriaService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = eu.heliovo.dpas.ie.services.soda.service.eu.soteriaspace.wsdls.soteria.SoteriaService.class.getResource(".");
            url = new URL(baseUrl, "http://soteria.oma.be:8080/JavaServer-war/soteriaService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://soteria.oma.be:8080/JavaServer-war/soteriaService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SOTERIASERVICE_WSDL_LOCATION = url;
    }

    public SoteriaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoteriaService() {
        super(SOTERIASERVICE_WSDL_LOCATION, new QName("http://soteriaspace.eu/wsdls/soteria", "soteriaService"));
    }

    /**
     * 
     * @return
     *     returns SoteriaPort
     */
    @WebEndpoint(name = "soteriaPort")
    public SoteriaPort getSoteriaPort() {
        return super.getPort(new QName("http://soteriaspace.eu/wsdls/soteria", "soteriaPort"), SoteriaPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoteriaPort
     */
    @WebEndpoint(name = "soteriaPort")
    public SoteriaPort getSoteriaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soteriaspace.eu/wsdls/soteria", "soteriaPort"), SoteriaPort.class, features);
    }

}
