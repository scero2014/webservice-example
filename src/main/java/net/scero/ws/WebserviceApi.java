package net.scero.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.sun.xml.internal.ws.developer.SchemaValidation;
import net.scero.model.RequestExample;
import net.scero.model.ResponseExample;

@SchemaValidation
@WebService(name = "MessagingWS")
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
