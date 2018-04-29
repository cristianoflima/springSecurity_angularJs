package ie.cflima.spr_sec_angular_js.rest;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ie.cflima.spr_sec_angular_js.model.Greeting;

@RestController
public class GreetingREST {
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")	
	public Greeting greetin() {
		return new Greeting(UUID.randomUUID().toString(), "Pagina Index com AngularJS 1.6.X consultando REST");
	}

}
