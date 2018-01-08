
package net.scero.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.scero.model.ResponseExample;

@XmlRootElement(name = "operationExampleResponse", namespace = "http://com.aam.jaxws.server/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationExampleResponse", namespace = "http://com.aam.jaxws.server/")
public class OperationExampleResponse {

    @XmlElement(name = "responseExample", namespace = "")
    private ResponseExample responseExample;

    /**
     * 
     * @return
     *     returns ResponseExample
     */
    public ResponseExample getResponseExample() {
        return this.responseExample;
    }

    /**
     * 
     * @param responseExample
     *     the value for the responseExample property
     */
    public void setResponseExample(ResponseExample responseExample) {
        this.responseExample = responseExample;
    }

}
