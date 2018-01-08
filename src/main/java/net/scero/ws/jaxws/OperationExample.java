
package net.scero.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.scero.model.RequestExample;

@XmlRootElement(name = "operationExample", namespace = "http://com.aam.jaxws.server/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationExample", namespace = "http://com.aam.jaxws.server/")
public class OperationExample {

    @XmlElement(name = "requestExample", namespace = "")
    private RequestExample requestExample;

    /**
     * 
     * @return
     *     returns RequestExample
     */
    public RequestExample getRequestExample() {
        return this.requestExample;
    }

    /**
     * 
     * @param requestExample
     *     the value for the requestExample property
     */
    public void setRequestExample(RequestExample requestExample) {
        this.requestExample = requestExample;
    }

}
