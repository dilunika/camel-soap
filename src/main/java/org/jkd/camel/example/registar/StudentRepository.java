package org.jkd.camel.example.registar;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepository.class);
	
	public Properties getStudentDetails(final String query){
		
		LOGGER.info("Query : {}",query);
		
		final Properties info = new Properties();
		info.setProperty("nic", "8491909183V");
		info.setProperty("name", "Kasun Dilunika");
		info.setProperty("registrationNumber", "05023235");
		info.setProperty("dob", "24-07-1984");
		
		return info;
	}
}
