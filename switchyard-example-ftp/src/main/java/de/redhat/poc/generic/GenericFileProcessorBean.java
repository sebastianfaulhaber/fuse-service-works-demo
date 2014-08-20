package de.redhat.poc.generic;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(GenericFileProcessor.class)
public class GenericFileProcessorBean implements GenericFileProcessor {
    
	private static final Logger LOGGER = Logger.getLogger(GenericFileProcessorBean.class.getName());
	
	@Inject
    @Reference(value="WriteFileService")
	GenericFileProcessor writeFileService;

	@Inject
    @Reference
	GenericSplitter genericSplitterService;	
	
	@Inject
    @Reference
	GenericZipCreator genericZipCreator;	
	
	@Override
	public void getFileContents(String content) {
		LOGGER.info(">> ENTRY - getFileContents()");
		
		// Split Content
		List<Object> objects = genericSplitterService.split(content);
		
		// Create Zip File from Content
		byte[] zip = genericZipCreator.createZipFileFromText(content);
		
		// Write to FTP
		writeFileService.writeFileContents(objects.toString());
		
		LOGGER.info("<< EXIT - getFileContents()");
	}

	@Override
	public void writeFileContents(String content) {
		LOGGER.info(">> ENTRY - writeFileContents()");
		LOGGER.info("<< EXIT - writeFileContents()");
	}

}
