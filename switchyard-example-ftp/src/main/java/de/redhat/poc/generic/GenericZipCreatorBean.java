package de.redhat.poc.generic;

import org.apache.camel.builder.RouteBuilder;

public class GenericZipCreatorBean extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://GenericZipCreator")
			.marshal().zip();
	}

}
