package net.scero.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.sun.xml.ws.developer.SchemaValidation;
import net.scero.model.RequestExample;
import net.scero.model.ResponseExample;

@WebService(name = "MessagingWS", serviceName = "MessagingWS", targetNamespace = "http://com.aam.jaxws.server/")
public class WebserviceApi {
	@WebMethod
	@WebResult(name = "responseExample")
	public ResponseExample operationExample(@WebParam(name = "requestExample") RequestExample requestExample) {
		ResponseExample responseExample = new ResponseExample();
		requestExample.setOperation(requestExample.getOperation());
		responseExample.setMessage(new StringBuilder().append("Procesado: ").append(requestExample.getValue()).toString());
		responseExample.setResult(0);
		return responseExample;
	}
}
