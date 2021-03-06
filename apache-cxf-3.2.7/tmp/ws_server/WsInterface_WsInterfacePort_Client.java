
package ws_server;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-28T16:51:53.433+08:00
 * Generated source version: 3.2.7
 *
 */
public final class WsInterface_WsInterfacePort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws_server/", "WsInterfaceService");

    private WsInterface_WsInterfacePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WsInterfaceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        WsInterfaceService ss = new WsInterfaceService(wsdlURL, SERVICE_NAME);
        WsInterface port = ss.getWsInterfacePort();

        {
        System.out.println("Invoking sayHi...");
        java.lang.String _sayHi_arg0 = "";
        java.lang.String _sayHi__return = port.sayHi(_sayHi_arg0);
        System.out.println("sayHi.result=" + _sayHi__return);


        }
        {
        System.out.println("Invoking sayHello...");
        java.lang.String _sayHello_arg0 = "";
        java.lang.String _sayHello__return = port.sayHello(_sayHello_arg0);
        System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}
