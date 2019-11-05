package ws_server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-28T16:51:53.668+08:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "WsInterfaceService",
                  wsdlLocation = "http://localhost:8080/ws_server/ws/sayhi?wsdl",
                  targetNamespace = "http://ws_server/")
public class WsInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws_server/", "WsInterfaceService");
    public final static QName WsInterfacePort = new QName("http://ws_server/", "WsInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws_server/ws/sayhi?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws_server/ws/sayhi?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WsInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WsInterface
     */
    @WebEndpoint(name = "WsInterfacePort")
    public WsInterface getWsInterfacePort() {
        return super.getPort(WsInterfacePort, WsInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsInterface
     */
    @WebEndpoint(name = "WsInterfacePort")
    public WsInterface getWsInterfacePort(WebServiceFeature... features) {
        return super.getPort(WsInterfacePort, WsInterface.class, features);
    }

}
