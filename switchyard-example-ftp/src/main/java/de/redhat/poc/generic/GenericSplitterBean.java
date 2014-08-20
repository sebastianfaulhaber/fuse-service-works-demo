package de.redhat.poc.generic;

import java.util.logging.Logger;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

public class GenericSplitterBean extends RouteBuilder {

	private static final Logger LOGGER = Logger.getLogger(GenericSplitterBean.class.getName());
	
	DataFormat bindy = new BindyCsvDataFormat("de.redhat.poc.dto");
	
	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://GenericSplitter")
			.log("Received message for 'GenericSplitter': ${body}")
			.unmarshal(bindy)
			.log("Finished unmarshalling.")
			.end();
	}

}
